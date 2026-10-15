package com.springbootkafkazookeeper.kafka;

import com.springbootkafkazookeeper.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics ="java-json",groupId = "myGroup")
    public void consumer(User user)//Spring kafka provided JsonDeserializer will convert User Json Object into java user Object
    {
        LOGGER.info(String.format("Json Message received  : %s", user.toString()));
    }
}
