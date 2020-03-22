package typings.serialport

import typings.node.Buffer
import typings.serialport.serialportStrings.ascii
import typings.serialport.serialportStrings.base64
import typings.serialport.serialportStrings.binary
import typings.serialport.serialportStrings.hex
import typings.serialport.serialportStrings.ucs2
import typings.serialport.serialportStrings.utf16le
import typings.serialport.serialportStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
  var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | binary | hex] = js.undefined
  var includeDelimiter: js.UndefOr[Boolean] = js.undefined
}

object AnonEncoding {
  @scala.inline
  def apply(
    delimiter: String | Buffer | js.Array[Double],
    encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex = null,
    includeDelimiter: js.UndefOr[Boolean] = js.undefined
  ): AnonEncoding = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDelimiter)) __obj.updateDynamic("includeDelimiter")(includeDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
}

