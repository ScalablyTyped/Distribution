package typings.raspiBoard.mod

import typings.j5IoTypes.mod.IPinInfo
import typings.j5IoTypes.mod.PeripheralType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRaspiPinInfo extends IPinInfo {
  var gpio: Double
}

object IRaspiPinInfo {
  @scala.inline
  def apply(gpio: Double, peripherals: js.Array[PeripheralType], pins: js.Array[String]): IRaspiPinInfo = {
    val __obj = js.Dynamic.literal(gpio = gpio.asInstanceOf[js.Any], peripherals = peripherals.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRaspiPinInfo]
  }
}

