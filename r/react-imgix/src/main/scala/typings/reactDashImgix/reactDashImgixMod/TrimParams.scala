package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimParams extends js.Object {
  var trim: js.UndefOr[ImgixParamType] = js.undefined
  var `trim-color`: js.UndefOr[ImgixParamType] = js.undefined
  var `trim-md`: js.UndefOr[ImgixParamType] = js.undefined
  var `trim-sd`: js.UndefOr[ImgixParamType] = js.undefined
  var `trim-tol`: js.UndefOr[ImgixParamType] = js.undefined
}

object TrimParams {
  @scala.inline
  def apply(
    trim: ImgixParamType = null,
    `trim-color`: ImgixParamType = null,
    `trim-md`: ImgixParamType = null,
    `trim-sd`: ImgixParamType = null,
    `trim-tol`: ImgixParamType = null
  ): TrimParams = {
    val __obj = js.Dynamic.literal()
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (`trim-color` != null) __obj.updateDynamic("trim-color")(`trim-color`.asInstanceOf[js.Any])
    if (`trim-md` != null) __obj.updateDynamic("trim-md")(`trim-md`.asInstanceOf[js.Any])
    if (`trim-sd` != null) __obj.updateDynamic("trim-sd")(`trim-sd`.asInstanceOf[js.Any])
    if (`trim-tol` != null) __obj.updateDynamic("trim-tol")(`trim-tol`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrimParams]
  }
}

