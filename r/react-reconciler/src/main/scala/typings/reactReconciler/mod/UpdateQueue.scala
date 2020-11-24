package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateQueue[State] extends js.Object {
  
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
  implicit class UpdateQueueOps[Self <: UpdateQueue[_], State] (val x: Self with UpdateQueue[State]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseState(value: State): Self = this.set("baseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCapturedEffect(value: Update[State]): Self = this.set("firstCapturedEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCapturedEffectNull: Self = this.set("firstCapturedEffect", null)
    
    @scala.inline
    def setFirstCapturedUpdate(value: Update[State]): Self = this.set("firstCapturedUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCapturedUpdateNull: Self = this.set("firstCapturedUpdate", null)
    
    @scala.inline
    def setFirstEffect(value: Update[State]): Self = this.set("firstEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstEffectNull: Self = this.set("firstEffect", null)
    
    @scala.inline
    def setFirstUpdate(value: Update[State]): Self = this.set("firstUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUpdateNull: Self = this.set("firstUpdate", null)
    
    @scala.inline
    def setLastCapturedEffect(value: Update[State]): Self = this.set("lastCapturedEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCapturedEffectNull: Self = this.set("lastCapturedEffect", null)
    
    @scala.inline
    def setLastCapturedUpdate(value: Update[State]): Self = this.set("lastCapturedUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCapturedUpdateNull: Self = this.set("lastCapturedUpdate", null)
    
    @scala.inline
    def setLastEffect(value: Update[State]): Self = this.set("lastEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEffectNull: Self = this.set("lastEffect", null)
    
    @scala.inline
    def setLastUpdate(value: Update[State]): Self = this.set("lastUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateNull: Self = this.set("lastUpdate", null)
  }
}
