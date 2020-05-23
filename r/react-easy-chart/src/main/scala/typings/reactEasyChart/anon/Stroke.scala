package typings.reactEasyChart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stroke extends js.Object {
  var color: String
  var stroke: String
  var `type`: String
}

object Stroke {
  @scala.inline
  def apply(color: String, stroke: String, `type`: String): Stroke = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stroke]
  }
}

