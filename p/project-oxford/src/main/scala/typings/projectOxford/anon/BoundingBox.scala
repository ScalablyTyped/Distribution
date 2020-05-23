package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  var boundingBox: String
  var text: String
}

object BoundingBox {
  @scala.inline
  def apply(boundingBox: String, text: String): BoundingBox = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
}

