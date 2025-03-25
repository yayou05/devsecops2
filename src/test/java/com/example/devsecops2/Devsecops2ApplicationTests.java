package com.example.devsecops2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Devsecops2ApplicationTests {

	@Test
	void contextLoads() {
		Car car = new Car("AA11BB", "Ferrai", 2000);
		String plateNumber = car.getPlateNumber();
		assertEquals(plateNumber, "AA11BB");
	}

}