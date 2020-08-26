package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextParams extends js.Object {
  var txt: js.UndefOr[ImgixParamType] = js.native
  var `txt-align`: js.UndefOr[ImgixParamType] = js.native
  var `txt-clip`: js.UndefOr[ImgixParamType] = js.native
  var `txt-color`: js.UndefOr[ImgixParamType] = js.native
  var `txt-fit`: js.UndefOr[ImgixParamType] = js.native
  var `txt-font`: js.UndefOr[ImgixParamType] = js.native
  var `txt-lig`: js.UndefOr[ImgixParamType] = js.native
  var `txt-line`: js.UndefOr[ImgixParamType] = js.native
  var `txt-line-color`: js.UndefOr[ImgixParamType] = js.native
  var `txt-pad`: js.UndefOr[ImgixParamType] = js.native
  var `txt-shad`: js.UndefOr[ImgixParamType] = js.native
  var `txt-size`: js.UndefOr[ImgixParamType] = js.native
  var `txt-width`: js.UndefOr[ImgixParamType] = js.native
}

object TextParams {
  @scala.inline
  def apply(): TextParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextParams]
  }
  @scala.inline
  implicit class TextParamsOps[Self <: TextParams] (val x: Self) extends AnyVal {
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
    def setTxt(value: ImgixParamType): Self = this.set("txt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTxt: Self = this.set("txt", js.undefined)
    @scala.inline
    def `setTxt-align`(value: ImgixParamType): Self = this.set("txt-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-align`: Self = this.set("txt-align", js.undefined)
    @scala.inline
    def `setTxt-clip`(value: ImgixParamType): Self = this.set("txt-clip", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-clip`: Self = this.set("txt-clip", js.undefined)
    @scala.inline
    def `setTxt-color`(value: ImgixParamType): Self = this.set("txt-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-color`: Self = this.set("txt-color", js.undefined)
    @scala.inline
    def `setTxt-fit`(value: ImgixParamType): Self = this.set("txt-fit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-fit`: Self = this.set("txt-fit", js.undefined)
    @scala.inline
    def `setTxt-font`(value: ImgixParamType): Self = this.set("txt-font", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-font`: Self = this.set("txt-font", js.undefined)
    @scala.inline
    def `setTxt-lig`(value: ImgixParamType): Self = this.set("txt-lig", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-lig`: Self = this.set("txt-lig", js.undefined)
    @scala.inline
    def `setTxt-line`(value: ImgixParamType): Self = this.set("txt-line", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-line`: Self = this.set("txt-line", js.undefined)
    @scala.inline
    def `setTxt-line-color`(value: ImgixParamType): Self = this.set("txt-line-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-line-color`: Self = this.set("txt-line-color", js.undefined)
    @scala.inline
    def `setTxt-pad`(value: ImgixParamType): Self = this.set("txt-pad", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-pad`: Self = this.set("txt-pad", js.undefined)
    @scala.inline
    def `setTxt-shad`(value: ImgixParamType): Self = this.set("txt-shad", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-shad`: Self = this.set("txt-shad", js.undefined)
    @scala.inline
    def `setTxt-size`(value: ImgixParamType): Self = this.set("txt-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-size`: Self = this.set("txt-size", js.undefined)
    @scala.inline
    def `setTxt-width`(value: ImgixParamType): Self = this.set("txt-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-width`: Self = this.set("txt-width", js.undefined)
  }
  
}

