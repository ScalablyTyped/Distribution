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
    startAccelerometer: js.Function1[scala.Double, scala.Unit],
    startGyroscope: js.Function1[scala.Double, scala.Unit],
    startLightSensor: js.Function1[scala.Double, scala.Unit],
    startMagnetometer: js.Function1[scala.Double, scala.Unit],
    startMotionValue: js.Function1[scala.Double, scala.Unit],
    startOrientation: js.Function1[scala.Double, scala.Unit],
    startProximity: js.Function1[scala.Double, scala.Unit],
    startStepCounter: js.Function1[scala.Double, scala.Unit],
    startThermometer: js.Function1[scala.Double, scala.Unit],
    stopAccelerometer: js.Function0[scala.Unit],
    stopGyroscope: js.Function0[scala.Unit],
    stopLightSensor: js.Function0[scala.Unit],
    stopMagnetometer: js.Function0[scala.Unit],
    stopMotionValue: js.Function0[scala.Unit],
    stopOrientation: js.Function0[scala.Unit],
    stopProximity: js.Function0[scala.Unit],
    stopStepCounter: js.Function0[scala.Unit],
    stopThermometer: js.Function0[scala.Unit]
  ): SensorManager = {
    val __obj = js.Dynamic.literal(startAccelerometer = startAccelerometer, startGyroscope = startGyroscope, startLightSensor = startLightSensor, startMagnetometer = startMagnetometer, startMotionValue = startMotionValue, startOrientation = startOrientation, startProximity = startProximity, startStepCounter = startStepCounter, startThermometer = startThermometer, stopAccelerometer = stopAccelerometer, stopGyroscope = stopGyroscope, stopLightSensor = stopLightSensor, stopMagnetometer = stopMagnetometer, stopMotionValue = stopMotionValue, stopOrientation = stopOrientation, stopProximity = stopProximity, stopStepCounter = stopStepCounter, stopThermometer = stopThermometer)
  
    __obj.asInstanceOf[SensorManager]
  }
}

