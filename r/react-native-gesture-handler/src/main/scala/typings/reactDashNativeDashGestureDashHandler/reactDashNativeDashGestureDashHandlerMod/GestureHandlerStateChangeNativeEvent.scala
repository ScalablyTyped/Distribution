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
    val __obj = js.Dynamic.literal(handlerTag = handlerTag, numberOfPointers = numberOfPointers, oldState = oldState, state = state)
  
    __obj.asInstanceOf[GestureHandlerStateChangeNativeEvent]
  }
}

