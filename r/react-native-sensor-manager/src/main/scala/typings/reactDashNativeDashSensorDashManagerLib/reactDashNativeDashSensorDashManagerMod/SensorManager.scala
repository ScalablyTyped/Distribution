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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startAccelerometer")(startAccelerometer)
    __obj.updateDynamic("startGyroscope")(startGyroscope)
    __obj.updateDynamic("startLightSensor")(startLightSensor)
    __obj.updateDynamic("startMagnetometer")(startMagnetometer)
    __obj.updateDynamic("startMotionValue")(startMotionValue)
    __obj.updateDynamic("startOrientation")(startOrientation)
    __obj.updateDynamic("startProximity")(startProximity)
    __obj.updateDynamic("startStepCounter")(startStepCounter)
    __obj.updateDynamic("startThermometer")(startThermometer)
    __obj.updateDynamic("stopAccelerometer")(stopAccelerometer)
    __obj.updateDynamic("stopGyroscope")(stopGyroscope)
    __obj.updateDynamic("stopLightSensor")(stopLightSensor)
    __obj.updateDynamic("stopMagnetometer")(stopMagnetometer)
    __obj.updateDynamic("stopMotionValue")(stopMotionValue)
    __obj.updateDynamic("stopOrientation")(stopOrientation)
    __obj.updateDynamic("stopProximity")(stopProximity)
    __obj.updateDynamic("stopStepCounter")(stopStepCounter)
    __obj.updateDynamic("stopThermometer")(stopThermometer)
    __obj.asInstanceOf[SensorManager]
  }
}

