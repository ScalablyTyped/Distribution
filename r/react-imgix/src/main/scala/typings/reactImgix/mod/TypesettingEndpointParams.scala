package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypesettingEndpointParams extends js.Object {
  @JSName("~text")
  var Tildetext: js.UndefOr[ImgixParamType] = js.native
  var `txt-lead`: js.UndefOr[ImgixParamType] = js.native
  var `txt-track`: js.UndefOr[ImgixParamType] = js.native
}

object TypesettingEndpointParams {
  @scala.inline
  def apply(): TypesettingEndpointParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypesettingEndpointParams]
  }
  @scala.inline
  implicit class TypesettingEndpointParamsOps[Self <: TypesettingEndpointParams] (val x: Self) extends AnyVal {
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
    def setTildetext(value: ImgixParamType): Self = this.set("~text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTildetext: Self = this.set("~text", js.undefined)
    @scala.inline
    def `setTxt-lead`(value: ImgixParamType): Self = this.set("txt-lead", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-lead`: Self = this.set("txt-lead", js.undefined)
    @scala.inline
    def `setTxt-track`(value: ImgixParamType): Self = this.set("txt-track", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTxt-track`: Self = this.set("txt-track", js.undefined)
  }
  
}

