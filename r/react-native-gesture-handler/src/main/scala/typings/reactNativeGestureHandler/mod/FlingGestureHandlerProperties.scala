package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlingGestureHandlerProperties
  extends StObject
     with GestureHandlerProperties {
  
  var direction: js.UndefOr[Double] = js.undefined
  
  var numberOfPointers: js.UndefOr[Double] = js.undefined
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerGestureEvent, Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerStateChangeEvent, Unit]] = js.undefined
}
object FlingGestureHandlerProperties {
  
  inline def apply(): FlingGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlingGestureHandlerProperties]
  }
  
  extension [Self <: FlingGestureHandlerProperties](x: Self) {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPointersUndefined: Self = StObject.set(x, "numberOfPointers", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ FlingGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ FlingGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
