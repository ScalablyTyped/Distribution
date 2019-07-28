package typings.reactDashSelect.srcComponentsControlMod

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
    val __obj = js.Dynamic.literal(isDisabled = isDisabled, isFocused = isFocused)
  
    __obj.asInstanceOf[State]
  }
}

