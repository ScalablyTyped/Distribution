package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.alphanumeric
import typings.qrcode.qrcodeStrings.byte
import typings.qrcode.qrcodeStrings.kanji
import typings.qrcode.qrcodeStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeSegment extends js.Object {
  var data: String
  var mode: alphanumeric | numeric | kanji | byte
}

object QRCodeSegment {
  @scala.inline
  def apply(data: String, mode: alphanumeric | numeric | kanji | byte): QRCodeSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeSegment]
  }
}

