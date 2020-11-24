package typings.reduxOptimisticUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimisticState[TState] extends js.Object {
  
  /**
    * Before state
    */
  var beforeState: TState = js.native
  
  /**
    * Current state
    */
  var current: TState = js.native
  
  /**
    * History list
    * List is Immutable.List<>
    */
  var history: js.Any = js.native
}
object OptimisticState {
  
  @scala.inline
  def apply[TState](beforeState: TState, current: TState, history: js.Any): OptimisticState[TState] = {
    val __obj = js.Dynamic.literal(beforeState = beforeState.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticState[TState]]
  }
  
  @scala.inline
  implicit class OptimisticStateOps[Self <: OptimisticState[_], TState] (val x: Self with OptimisticState[TState]) extends AnyVal {
    
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
    def setBeforeState(value: TState): Self = this.set("beforeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: TState): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: js.Any): Self = this.set("history", value.asInstanceOf[js.Any])
  }
}
