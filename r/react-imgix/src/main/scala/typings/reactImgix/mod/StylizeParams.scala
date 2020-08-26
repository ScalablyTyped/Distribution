package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylizeParams extends js.Object {
  var blur: js.UndefOr[ImgixParamType] = js.native
  var duotone: js.UndefOr[ImgixParamType] = js.native
  var `duotone-alpha`: js.UndefOr[ImgixParamType] = js.native
  var htn: js.UndefOr[ImgixParamType] = js.native
  var monochrome: js.UndefOr[ImgixParamType] = js.native
  var px: js.UndefOr[ImgixParamType] = js.native
  var sepia: js.UndefOr[ImgixParamType] = js.native
}

object StylizeParams {
  @scala.inline
  def apply(): StylizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylizeParams]
  }
  @scala.inline
  implicit class StylizeParamsOps[Self <: StylizeParams] (val x: Self) extends AnyVal {
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
    def setBlur(value: ImgixParamType): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setDuotone(value: ImgixParamType): Self = this.set("duotone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuotone: Self = this.set("duotone", js.undefined)
    @scala.inline
    def `setDuotone-alpha`(value: ImgixParamType): Self = this.set("duotone-alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDuotone-alpha`: Self = this.set("duotone-alpha", js.undefined)
    @scala.inline
    def setHtn(value: ImgixParamType): Self = this.set("htn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtn: Self = this.set("htn", js.undefined)
    @scala.inline
    def setMonochrome(value: ImgixParamType): Self = this.set("monochrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonochrome: Self = this.set("monochrome", js.undefined)
    @scala.inline
    def setPx(value: ImgixParamType): Self = this.set("px", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePx: Self = this.set("px", js.undefined)
    @scala.inline
    def setSepia(value: ImgixParamType): Self = this.set("sepia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSepia: Self = this.set("sepia", js.undefined)
  }
  
}

