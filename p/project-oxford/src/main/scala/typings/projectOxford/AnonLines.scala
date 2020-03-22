package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLines extends js.Object {
  var boundingBox: String
  var lines: js.Array[AnonWords]
}

object AnonLines {
  @scala.inline
  def apply(boundingBox: String, lines: js.Array[AnonWords]): AnonLines = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLines]
  }
}

