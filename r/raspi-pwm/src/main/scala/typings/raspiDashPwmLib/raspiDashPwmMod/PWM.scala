package typings
package raspiDashPwmLib.raspiDashPwmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-pwm", "PWM")
@js.native
class PWM ()
  extends raspiDashPeripheralLib.raspiDashPeripheralMod.Peripheral {
  def this(config: java.lang.String) = this()
  def this(config: Config) = this()
  def this(config: scala.Double) = this()
  var _dutyCycleValue: js.Any = js.native
  var _frequencyValue: js.Any = js.native
  var _pwm: js.Any = js.native
  var _pwmPort: js.Any = js.native
  val dutyCycle: scala.Double = js.native
  val frequency: scala.Double = js.native
  def write(dutyCycle: scala.Double): scala.Unit = js.native
}

