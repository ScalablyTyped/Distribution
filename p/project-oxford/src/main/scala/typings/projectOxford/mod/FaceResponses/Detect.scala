package typings.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detect extends js.Object {
  var attributes: Attributes
  var faceId: String
  var faceLandmarks: FaceLandmarks
  var faceRectangle: FaceRectangle
}

object Detect {
  @scala.inline
  def apply(attributes: Attributes, faceId: String, faceLandmarks: FaceLandmarks, faceRectangle: FaceRectangle): Detect = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any], faceLandmarks = faceLandmarks.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detect]
  }
}

