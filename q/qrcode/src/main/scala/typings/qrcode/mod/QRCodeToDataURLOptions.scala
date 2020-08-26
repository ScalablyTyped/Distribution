package typings.qrcode.mod

import typings.qrcode.anon.Quality
import typings.qrcode.qrcodeStrings.imageSlashjpeg
import typings.qrcode.qrcodeStrings.imageSlashpng
import typings.qrcode.qrcodeStrings.imageSlashwebp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeToDataURLOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[Quality] = js.native
  /**
    * Data URI format.
    * Default: image/png
    */
  var `type`: js.UndefOr[imageSlashpng | imageSlashjpeg | imageSlashwebp] = js.native
}

object QRCodeToDataURLOptions {
  @scala.inline
  def apply(): QRCodeToDataURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToDataURLOptions]
  }
  @scala.inline
  implicit class QRCodeToDataURLOptionsOps[Self <: QRCodeToDataURLOptions] (val x: Self) extends AnyVal {
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
    def setRendererOpts(value: Quality): Self = this.set("rendererOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRendererOpts: Self = this.set("rendererOpts", js.undefined)
    @scala.inline
    def setType(value: imageSlashpng | imageSlashjpeg | imageSlashwebp): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

