package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var background: String
  var border: String
  var borderRadius: Double
  var color: String
}

object Border {
  @scala.inline
  def apply(background: String, border: String, borderRadius: Double, color: String): Border = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

