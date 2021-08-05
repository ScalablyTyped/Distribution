package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongPressGestureHandlerProperties
  extends StObject
     with GestureHandlerProperties {
  
  var maxDist: js.UndefOr[Double] = js.undefined
  
  var minDurationMs: js.UndefOr[Double] = js.undefined
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ LongPressGestureHandlerGestureEvent, Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ LongPressGestureHandlerStateChangeEvent, Unit]] = js.undefined
}
object LongPressGestureHandlerProperties {
  
  inline def apply(): LongPressGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPressGestureHandlerProperties]
  }
  
  extension [Self <: LongPressGestureHandlerProperties](x: Self) {
    
    inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
    
    inline def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
    
    inline def setMinDurationMs(value: Double): Self = StObject.set(x, "minDurationMs", value.asInstanceOf[js.Any])
    
    inline def setMinDurationMsUndefined: Self = StObject.set(x, "minDurationMs", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ LongPressGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ LongPressGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
