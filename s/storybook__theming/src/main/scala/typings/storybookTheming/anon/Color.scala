package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var fontStyle: String
}

object Color {
  @scala.inline
  def apply(color: String, fontStyle: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

