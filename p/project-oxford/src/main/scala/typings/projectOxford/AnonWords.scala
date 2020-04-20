package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWords extends js.Object {
  var boundingBox: String
  var words: js.Array[AnonBoundingBox]
}

object AnonWords {
  @scala.inline
  def apply(boundingBox: String, words: js.Array[AnonBoundingBox]): AnonWords = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWords]
  }
}

