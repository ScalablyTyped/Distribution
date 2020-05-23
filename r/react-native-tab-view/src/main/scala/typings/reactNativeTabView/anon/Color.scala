package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var focused: Boolean
}

object Color {
  @scala.inline
  def apply(color: String, focused: Boolean): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

