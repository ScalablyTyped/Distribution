package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationEventPayload extends StObject {
  
  var action: NavigationAction
  
  var lastState: js.UndefOr[NavigationState | Null] = js.undefined
  
  var state: NavigationState
  
  var `type`: EventType
}
object NavigationEventPayload {
  
  inline def apply(action: NavigationAction, state: NavigationState, `type`: EventType): NavigationEventPayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEventPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationEventPayload] (val x: Self) extends AnyVal {
    
    inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setLastState(value: NavigationState): Self = StObject.set(x, "lastState", value.asInstanceOf[js.Any])
    
    inline def setLastStateNull: Self = StObject.set(x, "lastState", null)
    
    inline def setLastStateUndefined: Self = StObject.set(x, "lastState", js.undefined)
    
    inline def setState(value: NavigationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
