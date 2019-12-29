package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeParams extends js.Object {
  var ar: js.UndefOr[ImgixParamType] = js.undefined
  var crop: js.UndefOr[ImgixParamType] = js.undefined
  var fit: js.UndefOr[ImgixParamType] = js.undefined
  var h: js.UndefOr[ImgixParamType] = js.undefined
  var `max-h`: js.UndefOr[ImgixParamType] = js.undefined
  var `max-w`: js.UndefOr[ImgixParamType] = js.undefined
  var `min-h`: js.UndefOr[ImgixParamType] = js.undefined
  var `min-w`: js.UndefOr[ImgixParamType] = js.undefined
  var rect: js.UndefOr[ImgixParamType] = js.undefined
  var w: js.UndefOr[ImgixParamType] = js.undefined
}

object SizeParams {
  @scala.inline
  def apply(
    ar: ImgixParamType = null,
    crop: ImgixParamType = null,
    fit: ImgixParamType = null,
    h: ImgixParamType = null,
    `max-h`: ImgixParamType = null,
    `max-w`: ImgixParamType = null,
    `min-h`: ImgixParamType = null,
    `min-w`: ImgixParamType = null,
    rect: ImgixParamType = null,
    w: ImgixParamType = null
  ): SizeParams = {
    val __obj = js.Dynamic.literal()
    if (ar != null) __obj.updateDynamic("ar")(ar.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (`max-h` != null) __obj.updateDynamic("max-h")(`max-h`.asInstanceOf[js.Any])
    if (`max-w` != null) __obj.updateDynamic("max-w")(`max-w`.asInstanceOf[js.Any])
    if (`min-h` != null) __obj.updateDynamic("min-h")(`min-h`.asInstanceOf[js.Any])
    if (`min-w` != null) __obj.updateDynamic("min-w")(`min-w`.asInstanceOf[js.Any])
    if (rect != null) __obj.updateDynamic("rect")(rect.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeParams]
  }
}

