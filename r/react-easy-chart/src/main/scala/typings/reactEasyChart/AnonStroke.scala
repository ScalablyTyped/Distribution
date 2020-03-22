package typings.reactEasyChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStroke extends js.Object {
  var color: String
  var stroke: String
  var `type`: String
}

object AnonStroke {
  @scala.inline
  def apply(color: String, stroke: String, `type`: String): AnonStroke = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStroke]
  }
}

