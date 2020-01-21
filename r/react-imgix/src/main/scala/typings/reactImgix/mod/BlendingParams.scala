package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlendingParams extends js.Object {
  var blend: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-align`: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-alpha`: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-crop`: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-fit`: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-mode`: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-pad`: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-size`: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-x`: js.UndefOr[ImgixParamType] = js.undefined
  var `blend-y`: js.UndefOr[ImgixParamType] = js.undefined
}

object BlendingParams {
  @scala.inline
  def apply(
    blend: ImgixParamType = null,
    `blend-align`: ImgixParamType = null,
    `blend-alpha`: ImgixParamType = null,
    `blend-crop`: ImgixParamType = null,
    `blend-fit`: ImgixParamType = null,
    `blend-mode`: ImgixParamType = null,
    `blend-pad`: ImgixParamType = null,
    `blend-size`: ImgixParamType = null,
    `blend-x`: ImgixParamType = null,
    `blend-y`: ImgixParamType = null
  ): BlendingParams = {
    val __obj = js.Dynamic.literal()
    if (blend != null) __obj.updateDynamic("blend")(blend.asInstanceOf[js.Any])
    if (`blend-align` != null) __obj.updateDynamic("blend-align")(`blend-align`.asInstanceOf[js.Any])
    if (`blend-alpha` != null) __obj.updateDynamic("blend-alpha")(`blend-alpha`.asInstanceOf[js.Any])
    if (`blend-crop` != null) __obj.updateDynamic("blend-crop")(`blend-crop`.asInstanceOf[js.Any])
    if (`blend-fit` != null) __obj.updateDynamic("blend-fit")(`blend-fit`.asInstanceOf[js.Any])
    if (`blend-mode` != null) __obj.updateDynamic("blend-mode")(`blend-mode`.asInstanceOf[js.Any])
    if (`blend-pad` != null) __obj.updateDynamic("blend-pad")(`blend-pad`.asInstanceOf[js.Any])
    if (`blend-size` != null) __obj.updateDynamic("blend-size")(`blend-size`.asInstanceOf[js.Any])
    if (`blend-x` != null) __obj.updateDynamic("blend-x")(`blend-x`.asInstanceOf[js.Any])
    if (`blend-y` != null) __obj.updateDynamic("blend-y")(`blend-y`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendingParams]
  }
}

