package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillParams extends js.Object {
  var bg: js.UndefOr[ImgixParamType] = js.native
  var fill: js.UndefOr[ImgixParamType] = js.native
  var `fill-color`: js.UndefOr[ImgixParamType] = js.native
}

object FillParams {
  @scala.inline
  def apply(): FillParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillParams]
  }
  @scala.inline
  implicit class FillParamsOps[Self <: FillParams] (val x: Self) extends AnyVal {
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
    def setBg(value: ImgixParamType): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setFill(value: ImgixParamType): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def `setFill-color`(value: ImgixParamType): Self = this.set("fill-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-color`: Self = this.set("fill-color", js.undefined)
  }
  
}

