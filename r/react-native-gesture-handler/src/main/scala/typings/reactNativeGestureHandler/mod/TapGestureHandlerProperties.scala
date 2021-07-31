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
  
  @scala.inline
  def apply(): TapGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class TapGestureHandlerPropertiesMutableBuilder[Self <: TapGestureHandlerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxDelayMs(value: Double): Self = StObject.set(x, "maxDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDelayMsUndefined: Self = StObject.set(x, "maxDelayMs", js.undefined)
    
    @scala.inline
    def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
    
    @scala.inline
    def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
    
    @scala.inline
    def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
    
    @scala.inline
    def setMaxDurationMs(value: Double): Self = StObject.set(x, "maxDurationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationMsUndefined: Self = StObject.set(x, "maxDurationMs", js.undefined)
    
    @scala.inline
    def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    @scala.inline
    def setNumberOfTaps(value: Double): Self = StObject.set(x, "numberOfTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTapsUndefined: Self = StObject.set(x, "numberOfTaps", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ TapGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ TapGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
