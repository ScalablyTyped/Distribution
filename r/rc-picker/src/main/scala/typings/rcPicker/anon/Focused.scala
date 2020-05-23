package typings.rcPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focused extends js.Object {
  var focused: Boolean
  var typing: Boolean
}

object Focused {
  @scala.inline
  def apply(focused: Boolean, typing: Boolean): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
}

