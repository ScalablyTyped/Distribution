package typings
package reactDashSelectLib.libComponentsOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Whether the option is disabled. */
  var isDisabled: scala.Boolean
  /** Whether the option is focused. */
  var isFocused: scala.Boolean
  /** Whether the option is selected. */
  var isSelected: scala.Boolean
}

object State {
  @scala.inline
  def apply(isDisabled: scala.Boolean, isFocused: scala.Boolean, isSelected: scala.Boolean): State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.updateDynamic("isFocused")(isFocused)
    __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[State]
  }
}

