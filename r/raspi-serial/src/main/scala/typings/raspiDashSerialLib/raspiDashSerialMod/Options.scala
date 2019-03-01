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

object Options {
  @scala.inline
  def apply(
    baudRate: raspiDashSerialLib.raspiDashSerialLibNumbers.`115200` | raspiDashSerialLib.raspiDashSerialLibNumbers.`57600` | raspiDashSerialLib.raspiDashSerialLibNumbers.`38400` | raspiDashSerialLib.raspiDashSerialLibNumbers.`19200` | raspiDashSerialLib.raspiDashSerialLibNumbers.`9600` | raspiDashSerialLib.raspiDashSerialLibNumbers.`4800` | raspiDashSerialLib.raspiDashSerialLibNumbers.`2400` | raspiDashSerialLib.raspiDashSerialLibNumbers.`1800` | raspiDashSerialLib.raspiDashSerialLibNumbers.`1200` | raspiDashSerialLib.raspiDashSerialLibNumbers.`600` | raspiDashSerialLib.raspiDashSerialLibNumbers.`300` | raspiDashSerialLib.raspiDashSerialLibNumbers.`200` | raspiDashSerialLib.raspiDashSerialLibNumbers.`150` | raspiDashSerialLib.raspiDashSerialLibNumbers.`134` | raspiDashSerialLib.raspiDashSerialLibNumbers.`110` | raspiDashSerialLib.raspiDashSerialLibNumbers.`75` | raspiDashSerialLib.raspiDashSerialLibNumbers.`50` | scala.Double = null,
    dataBits: raspiDashSerialLib.raspiDashSerialLibNumbers.`8` | raspiDashSerialLib.raspiDashSerialLibNumbers.`7` | raspiDashSerialLib.raspiDashSerialLibNumbers.`6` | raspiDashSerialLib.raspiDashSerialLibNumbers.`5` = null,
    parity: raspiDashSerialLib.raspiDashSerialLibStrings.none | raspiDashSerialLib.raspiDashSerialLibStrings.even | raspiDashSerialLib.raspiDashSerialLibStrings.mark | raspiDashSerialLib.raspiDashSerialLibStrings.odd | raspiDashSerialLib.raspiDashSerialLibStrings.space = null,
    portId: java.lang.String = null,
    stopBits: raspiDashSerialLib.raspiDashSerialLibNumbers.`1` | raspiDashSerialLib.raspiDashSerialLibNumbers.`2` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baudRate != null) __obj.updateDynamic("baudRate")(baudRate.asInstanceOf[js.Any])
    if (dataBits != null) __obj.updateDynamic("dataBits")(dataBits.asInstanceOf[js.Any])
    if (parity != null) __obj.updateDynamic("parity")(parity.asInstanceOf[js.Any])
    if (portId != null) __obj.updateDynamic("portId")(portId)
    if (stopBits != null) __obj.updateDynamic("stopBits")(stopBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

