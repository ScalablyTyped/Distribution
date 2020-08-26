package typings.qrcode.mod

import typings.qrcode.anon.DeflateLevel
import typings.qrcode.qrcodeStrings.png
import typings.qrcode.qrcodeStrings.svg
import typings.qrcode.qrcodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeToFileOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[DeflateLevel] = js.native
  /**
    * Output format.
    * Default: png
    */
  var `type`: js.UndefOr[png | svg | utf8] = js.native
}

object QRCodeToFileOptions {
  @scala.inline
  def apply(): QRCodeToFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToFileOptions]
  }
  @scala.inline
  implicit class QRCodeToFileOptionsOps[Self <: QRCodeToFileOptions] (val x: Self) extends AnyVal {
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
    def setRendererOpts(value: DeflateLevel): Self = this.set("rendererOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRendererOpts: Self = this.set("rendererOpts", js.undefined)
    @scala.inline
    def setType(value: png | svg | utf8): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

