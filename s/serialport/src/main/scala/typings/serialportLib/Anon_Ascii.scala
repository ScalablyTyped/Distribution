package typings
package serialportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascii extends js.Object {
  var delimiter: java.lang.String | nodeLib.Buffer | js.Array[scala.Double]
  var encoding: js.UndefOr[
    serialportLib.serialportLibStrings.ascii | serialportLib.serialportLibStrings.utf8 | serialportLib.serialportLibStrings.utf16le | serialportLib.serialportLibStrings.ucs2 | serialportLib.serialportLibStrings.base64 | serialportLib.serialportLibStrings.binary | serialportLib.serialportLibStrings.hex
  ] = js.undefined
}

object Anon_Ascii {
  @scala.inline
  def apply(
    delimiter: java.lang.String | nodeLib.Buffer | js.Array[scala.Double],
    encoding: serialportLib.serialportLibStrings.ascii | serialportLib.serialportLibStrings.utf8 | serialportLib.serialportLibStrings.utf16le | serialportLib.serialportLibStrings.ucs2 | serialportLib.serialportLibStrings.base64 | serialportLib.serialportLibStrings.binary | serialportLib.serialportLibStrings.hex = null
  ): Anon_Ascii = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ascii]
  }
}

