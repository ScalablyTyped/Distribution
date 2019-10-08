package typings.reactDashHotkeys.reactDashHotkeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMapOptions extends js.Object {
  var action: KeyEventName
  var sequence: MouseTrapKeySequence
}

object KeyMapOptions {
  @scala.inline
  def apply(action: KeyEventName, sequence: MouseTrapKeySequence): KeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action, sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyMapOptions]
  }
}

