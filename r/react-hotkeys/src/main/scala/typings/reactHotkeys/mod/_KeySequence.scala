package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _KeySequence extends StObject
object _KeySequence {
  
  inline def ExtendedKeyMapOptions(
    action: KeyEventName,
    sequence: MouseTrapKeySequence,
    sequences: js.Array[KeyMapOptions | MouseTrapKeySequence]
  ): typings.reactHotkeys.mod.ExtendedKeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactHotkeys.mod.ExtendedKeyMapOptions]
  }
  
  inline def KeyMapOptions(action: KeyEventName, sequence: MouseTrapKeySequence): typings.reactHotkeys.mod.KeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactHotkeys.mod.KeyMapOptions]
  }
}
