package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchGestureHandlerProperties
  extends StObject
     with GestureHandlerProperties {
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ PinchGestureHandlerGestureEvent, Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PinchGestureHandlerStateChangeEvent, Unit]] = js.undefined
}
object PinchGestureHandlerProperties {
  
  inline def apply(): PinchGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinchGestureHandlerProperties]
  }
  
  extension [Self <: PinchGestureHandlerProperties](x: Self) {
    
    inline def setOnGestureEvent(value: /* event */ PinchGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ PinchGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
