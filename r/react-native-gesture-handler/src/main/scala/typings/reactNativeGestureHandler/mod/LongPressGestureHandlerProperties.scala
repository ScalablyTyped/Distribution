package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongPressGestureHandlerProperties extends GestureHandlerProperties {
  
  var maxDist: js.UndefOr[Double] = js.native
  
  var minDurationMs: js.UndefOr[Double] = js.native
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ LongPressGestureHandlerGestureEvent, Unit]] = js.native
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ LongPressGestureHandlerStateChangeEvent, Unit]] = js.native
}
object LongPressGestureHandlerProperties {
  
  @scala.inline
  def apply(): LongPressGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPressGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class LongPressGestureHandlerPropertiesMutableBuilder[Self <: LongPressGestureHandlerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
    
    @scala.inline
    def setMinDurationMs(value: Double): Self = StObject.set(x, "minDurationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDurationMsUndefined: Self = StObject.set(x, "minDurationMs", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ LongPressGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ LongPressGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
