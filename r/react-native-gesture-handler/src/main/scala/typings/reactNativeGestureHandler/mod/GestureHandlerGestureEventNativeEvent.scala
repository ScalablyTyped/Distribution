package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureHandlerGestureEventNativeEvent extends StObject {
  
  var handlerTag: Double = js.native
  
  var numberOfPointers: Double = js.native
  
  var state: State = js.native
}
object GestureHandlerGestureEventNativeEvent {
  
  @scala.inline
  def apply(handlerTag: Double, numberOfPointers: Double, state: State): GestureHandlerGestureEventNativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerGestureEventNativeEvent]
  }
  
  @scala.inline
  implicit class GestureHandlerGestureEventNativeEventMutableBuilder[Self <: GestureHandlerGestureEventNativeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
