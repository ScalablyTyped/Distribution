package typings.reduxDevtoolsInstrument.mod

import typings.redux.mod.Action
import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.PERFORM_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformAction[A /* <: Action[Any] */]
  extends StObject
     with LiftedAction[Any, A, Any] {
  
  var action: A
  
  var stack: js.UndefOr[String] = js.undefined
  
  var timestamp: Double
  
  var `type`: PERFORM_ACTION
}
object PerformAction {
  
  inline def apply[A /* <: Action[Any] */](action: A, timestamp: Double): PerformAction[A] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PERFORM_ACTION")
    __obj.asInstanceOf[PerformAction[A]]
  }
  
  extension [Self <: PerformAction[?], A /* <: Action[Any] */](x: Self & PerformAction[A]) {
    
    inline def setAction(value: A): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: PERFORM_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
