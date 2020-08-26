package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrimParams extends js.Object {
  var trim: js.UndefOr[ImgixParamType] = js.native
  var `trim-color`: js.UndefOr[ImgixParamType] = js.native
  var `trim-md`: js.UndefOr[ImgixParamType] = js.native
  var `trim-sd`: js.UndefOr[ImgixParamType] = js.native
  var `trim-tol`: js.UndefOr[ImgixParamType] = js.native
}

object TrimParams {
  @scala.inline
  def apply(): TrimParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimParams]
  }
  @scala.inline
  implicit class TrimParamsOps[Self <: TrimParams] (val x: Self) extends AnyVal {
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
    def setTrim(value: ImgixParamType): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    @scala.inline
    def `setTrim-color`(value: ImgixParamType): Self = this.set("trim-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTrim-color`: Self = this.set("trim-color", js.undefined)
    @scala.inline
    def `setTrim-md`(value: ImgixParamType): Self = this.set("trim-md", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTrim-md`: Self = this.set("trim-md", js.undefined)
    @scala.inline
    def `setTrim-sd`(value: ImgixParamType): Self = this.set("trim-sd", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTrim-sd`: Self = this.set("trim-sd", js.undefined)
    @scala.inline
    def `setTrim-tol`(value: ImgixParamType): Self = this.set("trim-tol", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTrim-tol`: Self = this.set("trim-tol", js.undefined)
  }
  
}

