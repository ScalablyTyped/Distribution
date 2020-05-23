package typings.smoothie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineWidth extends js.Object {
  var lineWidth: Double
  var strokeStyle: String
}

object LineWidth {
  @scala.inline
  def apply(lineWidth: Double, strokeStyle: String): LineWidth = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidth]
  }
}

