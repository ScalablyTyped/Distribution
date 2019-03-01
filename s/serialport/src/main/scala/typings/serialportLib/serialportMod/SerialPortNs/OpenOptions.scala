package typings
package serialportLib.serialportMod.SerialPortNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options Type Defs
trait OpenOptions extends js.Object {
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var baudRate: js.UndefOr[
    serialportLib.serialportLibNumbers.`115200` | serialportLib.serialportLibNumbers.`57600` | serialportLib.serialportLibNumbers.`38400` | serialportLib.serialportLibNumbers.`19200` | serialportLib.serialportLibNumbers.`9600` | serialportLib.serialportLibNumbers.`4800` | serialportLib.serialportLibNumbers.`2400` | serialportLib.serialportLibNumbers.`1800` | serialportLib.serialportLibNumbers.`1200` | serialportLib.serialportLibNumbers.`600` | serialportLib.serialportLibNumbers.`300` | serialportLib.serialportLibNumbers.`200` | serialportLib.serialportLibNumbers.`150` | serialportLib.serialportLibNumbers.`134` | serialportLib.serialportLibNumbers.`110` | serialportLib.serialportLibNumbers.`75` | serialportLib.serialportLibNumbers.`50` | scala.Double
  ] = js.undefined
  var binding: js.UndefOr[BaseBinding] = js.undefined
  var bindingOptions: js.UndefOr[serialportLib.Anon_Vmin] = js.undefined
  var dataBits: js.UndefOr[
    serialportLib.serialportLibNumbers.`8` | serialportLib.serialportLibNumbers.`7` | serialportLib.serialportLibNumbers.`6` | serialportLib.serialportLibNumbers.`5`
  ] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var lock: js.UndefOr[scala.Boolean] = js.undefined
  var parity: js.UndefOr[
    serialportLib.serialportLibStrings.none | serialportLib.serialportLibStrings.even | serialportLib.serialportLibStrings.mark | serialportLib.serialportLibStrings.odd | serialportLib.serialportLibStrings.space
  ] = js.undefined
  var rtscts: js.UndefOr[scala.Boolean] = js.undefined
  var stopBits: js.UndefOr[serialportLib.serialportLibNumbers.`1` | serialportLib.serialportLibNumbers.`2`] = js.undefined
  var xany: js.UndefOr[scala.Boolean] = js.undefined
  var xoff: js.UndefOr[scala.Boolean] = js.undefined
  var xon: js.UndefOr[scala.Boolean] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    baudRate: serialportLib.serialportLibNumbers.`115200` | serialportLib.serialportLibNumbers.`57600` | serialportLib.serialportLibNumbers.`38400` | serialportLib.serialportLibNumbers.`19200` | serialportLib.serialportLibNumbers.`9600` | serialportLib.serialportLibNumbers.`4800` | serialportLib.serialportLibNumbers.`2400` | serialportLib.serialportLibNumbers.`1800` | serialportLib.serialportLibNumbers.`1200` | serialportLib.serialportLibNumbers.`600` | serialportLib.serialportLibNumbers.`300` | serialportLib.serialportLibNumbers.`200` | serialportLib.serialportLibNumbers.`150` | serialportLib.serialportLibNumbers.`134` | serialportLib.serialportLibNumbers.`110` | serialportLib.serialportLibNumbers.`75` | serialportLib.serialportLibNumbers.`50` | scala.Double = null,
    binding: BaseBinding = null,
    bindingOptions: serialportLib.Anon_Vmin = null,
    dataBits: serialportLib.serialportLibNumbers.`8` | serialportLib.serialportLibNumbers.`7` | serialportLib.serialportLibNumbers.`6` | serialportLib.serialportLibNumbers.`5` = null,
    highWaterMark: scala.Int | scala.Double = null,
    lock: js.UndefOr[scala.Boolean] = js.undefined,
    parity: serialportLib.serialportLibStrings.none | serialportLib.serialportLibStrings.even | serialportLib.serialportLibStrings.mark | serialportLib.serialportLibStrings.odd | serialportLib.serialportLibStrings.space = null,
    rtscts: js.UndefOr[scala.Boolean] = js.undefined,
    stopBits: serialportLib.serialportLibNumbers.`1` | serialportLib.serialportLibNumbers.`2` = null,
    xany: js.UndefOr[scala.Boolean] = js.undefined,
    xoff: js.UndefOr[scala.Boolean] = js.undefined,
    xon: js.UndefOr[scala.Boolean] = js.undefined
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

