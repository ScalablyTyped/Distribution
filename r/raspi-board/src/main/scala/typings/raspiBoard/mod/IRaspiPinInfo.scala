package typings.raspiBoard.mod

import typings.j5IoTypes.mod.IPinInfo
import typings.j5IoTypes.mod.PeripheralType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRaspiPinInfo extends IPinInfo {
  var gpio: Double = js.native
}

object IRaspiPinInfo {
  @scala.inline
  def apply(gpio: Double, peripherals: js.Array[PeripheralType], pins: js.Array[String]): IRaspiPinInfo = {
    val __obj = js.Dynamic.literal(gpio = gpio.asInstanceOf[js.Any], peripherals = peripherals.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRaspiPinInfo]
  }
  @scala.inline
  implicit class IRaspiPinInfoOps[Self <: IRaspiPinInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGpio(value: Double): Self = this.set("gpio", value.asInstanceOf[js.Any])
  }
  
}

