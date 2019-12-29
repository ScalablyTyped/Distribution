package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextParams extends js.Object {
  var txt: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-align`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-clip`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-color`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-fit`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-font`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-lig`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-line`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-line-color`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-pad`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-shad`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-size`: js.UndefOr[ImgixParamType] = js.undefined
  var `txt-width`: js.UndefOr[ImgixParamType] = js.undefined
}

object TextParams {
  @scala.inline
  def apply(
    txt: ImgixParamType = null,
    `txt-align`: ImgixParamType = null,
    `txt-clip`: ImgixParamType = null,
    `txt-color`: ImgixParamType = null,
    `txt-fit`: ImgixParamType = null,
    `txt-font`: ImgixParamType = null,
    `txt-lig`: ImgixParamType = null,
    `txt-line`: ImgixParamType = null,
    `txt-line-color`: ImgixParamType = null,
    `txt-pad`: ImgixParamType = null,
    `txt-shad`: ImgixParamType = null,
    `txt-size`: ImgixParamType = null,
    `txt-width`: ImgixParamType = null
  ): TextParams = {
    val __obj = js.Dynamic.literal()
    if (txt != null) __obj.updateDynamic("txt")(txt.asInstanceOf[js.Any])
    if (`txt-align` != null) __obj.updateDynamic("txt-align")(`txt-align`.asInstanceOf[js.Any])
    if (`txt-clip` != null) __obj.updateDynamic("txt-clip")(`txt-clip`.asInstanceOf[js.Any])
    if (`txt-color` != null) __obj.updateDynamic("txt-color")(`txt-color`.asInstanceOf[js.Any])
    if (`txt-fit` != null) __obj.updateDynamic("txt-fit")(`txt-fit`.asInstanceOf[js.Any])
    if (`txt-font` != null) __obj.updateDynamic("txt-font")(`txt-font`.asInstanceOf[js.Any])
    if (`txt-lig` != null) __obj.updateDynamic("txt-lig")(`txt-lig`.asInstanceOf[js.Any])
    if (`txt-line` != null) __obj.updateDynamic("txt-line")(`txt-line`.asInstanceOf[js.Any])
    if (`txt-line-color` != null) __obj.updateDynamic("txt-line-color")(`txt-line-color`.asInstanceOf[js.Any])
    if (`txt-pad` != null) __obj.updateDynamic("txt-pad")(`txt-pad`.asInstanceOf[js.Any])
    if (`txt-shad` != null) __obj.updateDynamic("txt-shad")(`txt-shad`.asInstanceOf[js.Any])
    if (`txt-size` != null) __obj.updateDynamic("txt-size")(`txt-size`.asInstanceOf[js.Any])
    if (`txt-width` != null) __obj.updateDynamic("txt-width")(`txt-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextParams]
  }
}

