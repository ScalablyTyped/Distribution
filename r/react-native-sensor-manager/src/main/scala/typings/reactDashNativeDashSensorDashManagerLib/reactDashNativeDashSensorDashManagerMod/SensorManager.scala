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

