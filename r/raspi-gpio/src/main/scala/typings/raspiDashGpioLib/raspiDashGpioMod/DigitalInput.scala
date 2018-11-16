package typings
package raspiDashGpioLib.raspiDashGpioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-gpio", "DigitalInput")
@js.native
class DigitalInput protected ()
  extends raspiDashPeripheralLib.raspiDashPeripheralMod.Peripheral {
  def this(config: java.lang.String) = this()
  def this(config: Config) = this()
  def this(config: scala.Double) = this()
  var _currentValue: js.Any = js.native
  var _input: js.Any = js.native
  val value: scala.Double = js.native
  def read(): scala.Double = js.native
}

