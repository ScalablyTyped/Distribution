package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeViewGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_NativeViewGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with NativeViewGestureHandlerEventExtra = js.native
}
object NativeViewGestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with NativeViewGestureHandlerEventExtra): NativeViewGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeViewGestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class NativeViewGestureHandlerGestureEventMutableBuilder[Self <: NativeViewGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent with NativeViewGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
