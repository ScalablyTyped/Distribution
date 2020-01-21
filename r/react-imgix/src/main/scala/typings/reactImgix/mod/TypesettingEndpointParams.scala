package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesettingEndpointParams extends js.Object {
  @JSName("~text")
  var Tildetext: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-lead`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-track`: js.UndefOr[ImgixParamType] = js.undefined
}

object TypesettingEndpointParams {
  @scala.inline
  def apply(
    Tildetext: ImgixParamType = null,
    `txt-lead`: ImgixParamType = null,
    `txt-track`: ImgixParamType = null
  ): TypesettingEndpointParams = {
    val __obj = js.Dynamic.literal()
    if (Tildetext != null) __obj.updateDynamic("~text")(Tildetext.asInstanceOf[js.Any])
    if (`txt-lead` != null) __obj.updateDynamic("txt-lead")(`txt-lead`.asInstanceOf[js.Any])
    if (`txt-track` != null) __obj.updateDynamic("txt-track")(`txt-track`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesettingEndpointParams]
  }
}

