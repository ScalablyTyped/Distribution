package typings.reactDashEasyDashChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorStroke extends js.Object {
  var color: String
  var stroke: String
  var `type`: String
}

object Anon_ColorStroke {
  @scala.inline
  def apply(color: String, stroke: String, `type`: String): Anon_ColorStroke = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorStroke]
  }
}

