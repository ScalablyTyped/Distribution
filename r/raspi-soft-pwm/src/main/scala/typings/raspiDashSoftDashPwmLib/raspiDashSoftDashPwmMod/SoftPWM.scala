package typings
package raspiDashSoftDashPwmLib.raspiDashSoftDashPwmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-soft-pwm", "SoftPWM")
@js.native
class SoftPWM protected ()
  extends raspiDashPeripheralLib.raspiDashPeripheralMod.Peripheral {
  def this(config: java.lang.String) = this()
  def this(config: Config) = this()
  def this(config: scala.Double) = this()
  var _dutyCycle: js.Any = js.native
  var _frequency: js.Any = js.native
  var _pwm: js.Any = js.native
  var _range: js.Any = js.native
  val dutyCycle: scala.Double = js.native
  val frequency: scala.Double = js.native
  val range: scala.Double = js.native
  def write(dutyCycle: scala.Double): scala.Unit = js.native
}

