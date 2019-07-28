package typings.raspiDashGpio.raspiDashGpioMod

import typings.raspiDashPeripheral.raspiDashPeripheralMod.Peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-gpio", "DigitalInput")
@js.native
class DigitalInput protected () extends Peripheral {
  def this(config: String) = this()
  def this(config: Double) = this()
  def this(config: Config) = this()
  var _currentValue: js.Any = js.native
  var _input: js.Any = js.native
  val value: Double = js.native
  def read(): Double = js.native
}

