package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatermarkParams extends js.Object {
  var mark: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-align`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-alpha`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-base`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-fit`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-h`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-pad`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-scale`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-w`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-x`: js.UndefOr[ImgixParamType] = js.undefined
  var `mark-y`: js.UndefOr[ImgixParamType] = js.undefined
}

object WatermarkParams {
  @scala.inline
  def apply(
    mark: ImgixParamType = null,
    `mark-align`: ImgixParamType = null,
    `mark-alpha`: ImgixParamType = null,
    `mark-base`: ImgixParamType = null,
    `mark-fit`: ImgixParamType = null,
    `mark-h`: ImgixParamType = null,
    `mark-pad`: ImgixParamType = null,
    `mark-scale`: ImgixParamType = null,
    `mark-w`: ImgixParamType = null,
    `mark-x`: ImgixParamType = null,
    `mark-y`: ImgixParamType = null
  ): WatermarkParams = {
    val __obj = js.Dynamic.literal()
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (`mark-align` != null) __obj.updateDynamic("mark-align")(`mark-align`.asInstanceOf[js.Any])
    if (`mark-alpha` != null) __obj.updateDynamic("mark-alpha")(`mark-alpha`.asInstanceOf[js.Any])
    if (`mark-base` != null) __obj.updateDynamic("mark-base")(`mark-base`.asInstanceOf[js.Any])
    if (`mark-fit` != null) __obj.updateDynamic("mark-fit")(`mark-fit`.asInstanceOf[js.Any])
    if (`mark-h` != null) __obj.updateDynamic("mark-h")(`mark-h`.asInstanceOf[js.Any])
    if (`mark-pad` != null) __obj.updateDynamic("mark-pad")(`mark-pad`.asInstanceOf[js.Any])
    if (`mark-scale` != null) __obj.updateDynamic("mark-scale")(`mark-scale`.asInstanceOf[js.Any])
    if (`mark-w` != null) __obj.updateDynamic("mark-w")(`mark-w`.asInstanceOf[js.Any])
    if (`mark-x` != null) __obj.updateDynamic("mark-x")(`mark-x`.asInstanceOf[js.Any])
    if (`mark-y` != null) __obj.updateDynamic("mark-y")(`mark-y`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatermarkParams]
  }
}

