package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.alphanumeric
import typings.qrcode.qrcodeStrings.byte
import typings.qrcode.qrcodeStrings.kanji
import typings.qrcode.qrcodeStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCodeSegment extends js.Object {
  
  var data: String = js.native
  
  var mode: alphanumeric | numeric | kanji | byte = js.native
}
object QRCodeSegment {
  
  @scala.inline
  def apply(data: String, mode: alphanumeric | numeric | kanji | byte): QRCodeSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeSegment]
  }
  
  @scala.inline
  implicit class QRCodeSegmentOps[Self <: QRCodeSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: alphanumeric | numeric | kanji | byte): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
