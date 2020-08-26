package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeParams extends js.Object {
  var ar: js.UndefOr[ImgixParamType] = js.native
  var crop: js.UndefOr[ImgixParamType] = js.native
  var fit: js.UndefOr[ImgixParamType] = js.native
  var h: js.UndefOr[ImgixParamType] = js.native
  var `max-h`: js.UndefOr[ImgixParamType] = js.native
  var `max-w`: js.UndefOr[ImgixParamType] = js.native
  var `min-h`: js.UndefOr[ImgixParamType] = js.native
  var `min-w`: js.UndefOr[ImgixParamType] = js.native
  var rect: js.UndefOr[ImgixParamType] = js.native
  var w: js.UndefOr[ImgixParamType] = js.native
}

object SizeParams {
  @scala.inline
  def apply(): SizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeParams]
  }
  @scala.inline
  implicit class SizeParamsOps[Self <: SizeParams] (val x: Self) extends AnyVal {
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
    def setAr(value: ImgixParamType): Self = this.set("ar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAr: Self = this.set("ar", js.undefined)
    @scala.inline
    def setCrop(value: ImgixParamType): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setFit(value: ImgixParamType): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setH(value: ImgixParamType): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def `setMax-h`(value: ImgixParamType): Self = this.set("max-h", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-h`: Self = this.set("max-h", js.undefined)
    @scala.inline
    def `setMax-w`(value: ImgixParamType): Self = this.set("max-w", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-w`: Self = this.set("max-w", js.undefined)
    @scala.inline
    def `setMin-h`(value: ImgixParamType): Self = this.set("min-h", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-h`: Self = this.set("min-h", js.undefined)
    @scala.inline
    def `setMin-w`(value: ImgixParamType): Self = this.set("min-w", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-w`: Self = this.set("min-w", js.undefined)
    @scala.inline
    def setRect(value: ImgixParamType): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
    @scala.inline
    def setW(value: ImgixParamType): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
  }
  
}

