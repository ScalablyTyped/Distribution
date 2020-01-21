package typings.reactNativeSensorManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorManager extends js.Object {
  def startAccelerometer(delay: Double): Unit
  def startGyroscope(delay: Double): Unit
  def startLightSensor(delay: Double): Unit
  def startMagnetometer(delay: Double): Unit
  def startMotionValue(delay: Double): Unit
  def startOrientation(delay: Double): Unit
  def startProximity(delay: Double): Unit
  def startStepCounter(delay: Double): Unit
  def startThermometer(delay: Double): Unit
  def stopAccelerometer(): Unit
  def stopGyroscope(): Unit
  def stopLightSensor(): Unit
  def stopMagnetometer(): Unit
  def stopMotionValue(): Unit
  def stopOrientation(): Unit
  def stopProximity(): Unit
  def stopStepCounter(): Unit
  def stopThermometer(): Unit
}

object SensorManager {
  @scala.inline
  def apply(
    startAccelerometer: Double => Unit,
    startGyroscope: Double => Unit,
    startLightSensor: Double => Unit,
    startMagnetometer: Double => Unit,
    startMotionValue: Double => Unit,
    startOrientation: Double => Unit,
    startProximity: Double => Unit,
    startStepCounter: Double => Unit,
    startThermometer: Double => Unit,
    stopAccelerometer: () => Unit,
    stopGyroscope: () => Unit,
    stopLightSensor: () => Unit,
    stopMagnetometer: () => Unit,
    stopMotionValue: () => Unit,
    stopOrientation: () => Unit,
    stopProximity: () => Unit,
    stopStepCounter: () => Unit,
    stopThermometer: () => Unit
  ): SensorManager = {
    val __obj = js.Dynamic.literal(startAccelerometer = js.Any.fromFunction1(startAccelerometer), startGyroscope = js.Any.fromFunction1(startGyroscope), startLightSensor = js.Any.fromFunction1(startLightSensor), startMagnetometer = js.Any.fromFunction1(startMagnetometer), startMotionValue = js.Any.fromFunction1(startMotionValue), startOrientation = js.Any.fromFunction1(startOrientation), startProximity = js.Any.fromFunction1(startProximity), startStepCounter = js.Any.fromFunction1(startStepCounter), startThermometer = js.Any.fromFunction1(startThermometer), stopAccelerometer = js.Any.fromFunction0(stopAccelerometer), stopGyroscope = js.Any.fromFunction0(stopGyroscope), stopLightSensor = js.Any.fromFunction0(stopLightSensor), stopMagnetometer = js.Any.fromFunction0(stopMagnetometer), stopMotionValue = js.Any.fromFunction0(stopMotionValue), stopOrientation = js.Any.fromFunction0(stopOrientation), stopProximity = js.Any.fromFunction0(stopProximity), stopStepCounter = js.Any.fromFunction0(stopStepCounter), stopThermometer = js.Any.fromFunction0(stopThermometer))
  
    __obj.asInstanceOf[SensorManager]
  }
}

