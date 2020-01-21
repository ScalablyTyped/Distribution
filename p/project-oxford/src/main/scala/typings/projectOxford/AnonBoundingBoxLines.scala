package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoundingBoxLines extends js.Object {
  var boundingBox: String
  var lines: js.Array[AnonBoundingBoxWords]
}

object AnonBoundingBoxLines {
  @scala.inline
  def apply(boundingBox: String, lines: js.Array[AnonBoundingBoxWords]): AnonBoundingBoxLines = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBoundingBoxLines]
  }
}

