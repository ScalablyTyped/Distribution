package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceDetectionParams extends js.Object {
  var faceindex: js.UndefOr[ImgixParamType] = js.native
  var facepad: js.UndefOr[ImgixParamType] = js.native
  var faces: js.UndefOr[ImgixParamType] = js.native
}

object FaceDetectionParams {
  @scala.inline
  def apply(): FaceDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetectionParams]
  }
  @scala.inline
  implicit class FaceDetectionParamsOps[Self <: FaceDetectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFaceindex(value: ImgixParamType): Self = this.set("faceindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceindex: Self = this.set("faceindex", js.undefined)
    @scala.inline
    def setFacepad(value: ImgixParamType): Self = this.set("facepad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacepad: Self = this.set("facepad", js.undefined)
    @scala.inline
    def setFaces(value: ImgixParamType): Self = this.set("faces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaces: Self = this.set("faces", js.undefined)
  }
  
}

