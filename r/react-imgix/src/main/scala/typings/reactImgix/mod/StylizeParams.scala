package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylizeParams extends js.Object {
  var blur: js.UndefOr[ImgixParamType] = js.undefined
  var duotone: js.UndefOr[ImgixParamType] = js.undefined
  var `duotone-alpha`: js.UndefOr[ImgixParamType] = js.undefined
  var htn: js.UndefOr[ImgixParamType] = js.undefined
  var monochrome: js.UndefOr[ImgixParamType] = js.undefined
  var px: js.UndefOr[ImgixParamType] = js.undefined
  var sepia: js.UndefOr[ImgixParamType] = js.undefined
}

object StylizeParams {
  @scala.inline
  def apply(
    blur: ImgixParamType = null,
    duotone: ImgixParamType = null,
    `duotone-alpha`: ImgixParamType = null,
    htn: ImgixParamType = null,
    monochrome: ImgixParamType = null,
    px: ImgixParamType = null,
    sepia: ImgixParamType = null
  ): StylizeParams = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (duotone != null) __obj.updateDynamic("duotone")(duotone.asInstanceOf[js.Any])
    if (`duotone-alpha` != null) __obj.updateDynamic("duotone-alpha")(`duotone-alpha`.asInstanceOf[js.Any])
    if (htn != null) __obj.updateDynamic("htn")(htn.asInstanceOf[js.Any])
    if (monochrome != null) __obj.updateDynamic("monochrome")(monochrome.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (sepia != null) __obj.updateDynamic("sepia")(sepia.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylizeParams]
  }
}

