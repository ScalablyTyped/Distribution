package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoiseReductionParams extends js.Object {
  var nr: js.UndefOr[ImgixParamType] = js.undefined
  var nrs: js.UndefOr[ImgixParamType] = js.undefined
}

object NoiseReductionParams {
  @scala.inline
  def apply(nr: ImgixParamType = null, nrs: ImgixParamType = null): NoiseReductionParams = {
    val __obj = js.Dynamic.literal()
    if (nr != null) __obj.updateDynamic("nr")(nr.asInstanceOf[js.Any])
    if (nrs != null) __obj.updateDynamic("nrs")(nrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseReductionParams]
  }
}

