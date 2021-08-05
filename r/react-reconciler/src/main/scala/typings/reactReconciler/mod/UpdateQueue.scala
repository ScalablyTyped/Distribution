package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueue[State] extends StObject {
  
  var baseState: State
  
  var firstCapturedEffect: Update[State] | Null
  
  var firstCapturedUpdate: Update[State] | Null
  
  var firstEffect: Update[State] | Null
  
  var firstUpdate: Update[State] | Null
  
  var lastCapturedEffect: Update[State] | Null
  
  var lastCapturedUpdate: Update[State] | Null
  
  var lastEffect: Update[State] | Null
  
  var lastUpdate: Update[State] | Null
}
object UpdateQueue {
  
  inline def apply[State](baseState: State): UpdateQueue[State] = {
    val __obj = js.Dynamic.literal(baseState = baseState.asInstanceOf[js.Any], firstCapturedEffect = null, firstCapturedUpdate = null, firstEffect = null, firstUpdate = null, lastCapturedEffect = null, lastCapturedUpdate = null, lastEffect = null, lastUpdate = null)
    __obj.asInstanceOf[UpdateQueue[State]]
  }
  
  extension [Self <: UpdateQueue[?], State](x: Self & UpdateQueue[State]) {
    
    inline def setBaseState(value: State): Self = StObject.set(x, "baseState", value.asInstanceOf[js.Any])
    
    inline def setFirstCapturedEffect(value: Update[State]): Self = StObject.set(x, "firstCapturedEffect", value.asInstanceOf[js.Any])
    
    inline def setFirstCapturedEffectNull: Self = StObject.set(x, "firstCapturedEffect", null)
    
    inline def setFirstCapturedUpdate(value: Update[State]): Self = StObject.set(x, "firstCapturedUpdate", value.asInstanceOf[js.Any])
    
    inline def setFirstCapturedUpdateNull: Self = StObject.set(x, "firstCapturedUpdate", null)
    
    inline def setFirstEffect(value: Update[State]): Self = StObject.set(x, "firstEffect", value.asInstanceOf[js.Any])
    
    inline def setFirstEffectNull: Self = StObject.set(x, "firstEffect", null)
    
    inline def setFirstUpdate(value: Update[State]): Self = StObject.set(x, "firstUpdate", value.asInstanceOf[js.Any])
    
    inline def setFirstUpdateNull: Self = StObject.set(x, "firstUpdate", null)
    
    inline def setLastCapturedEffect(value: Update[State]): Self = StObject.set(x, "lastCapturedEffect", value.asInstanceOf[js.Any])
    
    inline def setLastCapturedEffectNull: Self = StObject.set(x, "lastCapturedEffect", null)
    
    inline def setLastCapturedUpdate(value: Update[State]): Self = StObject.set(x, "lastCapturedUpdate", value.asInstanceOf[js.Any])
    
    inline def setLastCapturedUpdateNull: Self = StObject.set(x, "lastCapturedUpdate", null)
    
    inline def setLastEffect(value: Update[State]): Self = StObject.set(x, "lastEffect", value.asInstanceOf[js.Any])
    
    inline def setLastEffectNull: Self = StObject.set(x, "lastEffect", null)
    
    inline def setLastUpdate(value: Update[State]): Self = StObject.set(x, "lastUpdate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateNull: Self = StObject.set(x, "lastUpdate", null)
  }
}
