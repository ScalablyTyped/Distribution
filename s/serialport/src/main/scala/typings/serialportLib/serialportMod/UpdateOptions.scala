package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends js.Object {
  var baudRate: js.UndefOr[
    serialportLib.serialportLibNumbers.`115200` | serialportLib.serialportLibNumbers.`57600` | serialportLib.serialportLibNumbers.`38400` | serialportLib.serialportLibNumbers.`19200` | serialportLib.serialportLibNumbers.`9600` | serialportLib.serialportLibNumbers.`4800` | serialportLib.serialportLibNumbers.`2400` | serialportLib.serialportLibNumbers.`1800` | serialportLib.serialportLibNumbers.`1200` | serialportLib.serialportLibNumbers.`600` | serialportLib.serialportLibNumbers.`300` | serialportLib.serialportLibNumbers.`200` | serialportLib.serialportLibNumbers.`150` | serialportLib.serialportLibNumbers.`134` | serialportLib.serialportLibNumbers.`110` | serialportLib.serialportLibNumbers.`75` | serialportLib.serialportLibNumbers.`50` | scala.Double
  ] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    baudRate: serialportLib.serialportLibNumbers.`115200` | serialportLib.serialportLibNumbers.`57600` | serialportLib.serialportLibNumbers.`38400` | serialportLib.serialportLibNumbers.`19200` | serialportLib.serialportLibNumbers.`9600` | serialportLib.serialportLibNumbers.`4800` | serialportLib.serialportLibNumbers.`2400` | serialportLib.serialportLibNumbers.`1800` | serialportLib.serialportLibNumbers.`1200` | serialportLib.serialportLibNumbers.`600` | serialportLib.serialportLibNumbers.`300` | serialportLib.serialportLibNumbers.`200` | serialportLib.serialportLibNumbers.`150` | serialportLib.serialportLibNumbers.`134` | serialportLib.serialportLibNumbers.`110` | serialportLib.serialportLibNumbers.`75` | serialportLib.serialportLibNumbers.`50` | scala.Double = null
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (baudRate != null) __obj.updateDynamic("baudRate")(baudRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
}

