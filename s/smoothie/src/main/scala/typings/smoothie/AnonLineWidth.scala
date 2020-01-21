package typings.smoothie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineWidth extends js.Object {
  var lineWidth: Double
  var strokeStyle: String
}

object AnonLineWidth {
  @scala.inline
  def apply(lineWidth: Double, strokeStyle: String): AnonLineWidth = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLineWidth]
  }
}

