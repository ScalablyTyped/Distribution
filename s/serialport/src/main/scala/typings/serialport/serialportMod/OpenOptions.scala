package typings.serialport.serialportMod

import typings.serialport.Anon_Vmin
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
trait OpenOptions extends js.Object {
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var baudRate: js.UndefOr[
    `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
  ] = js.undefined
  var binding: js.UndefOr[BaseBinding] = js.undefined
  var bindingOptions: js.UndefOr[Anon_Vmin] = js.undefined
  var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var lock: js.UndefOr[Boolean] = js.undefined
  var parity: js.UndefOr[none | even | mark | odd | space] = js.undefined
  var rtscts: js.UndefOr[Boolean] = js.undefined
  var stopBits: js.UndefOr[`1` | `2`] = js.undefined
  var xany: js.UndefOr[Boolean] = js.undefined
  var xoff: js.UndefOr[Boolean] = js.undefined
  var xon: js.UndefOr[Boolean] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    baudRate: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double = null,
    binding: BaseBinding = null,
    bindingOptions: Anon_Vmin = null,
    dataBits: `8` | `7` | `6` | `5` = null,
    highWaterMark: Int | Double = null,
    lock: js.UndefOr[Boolean] = js.undefined,
    parity: none | even | mark | odd | space = null,
    rtscts: js.UndefOr[Boolean] = js.undefined,
    stopBits: `1` | `2` = null,
    xany: js.UndefOr[Boolean] = js.undefined,
    xoff: js.UndefOr[Boolean] = js.undefined,
    xon: js.UndefOr[Boolean] = js.undefined
  ): OpenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (baudRate != null) __obj.updateDynamic("baudRate")(baudRate.asInstanceOf[js.Any])
    if (binding != null) __obj.updateDynamic("binding")(binding)
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions)
    if (dataBits != null) __obj.updateDynamic("dataBits")(dataBits.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(lock)) __obj.updateDynamic("lock")(lock)
    if (parity != null) __obj.updateDynamic("parity")(parity.asInstanceOf[js.Any])
    if (!js.isUndefined(rtscts)) __obj.updateDynamic("rtscts")(rtscts)
    if (stopBits != null) __obj.updateDynamic("stopBits")(stopBits.asInstanceOf[js.Any])
    if (!js.isUndefined(xany)) __obj.updateDynamic("xany")(xany)
    if (!js.isUndefined(xoff)) __obj.updateDynamic("xoff")(xoff)
    if (!js.isUndefined(xon)) __obj.updateDynamic("xon")(xon)
    __obj.asInstanceOf[OpenOptions]
  }
}

