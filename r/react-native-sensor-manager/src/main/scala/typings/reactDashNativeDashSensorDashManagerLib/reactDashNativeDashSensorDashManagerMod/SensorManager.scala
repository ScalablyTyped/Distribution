package typings
package reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorManager extends js.Object {
  def startAccelerometer(delay: scala.Double): scala.Unit
  def startGyroscope(delay: scala.Double): scala.Unit
  def startLightSensor(delay: scala.Double): scala.Unit
  def startMagnetometer(delay: scala.Double): scala.Unit
  def startMotionValue(delay: scala.Double): scala.Unit
  def startOrientation(delay: scala.Double): scala.Unit
  def startProximity(delay: scala.Double): scala.Unit
  def startStepCounter(delay: scala.Double): scala.Unit
  def startThermometer(delay: scala.Double): scala.Unit
  def stopAccelerometer(): scala.Unit
  def stopGyroscope(): scala.Unit
  def stopLightSensor(): scala.Unit
  def stopMagnetometer(): scala.Unit
  def stopMotionValue(): scala.Unit
  def stopOrientation(): scala.Unit
  def stopProximity(): scala.Unit
  def stopStepCounter(): scala.Unit
  def stopThermometer(): scala.Unit
}

object SensorManager {
  @scala.inline
  def apply(
    startAccelerometer: scala.Double => scala.Unit,
    startGyroscope: scala.Double => scala.Unit,
    startLightSensor: scala.Double => scala.Unit,
    startMagnetometer: scala.Double => scala.Unit,
    startMotionValue: scala.Double => scala.Unit,
    startOrientation: scala.Double => scala.Unit,
    startProximity: scala.Double => scala.Unit,
    startStepCounter: scala.Double => scala.Unit,
    startThermometer: scala.Double => scala.Unit,
    stopAccelerometer: () => scala.Unit,
    stopGyroscope: () => scala.Unit,
    stopLightSensor: () => scala.Unit,
    stopMagnetometer: () => scala.Unit,
    stopMotionValue: () => scala.Unit,
    stopOrientation: () => scala.Unit,
    stopProximity: () => scala.Unit,
    stopStepCounter: () => scala.Unit,
    stopThermometer: () => scala.Unit
  ): SensorManager = {
    val __obj = js.Dynamic.literal(startAccelerometer = js.Any.fromFunction1(startAccelerometer), startGyroscope = js.Any.fromFunction1(startGyroscope), startLightSensor = js.Any.fromFunction1(startLightSensor), startMagnetometer = js.Any.fromFunction1(startMagnetometer), startMotionValue = js.Any.fromFunction1(startMotionValue), startOrientation = js.Any.fromFunction1(startOrientation), startProximity = js.Any.fromFunction1(startProximity), startStepCounter = js.Any.fromFunction1(startStepCounter), startThermometer = js.Any.fromFunction1(startThermometer), stopAccelerometer = js.Any.fromFunction0(stopAccelerometer), stopGyroscope = js.Any.fromFunction0(stopGyroscope), stopLightSensor = js.Any.fromFunction0(stopLightSensor), stopMagnetometer = js.Any.fromFunction0(stopMagnetometer), stopMotionValue = js.Any.fromFunction0(stopMotionValue), stopOrientation = js.Any.fromFunction0(stopOrientation), stopProximity = js.Any.fromFunction0(stopProximity), stopStepCounter = js.Any.fromFunction0(stopStepCounter), stopThermometer = js.Any.fromFunction0(stopThermometer))
  
    __obj.asInstanceOf[SensorManager]
  }
}

