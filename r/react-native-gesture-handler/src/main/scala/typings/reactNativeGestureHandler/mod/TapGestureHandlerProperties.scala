package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapGestureHandlerProperties
  extends StObject
     with GestureHandlerProperties {
  
  var maxDelayMs: js.UndefOr[Double] = js.undefined
  
  var maxDeltaX: js.UndefOr[Double] = js.undefined
  
  var maxDeltaY: js.UndefOr[Double] = js.undefined
  
  var maxDist: js.UndefOr[Double] = js.undefined
  
  var maxDurationMs: js.UndefOr[Double] = js.undefined
  
  var minPointers: js.UndefOr[Double] = js.undefined
  
  var numberOfTaps: js.UndefOr[Double] = js.undefined
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ TapGestureHandlerGestureEvent, Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ TapGestureHandlerStateChangeEvent, Unit]] = js.undefined
}
object TapGestureHandlerProperties {
  
  inline def apply(): TapGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapGestureHandlerProperties]
  }
  
  extension [Self <: TapGestureHandlerProperties](x: Self) {
    
    inline def setMaxDelayMs(value: Double): Self = StObject.set(x, "maxDelayMs", value.asInstanceOf[js.Any])
    
    inline def setMaxDelayMsUndefined: Self = StObject.set(x, "maxDelayMs", js.undefined)
    
    inline def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
    
    inline def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
    
    inline def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
    
    inline def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
    
    inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
    
    inline def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
    
    inline def setMaxDurationMs(value: Double): Self = StObject.set(x, "maxDurationMs", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationMsUndefined: Self = StObject.set(x, "maxDurationMs", js.undefined)
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    inline def setNumberOfTaps(value: Double): Self = StObject.set(x, "numberOfTaps", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTapsUndefined: Self = StObject.set(x, "numberOfTaps", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ TapGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ TapGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
