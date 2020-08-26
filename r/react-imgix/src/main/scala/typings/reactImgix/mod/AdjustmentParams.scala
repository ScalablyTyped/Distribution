package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustmentParams extends js.Object {
  var bri: js.UndefOr[ImgixParamType] = js.native
  var con: js.UndefOr[ImgixParamType] = js.native
  var exp: js.UndefOr[ImgixParamType] = js.native
  var gam: js.UndefOr[ImgixParamType] = js.native
  var high: js.UndefOr[ImgixParamType] = js.native
  var hue: js.UndefOr[ImgixParamType] = js.native
  var invert: js.UndefOr[ImgixParamType] = js.native
  var sat: js.UndefOr[ImgixParamType] = js.native
  var shad: js.UndefOr[ImgixParamType] = js.native
  var sharp: js.UndefOr[ImgixParamType] = js.native
  var usm: js.UndefOr[ImgixParamType] = js.native
  var usmrad: js.UndefOr[ImgixParamType] = js.native
  var vib: js.UndefOr[ImgixParamType] = js.native
}

object AdjustmentParams {
  @scala.inline
  def apply(): AdjustmentParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustmentParams]
  }
  @scala.inline
  implicit class AdjustmentParamsOps[Self <: AdjustmentParams] (val x: Self) extends AnyVal {
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
    def setBri(value: ImgixParamType): Self = this.set("bri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBri: Self = this.set("bri", js.undefined)
    @scala.inline
    def setCon(value: ImgixParamType): Self = this.set("con", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCon: Self = this.set("con", js.undefined)
    @scala.inline
    def setExp(value: ImgixParamType): Self = this.set("exp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    @scala.inline
    def setGam(value: ImgixParamType): Self = this.set("gam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGam: Self = this.set("gam", js.undefined)
    @scala.inline
    def setHigh(value: ImgixParamType): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setHue(value: ImgixParamType): Self = this.set("hue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    @scala.inline
    def setInvert(value: ImgixParamType): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    @scala.inline
    def setSat(value: ImgixParamType): Self = this.set("sat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSat: Self = this.set("sat", js.undefined)
    @scala.inline
    def setShad(value: ImgixParamType): Self = this.set("shad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShad: Self = this.set("shad", js.undefined)
    @scala.inline
    def setSharp(value: ImgixParamType): Self = this.set("sharp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharp: Self = this.set("sharp", js.undefined)
    @scala.inline
    def setUsm(value: ImgixParamType): Self = this.set("usm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsm: Self = this.set("usm", js.undefined)
    @scala.inline
    def setUsmrad(value: ImgixParamType): Self = this.set("usmrad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsmrad: Self = this.set("usmrad", js.undefined)
    @scala.inline
    def setVib(value: ImgixParamType): Self = this.set("vib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVib: Self = this.set("vib", js.undefined)
  }
  
}

