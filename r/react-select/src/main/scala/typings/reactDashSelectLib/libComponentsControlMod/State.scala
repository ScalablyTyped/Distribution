package typings
package reactDashSelectLib.libComponentsControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Whether the select is disabled. */
  var isDisabled: scala.Boolean
  /** Whether the select is focused. */
  var isFocused: scala.Boolean
}

object State {
  @scala.inline
  def apply(isDisabled: scala.Boolean, isFocused: scala.Boolean): State = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled, isFocused = isFocused)
  
    __obj.asInstanceOf[State]
  }
}

