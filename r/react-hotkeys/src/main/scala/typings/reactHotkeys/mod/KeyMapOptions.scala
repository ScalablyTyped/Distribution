package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMapOptions
  extends StObject
     with _KeySequence {
  
  var action: KeyEventName
  
  var sequence: MouseTrapKeySequence
}
object KeyMapOptions {
  
  @scala.inline
  def apply(action: KeyEventName, sequence: MouseTrapKeySequence): KeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapOptions]
  }
  
  @scala.inline
  implicit class KeyMapOptionsMutableBuilder[Self <: KeyMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: KeyEventName): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: MouseTrapKeySequence): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceVarargs(value: String*): Self = StObject.set(x, "sequence", js.Array(value :_*))
  }
}
