package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureHandlerStateChangeEvent extends StObject {
  
  var nativeEvent: GestureHandlerStateChangeNativeEvent
}
object GestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent): GestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class GestureHandlerStateChangeEventMutableBuilder[Self <: GestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
