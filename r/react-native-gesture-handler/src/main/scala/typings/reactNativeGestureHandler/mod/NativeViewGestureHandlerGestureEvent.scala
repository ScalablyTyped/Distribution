package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeViewGestureHandlerGestureEvent
  extends StObject
     with GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_NativeViewGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent & NativeViewGestureHandlerEventExtra
}
object NativeViewGestureHandlerGestureEvent {
  
  inline def apply(nativeEvent: GestureHandlerGestureEventNativeEvent & NativeViewGestureHandlerEventExtra): NativeViewGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeViewGestureHandlerGestureEvent]
  }
  
  extension [Self <: NativeViewGestureHandlerGestureEvent](x: Self) {
    
    inline def setNativeEvent(value: GestureHandlerGestureEventNativeEvent & NativeViewGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
