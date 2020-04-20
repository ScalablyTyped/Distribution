package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureHandlerGestureEventNativeEvent extends js.Object {
  var handlerTag: Double
  var numberOfPointers: Double
  var state: State
}

object GestureHandlerGestureEventNativeEvent {
  @scala.inline
  def apply(handlerTag: Double, numberOfPointers: Double, state: State): GestureHandlerGestureEventNativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerGestureEventNativeEvent]
  }
}

