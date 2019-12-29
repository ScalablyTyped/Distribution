package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceDetectionParams extends js.Object {
  var faceindex: js.UndefOr[ImgixParamType] = js.undefined
  var facepad: js.UndefOr[ImgixParamType] = js.undefined
  var faces: js.UndefOr[ImgixParamType] = js.undefined
}

object FaceDetectionParams {
  @scala.inline
  def apply(faceindex: ImgixParamType = null, facepad: ImgixParamType = null, faces: ImgixParamType = null): FaceDetectionParams = {
    val __obj = js.Dynamic.literal()
    if (faceindex != null) __obj.updateDynamic("faceindex")(faceindex.asInstanceOf[js.Any])
    if (facepad != null) __obj.updateDynamic("facepad")(facepad.asInstanceOf[js.Any])
    if (faces != null) __obj.updateDynamic("faces")(faces.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectionParams]
  }
}

