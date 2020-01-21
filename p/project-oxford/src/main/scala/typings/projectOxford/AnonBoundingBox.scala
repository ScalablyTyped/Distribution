package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoundingBox extends js.Object {
  var boundingBox: String
  var text: String
}

object AnonBoundingBox {
  @scala.inline
  def apply(boundingBox: String, text: String): AnonBoundingBox = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBoundingBox]
  }
}

