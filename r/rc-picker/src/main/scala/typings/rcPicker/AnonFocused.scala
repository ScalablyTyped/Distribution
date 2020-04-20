package typings.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocused extends js.Object {
  var focused: Boolean
  var typing: Boolean
}

object AnonFocused {
  @scala.inline
  def apply(focused: Boolean, typing: Boolean): AnonFocused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocused]
  }
}

