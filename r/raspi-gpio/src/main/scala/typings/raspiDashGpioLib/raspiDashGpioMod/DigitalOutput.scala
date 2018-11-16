package typings
package raspiDashGpioLib.raspiDashGpioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-gpio", "DigitalOutput")
@js.native
class DigitalOutput protected ()
  extends raspiDashPeripheralLib.raspiDashPeripheralMod.Peripheral {
  def this(config: java.lang.String) = this()
  def this(config: Config) = this()
  def this(config: scala.Double) = this()
  var _currentValue: js.Any = js.native
  var _output: js.Any = js.native
  val value: scala.Double = js.native
  def write(value: scala.Double): scala.Unit = js.native
}

