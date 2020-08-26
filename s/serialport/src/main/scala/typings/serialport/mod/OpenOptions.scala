package typings.serialport.mod

import typings.serialport.anon.Vmin
import typings.serialport.serialportNumbers.`110`
import typings.serialport.serialportNumbers.`115200`
import typings.serialport.serialportNumbers.`1200`
import typings.serialport.serialportNumbers.`134`
import typings.serialport.serialportNumbers.`150`
import typings.serialport.serialportNumbers.`1800`
import typings.serialport.serialportNumbers.`19200`
import typings.serialport.serialportNumbers.`1`
import typings.serialport.serialportNumbers.`200`
import typings.serialport.serialportNumbers.`2400`
import typings.serialport.serialportNumbers.`2`
import typings.serialport.serialportNumbers.`300`
import typings.serialport.serialportNumbers.`38400`
import typings.serialport.serialportNumbers.`4800`
import typings.serialport.serialportNumbers.`50`
import typings.serialport.serialportNumbers.`57600`
import typings.serialport.serialportNumbers.`5`
import typings.serialport.serialportNumbers.`600`
import typings.serialport.serialportNumbers.`6`
import typings.serialport.serialportNumbers.`75`
import typings.serialport.serialportNumbers.`7`
import typings.serialport.serialportNumbers.`8`
import typings.serialport.serialportNumbers.`9600`
import typings.serialport.serialportStrings.even
import typings.serialport.serialportStrings.mark
import typings.serialport.serialportStrings.none
import typings.serialport.serialportStrings.odd
import typings.serialport.serialportStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options Type Defs
@js.native
trait OpenOptions extends js.Object {
  var autoOpen: js.UndefOr[Boolean] = js.native
  var baudRate: js.UndefOr[
    `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
  ] = js.native
  var binding: js.UndefOr[BaseBinding] = js.native
  var bindingOptions: js.UndefOr[Vmin] = js.native
  var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.native
  var highWaterMark: js.UndefOr[Double] = js.native
  var lock: js.UndefOr[Boolean] = js.native
  var parity: js.UndefOr[none | even | mark | odd | space] = js.native
  var rtscts: js.UndefOr[Boolean] = js.native
  var stopBits: js.UndefOr[`1` | `2`] = js.native
  var xany: js.UndefOr[Boolean] = js.native
  var xoff: js.UndefOr[Boolean] = js.native
  var xon: js.UndefOr[Boolean] = js.native
}

object OpenOptions {
  @scala.inline
  def apply(): OpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenOptions]
  }
  @scala.inline
  implicit class OpenOptionsOps[Self <: OpenOptions] (val x: Self) extends AnyVal {
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
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    @scala.inline
    def setBaudRate(
      value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
    ): Self = this.set("baudRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaudRate: Self = this.set("baudRate", js.undefined)
    @scala.inline
    def setBinding(value: BaseBinding): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    @scala.inline
    def setBindingOptions(value: Vmin): Self = this.set("bindingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindingOptions: Self = this.set("bindingOptions", js.undefined)
    @scala.inline
    def setDataBits(value: `8` | `7` | `6` | `5`): Self = this.set("dataBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataBits: Self = this.set("dataBits", js.undefined)
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    @scala.inline
    def setLock(value: Boolean): Self = this.set("lock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    @scala.inline
    def setParity(value: none | even | mark | odd | space): Self = this.set("parity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParity: Self = this.set("parity", js.undefined)
    @scala.inline
    def setRtscts(value: Boolean): Self = this.set("rtscts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtscts: Self = this.set("rtscts", js.undefined)
    @scala.inline
    def setStopBits(value: `1` | `2`): Self = this.set("stopBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopBits: Self = this.set("stopBits", js.undefined)
    @scala.inline
    def setXany(value: Boolean): Self = this.set("xany", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXany: Self = this.set("xany", js.undefined)
    @scala.inline
    def setXoff(value: Boolean): Self = this.set("xoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXoff: Self = this.set("xoff", js.undefined)
    @scala.inline
    def setXon(value: Boolean): Self = this.set("xon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXon: Self = this.set("xon", js.undefined)
  }
  
}

