package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.svg
import typings.qrcode.qrcodeStrings.terminal
import typings.qrcode.qrcodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeToStringOptions extends QRCodeRenderersOptions {
  /**
    * Output format.
    * Default: utf8
    */
  var `type`: js.UndefOr[utf8 | svg | terminal] = js.native
}

object QRCodeToStringOptions {
  @scala.inline
  def apply(): QRCodeToStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToStringOptions]
  }
  @scala.inline
  implicit class QRCodeToStringOptionsOps[Self <: QRCodeToStringOptions] (val x: Self) extends AnyVal {
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
    def setType(value: utf8 | svg | terminal): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

