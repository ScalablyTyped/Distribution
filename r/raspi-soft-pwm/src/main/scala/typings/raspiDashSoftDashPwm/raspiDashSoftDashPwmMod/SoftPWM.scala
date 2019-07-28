package typings.raspiDashSoftDashPwm.raspiDashSoftDashPwmMod

import typings.raspiDashPeripheral.raspiDashPeripheralMod.Peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-soft-pwm", "SoftPWM")
@js.native
class SoftPWM protected () extends Peripheral {
  def this(config: String) = this()
  def this(config: Double) = this()
  def this(config: Config) = this()
  var _dutyCycle: js.Any = js.native
  var _frequency: js.Any = js.native
  var _pwm: js.Any = js.native
  var _range: js.Any = js.native
  val dutyCycle: Double = js.native
  val frequency: Double = js.native
  val range: Double = js.native
  def write(dutyCycle: Double): Unit = js.native
}

