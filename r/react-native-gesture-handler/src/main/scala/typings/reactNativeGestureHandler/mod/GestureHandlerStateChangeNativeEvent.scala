package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureHandlerStateChangeNativeEvent extends js.Object {
  
  var handlerTag: Double = js.native
  
  var numberOfPointers: Double = js.native
  
  var oldState: State = js.native
  
  var state: State = js.native
}
object GestureHandlerStateChangeNativeEvent {
  
  @scala.inline
  def apply(handlerTag: Double, numberOfPointers: Double, oldState: State, state: State): GestureHandlerStateChangeNativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerStateChangeNativeEvent]
  }
  
  @scala.inline
  implicit class GestureHandlerStateChangeNativeEventOps[Self <: GestureHandlerStateChangeNativeEvent] (val x: Self) extends AnyVal {
    
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
    def setHandlerTag(value: Double): Self = this.set("handlerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfPointers(value: Double): Self = this.set("numberOfPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: State): Self = this.set("oldState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
