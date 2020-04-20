package typings.reactSelect.controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Whether the select is disabled. */
  var isDisabled: Boolean
  /** Whether the select is focused. */
  var isFocused: Boolean
}

object State {
  @scala.inline
  def apply(isDisabled: Boolean, isFocused: Boolean): State = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

