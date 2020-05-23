package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Words extends js.Object {
  var boundingBox: String
  var words: js.Array[BoundingBox]
}

object Words {
  @scala.inline
  def apply(boundingBox: String, words: js.Array[BoundingBox]): Words = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
}

