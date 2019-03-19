package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeSegment extends js.Object {
  var data: java.lang.String
  var mode: qrcodeLib.qrcodeLibStrings.alphanumeric | qrcodeLib.qrcodeLibStrings.numeric | qrcodeLib.qrcodeLibStrings.kanji | qrcodeLib.qrcodeLibStrings.byte
}

object QRCodeSegment {
  @scala.inline
  def apply(
    data: java.lang.String,
    mode: qrcodeLib.qrcodeLibStrings.alphanumeric | qrcodeLib.qrcodeLibStrings.numeric | qrcodeLib.qrcodeLibStrings.kanji | qrcodeLib.qrcodeLibStrings.byte
  ): QRCodeSegment = {
    val __obj = js.Dynamic.literal(data = data, mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QRCodeSegment]
  }
}

