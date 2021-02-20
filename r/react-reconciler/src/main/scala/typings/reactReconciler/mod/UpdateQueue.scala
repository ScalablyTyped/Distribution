package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateQueue[State] extends StObject {
  
  var baseState: State = js.native
  
  var firstCapturedEffect: Update[State] | Null = js.native
  
  var firstCapturedUpdate: Update[State] | Null = js.native
  
  var firstEffect: Update[State] | Null = js.native
  
  var firstUpdate: Update[State] | Null = js.native
  
  var lastCapturedEffect: Update[State] | Null = js.native
  
  var lastCapturedUpdate: Update[State] | Null = js.native
  
  var lastEffect: Update[State] | Null = js.native
  
  var lastUpdate: Update[State] | Null = js.native
}
object UpdateQueue {
  
  @scala.inline
  def apply[State](baseState: State): UpdateQueue[State] = {
    val __obj = js.Dynamic.literal(baseState = baseState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueue[State]]
  }
  
  @scala.inline
  implicit class UpdateQueueMutableBuilder[Self <: UpdateQueue[_], State] (val x: Self with UpdateQueue[State]) extends AnyVal {
    
    @scala.inline
    def setBaseState(value: State): Self = StObject.set(x, "baseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCapturedEffect(value: Update[State]): Self = StObject.set(x, "firstCapturedEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCapturedEffectNull: Self = StObject.set(x, "firstCapturedEffect", null)
    
    @scala.inline
    def setFirstCapturedUpdate(value: Update[State]): Self = StObject.set(x, "firstCapturedUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCapturedUpdateNull: Self = StObject.set(x, "firstCapturedUpdate", null)
    
    @scala.inline
    def setFirstEffect(value: Update[State]): Self = StObject.set(x, "firstEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstEffectNull: Self = StObject.set(x, "firstEffect", null)
    
    @scala.inline
    def setFirstUpdate(value: Update[State]): Self = StObject.set(x, "firstUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUpdateNull: Self = StObject.set(x, "firstUpdate", null)
    
    @scala.inline
    def setLastCapturedEffect(value: Update[State]): Self = StObject.set(x, "lastCapturedEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCapturedEffectNull: Self = StObject.set(x, "lastCapturedEffect", null)
    
    @scala.inline
    def setLastCapturedUpdate(value: Update[State]): Self = StObject.set(x, "lastCapturedUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCapturedUpdateNull: Self = StObject.set(x, "lastCapturedUpdate", null)
    
    @scala.inline
    def setLastEffect(value: Update[State]): Self = StObject.set(x, "lastEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEffectNull: Self = StObject.set(x, "lastEffect", null)
    
    @scala.inline
    def setLastUpdate(value: Update[State]): Self = StObject.set(x, "lastUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateNull: Self = StObject.set(x, "lastUpdate", null)
  }
}
