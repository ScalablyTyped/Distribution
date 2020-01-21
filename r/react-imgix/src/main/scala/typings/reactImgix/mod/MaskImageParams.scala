package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskImageParams extends js.Object {
  var `corner-radius`: js.UndefOr[ImgixParamType] = js.undefined
  var mask: js.UndefOr[ImgixParamType] = js.undefined
}

object MaskImageParams {
  @scala.inline
  def apply(`corner-radius`: ImgixParamType = null, mask: ImgixParamType = null): MaskImageParams = {
    val __obj = js.Dynamic.literal()
    if (`corner-radius` != null) __obj.updateDynamic("corner-radius")(`corner-radius`.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskImageParams]
  }
}

