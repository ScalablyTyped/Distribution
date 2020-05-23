package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lines extends js.Object {
  var boundingBox: String
  var lines: js.Array[Words]
}

object Lines {
  @scala.inline
  def apply(boundingBox: String, lines: js.Array[Words]): Lines = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
}

