package typings.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorder extends js.Object {
  var background: String
  var border: String
  var borderRadius: Double
  var color: String
}

object AnonBorder {
  @scala.inline
  def apply(background: String, border: String, borderRadius: Double, color: String): AnonBorder = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBorder]
  }
}

