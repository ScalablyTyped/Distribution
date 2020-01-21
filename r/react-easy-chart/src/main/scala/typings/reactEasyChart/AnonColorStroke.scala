package typings.reactEasyChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorStroke extends js.Object {
  var color: String
  var stroke: String
  var `type`: String
}

object AnonColorStroke {
  @scala.inline
  def apply(color: String, stroke: String, `type`: String): AnonColorStroke = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorStroke]
  }
}

