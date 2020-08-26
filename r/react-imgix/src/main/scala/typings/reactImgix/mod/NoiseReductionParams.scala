package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReductionParams extends js.Object {
  var nr: js.UndefOr[ImgixParamType] = js.native
  var nrs: js.UndefOr[ImgixParamType] = js.native
}

object NoiseReductionParams {
  @scala.inline
  def apply(): NoiseReductionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReductionParams]
  }
  @scala.inline
  implicit class NoiseReductionParamsOps[Self <: NoiseReductionParams] (val x: Self) extends AnyVal {
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
    def setNr(value: ImgixParamType): Self = this.set("nr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNr: Self = this.set("nr", js.undefined)
    @scala.inline
    def setNrs(value: ImgixParamType): Self = this.set("nrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNrs: Self = this.set("nrs", js.undefined)
  }
  
}

