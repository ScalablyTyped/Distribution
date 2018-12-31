package typings
package serialportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelimiterEncoding extends js.Object {
  var delimiter: java.lang.String | nodeLib.Buffer | js.Array[scala.Double]
  var encoding: js.UndefOr[
    serialportLib.serialportLibStrings.ascii | serialportLib.serialportLibStrings.utf8 | serialportLib.serialportLibStrings.utf16le | serialportLib.serialportLibStrings.ucs2 | serialportLib.serialportLibStrings.base64 | serialportLib.serialportLibStrings.binary | serialportLib.serialportLibStrings.hex
  ] = js.undefined
}

