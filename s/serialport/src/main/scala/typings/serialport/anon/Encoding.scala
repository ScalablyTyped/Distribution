package typings.serialport.anon

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

trait Encoding extends js.Object {
  var delimiter: String | Buffer | js.Array[Double]
  var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | binary | hex] = js.undefined
  var includeDelimiter: js.UndefOr[Boolean] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(
    delimiter: String | Buffer | js.Array[Double],
    encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex = null,
    includeDelimiter: js.UndefOr[Boolean] = js.undefined
  ): Encoding = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDelimiter)) __obj.updateDynamic("includeDelimiter")(includeDelimiter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

