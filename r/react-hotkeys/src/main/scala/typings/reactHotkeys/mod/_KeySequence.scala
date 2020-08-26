package typings.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KeySequence extends js.Object

object _KeySequence {
  @scala.inline
  def KeyMapOptions(action: KeyEventName, sequence: MouseTrapKeySequence): _KeySequence = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeySequence]
  }
  @scala.inline
  def ExtendedKeyMapOptions(
    action: KeyEventName,
    sequence: MouseTrapKeySequence,
    sequences: js.Array[KeyMapOptions | MouseTrapKeySequence]
  ): _KeySequence = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeySequence]
  }
}

