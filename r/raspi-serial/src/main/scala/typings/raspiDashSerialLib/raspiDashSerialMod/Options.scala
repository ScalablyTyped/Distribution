package typings
package raspiDashSerialLib.raspiDashSerialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var baudRate: js.UndefOr[
    raspiDashSerialLib.raspiDashSerialLibNumbers.`115200` | raspiDashSerialLib.raspiDashSerialLibNumbers.`57600` | raspiDashSerialLib.raspiDashSerialLibNumbers.`38400` | raspiDashSerialLib.raspiDashSerialLibNumbers.`19200` | raspiDashSerialLib.raspiDashSerialLibNumbers.`9600` | raspiDashSerialLib.raspiDashSerialLibNumbers.`4800` | raspiDashSerialLib.raspiDashSerialLibNumbers.`2400` | raspiDashSerialLib.raspiDashSerialLibNumbers.`1800` | raspiDashSerialLib.raspiDashSerialLibNumbers.`1200` | raspiDashSerialLib.raspiDashSerialLibNumbers.`600` | raspiDashSerialLib.raspiDashSerialLibNumbers.`300` | raspiDashSerialLib.raspiDashSerialLibNumbers.`200` | raspiDashSerialLib.raspiDashSerialLibNumbers.`150` | raspiDashSerialLib.raspiDashSerialLibNumbers.`134` | raspiDashSerialLib.raspiDashSerialLibNumbers.`110` | raspiDashSerialLib.raspiDashSerialLibNumbers.`75` | raspiDashSerialLib.raspiDashSerialLibNumbers.`50` | scala.Double
  ] = js.undefined
  var dataBits: js.UndefOr[
    raspiDashSerialLib.raspiDashSerialLibNumbers.`8` | raspiDashSerialLib.raspiDashSerialLibNumbers.`7` | raspiDashSerialLib.raspiDashSerialLibNumbers.`6` | raspiDashSerialLib.raspiDashSerialLibNumbers.`5`
  ] = js.undefined
  var parity: js.UndefOr[
    raspiDashSerialLib.raspiDashSerialLibStrings.none | raspiDashSerialLib.raspiDashSerialLibStrings.even | raspiDashSerialLib.raspiDashSerialLibStrings.mark | raspiDashSerialLib.raspiDashSerialLibStrings.odd | raspiDashSerialLib.raspiDashSerialLibStrings.space
  ] = js.undefined
  var portId: js.UndefOr[java.lang.String] = js.undefined
  var stopBits: js.UndefOr[
    raspiDashSerialLib.raspiDashSerialLibNumbers.`1` | raspiDashSerialLib.raspiDashSerialLibNumbers.`2`
  ] = js.undefined
}

