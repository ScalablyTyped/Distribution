package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocalPointCropParams extends js.Object {
  var `fp-debug`: js.UndefOr[ImgixParamType] = js.undefined
  var `fp-x`: js.UndefOr[ImgixParamType] = js.undefined
  var `fp-y`: js.UndefOr[ImgixParamType] = js.undefined
  var `fp-z`: js.UndefOr[ImgixParamType] = js.undefined
}

object FocalPointCropParams {
  @scala.inline
  def apply(
    `fp-debug`: ImgixParamType = null,
    `fp-x`: ImgixParamType = null,
    `fp-y`: ImgixParamType = null,
    `fp-z`: ImgixParamType = null
  ): FocalPointCropParams = {
    val __obj = js.Dynamic.literal()
    if (`fp-debug` != null) __obj.updateDynamic("fp-debug")(`fp-debug`.asInstanceOf[js.Any])
    if (`fp-x` != null) __obj.updateDynamic("fp-x")(`fp-x`.asInstanceOf[js.Any])
    if (`fp-y` != null) __obj.updateDynamic("fp-y")(`fp-y`.asInstanceOf[js.Any])
    if (`fp-z` != null) __obj.updateDynamic("fp-z")(`fp-z`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocalPointCropParams]
  }
}

