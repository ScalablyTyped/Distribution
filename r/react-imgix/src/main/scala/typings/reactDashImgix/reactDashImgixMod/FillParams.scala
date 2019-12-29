package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillParams extends js.Object {
  var bg: js.UndefOr[ImgixParamType] = js.undefined
  var fill: js.UndefOr[ImgixParamType] = js.undefined
  var `fill-color`: js.UndefOr[ImgixParamType] = js.undefined
}

object FillParams {
  @scala.inline
  def apply(bg: ImgixParamType = null, fill: ImgixParamType = null, `fill-color`: ImgixParamType = null): FillParams = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (`fill-color` != null) __obj.updateDynamic("fill-color")(`fill-color`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillParams]
  }
}

