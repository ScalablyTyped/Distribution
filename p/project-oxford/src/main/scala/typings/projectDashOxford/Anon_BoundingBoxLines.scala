package typings.projectDashOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundingBoxLines extends js.Object {
  var boundingBox: String
  var lines: js.Array[Anon_BoundingBoxWords]
}

object Anon_BoundingBoxLines {
  @scala.inline
  def apply(boundingBox: String, lines: js.Array[Anon_BoundingBoxWords]): Anon_BoundingBoxLines = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BoundingBoxLines]
  }
}

