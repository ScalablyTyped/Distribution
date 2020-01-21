package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationParams extends js.Object {
  var flip: js.UndefOr[ImgixParamType] = js.undefined
  var orient: js.UndefOr[ImgixParamType] = js.undefined
  var rot: js.UndefOr[ImgixParamType] = js.undefined
}

object RotationParams {
  @scala.inline
  def apply(flip: ImgixParamType = null, orient: ImgixParamType = null, rot: ImgixParamType = null): RotationParams = {
    val __obj = js.Dynamic.literal()
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (rot != null) __obj.updateDynamic("rot")(rot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationParams]
  }
}

