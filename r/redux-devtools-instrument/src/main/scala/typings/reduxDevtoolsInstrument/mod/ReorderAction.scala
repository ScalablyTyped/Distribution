package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.REORDER_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReorderAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var actionId: Double
  
  var beforeActionId: Double
  
  var `type`: REORDER_ACTION
}
object ReorderAction {
  
  inline def apply(actionId: Double, beforeActionId: Double): ReorderAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], beforeActionId = beforeActionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REORDER_ACTION")
    __obj.asInstanceOf[ReorderAction]
  }
  
  extension [Self <: ReorderAction](x: Self) {
    
    inline def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setBeforeActionId(value: Double): Self = StObject.set(x, "beforeActionId", value.asInstanceOf[js.Any])
    
    inline def setType(value: REORDER_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
