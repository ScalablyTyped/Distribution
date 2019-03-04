package typings
package projectDashOxfordLib.projectDashOxfordMod.FaceResponsesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detect extends js.Object {
  var attributes: Attributes
  var faceId: java.lang.String
  var faceLandmarks: FaceLandmarks
  var faceRectangle: FaceRectangle
}

object Detect {
  @scala.inline
  def apply(
    attributes: Attributes,
    faceId: java.lang.String,
    faceLandmarks: FaceLandmarks,
    faceRectangle: FaceRectangle
  ): Detect = {
    val __obj = js.Dynamic.literal(attributes = attributes, faceId = faceId, faceLandmarks = faceLandmarks, faceRectangle = faceRectangle)
  
    __obj.asInstanceOf[Detect]
  }
}

