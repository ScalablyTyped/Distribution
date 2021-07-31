package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureHandlerGestureEvent extends StObject {
  
  var nativeEvent: GestureHandlerGestureEventNativeEvent
}
object GestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent): GestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class GestureHandlerGestureEventMutableBuilder[Self <: GestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
