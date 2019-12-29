package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelDensityParams extends js.Object {
  var dpr: js.UndefOr[ImgixParamType] = js.undefined
}

object PixelDensityParams {
  @scala.inline
  def apply(dpr: ImgixParamType = null): PixelDensityParams = {
    val __obj = js.Dynamic.literal()
    if (dpr != null) __obj.updateDynamic("dpr")(dpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelDensityParams]
  }
}

