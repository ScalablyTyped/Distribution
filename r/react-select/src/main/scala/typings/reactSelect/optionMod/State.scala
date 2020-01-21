package typings.reactSelect.optionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Whether the option is disabled. */
  var isDisabled: Boolean
  /** Whether the option is focused. */
  var isFocused: Boolean
  /** Whether the option is selected. */
  var isSelected: Boolean
}

object State {
  @scala.inline
  def apply(isDisabled: Boolean, isFocused: Boolean, isSelected: Boolean): State = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

