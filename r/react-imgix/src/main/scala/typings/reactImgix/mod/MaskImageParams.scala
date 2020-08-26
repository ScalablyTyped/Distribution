package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskImageParams extends js.Object {
  var `corner-radius`: js.UndefOr[ImgixParamType] = js.native
  var mask: js.UndefOr[ImgixParamType] = js.native
}

object MaskImageParams {
  @scala.inline
  def apply(): MaskImageParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskImageParams]
  }
  @scala.inline
  implicit class MaskImageParamsOps[Self <: MaskImageParams] (val x: Self) extends AnyVal {
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
    def `setCorner-radius`(value: ImgixParamType): Self = this.set("corner-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCorner-radius`: Self = this.set("corner-radius", js.undefined)
    @scala.inline
    def setMask(value: ImgixParamType): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
  }
  
}

