package typings.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMapOptions extends _KeySequence {
  var action: KeyEventName
  var sequence: MouseTrapKeySequence
}

object KeyMapOptions {
  @scala.inline
  def apply(action: KeyEventName, sequence: MouseTrapKeySequence): KeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyMapOptions]
  }
}

