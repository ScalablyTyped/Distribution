package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureHandlerStateChangeNativeEvent extends js.Object {
  var handlerTag: Double
  var numberOfPointers: Double
  var oldState: State
  var state: State
}

object GestureHandlerStateChangeNativeEvent {
  @scala.inline
  def apply(handlerTag: Double, numberOfPointers: Double, oldState: State, state: State): GestureHandlerStateChangeNativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GestureHandlerStateChangeNativeEvent]
  }
}

