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
  var bindingOptions: js.UndefOr[serialportLib.Anon_Vtime] = js.undefined
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

