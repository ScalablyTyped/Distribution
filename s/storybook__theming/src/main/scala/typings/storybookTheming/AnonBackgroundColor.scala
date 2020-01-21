package typings.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var background: String
  var color: String
}

object AnonBackgroundColor {
  @scala.inline
  def apply(background: String, color: String): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

