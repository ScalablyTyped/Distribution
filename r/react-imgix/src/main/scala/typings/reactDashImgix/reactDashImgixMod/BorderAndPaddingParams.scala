package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderAndPaddingParams extends js.Object {
  var border: js.UndefOr[ImgixParamType] = js.undefined
  var `border-radius`: js.UndefOr[ImgixParamType] = js.undefined
  var `border-radius-inner`: js.UndefOr[ImgixParamType] = js.undefined
  var pad: js.UndefOr[ImgixParamType] = js.undefined
}

object BorderAndPaddingParams {
  @scala.inline
  def apply(
    border: ImgixParamType = null,
    `border-radius`: ImgixParamType = null,
    `border-radius-inner`: ImgixParamType = null,
    pad: ImgixParamType = null
  ): BorderAndPaddingParams = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-radius-inner` != null) __obj.updateDynamic("border-radius-inner")(`border-radius-inner`.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderAndPaddingParams]
  }
}

