package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanGestureHandlerProperties
  extends StObject
     with GestureHandlerProperties {
  
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var avgTouches: js.UndefOr[Boolean] = js.undefined
  
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /** @deprecated  use failOffsetX*/
  var maxDeltaX: js.UndefOr[Double] = js.undefined
  
  /** @deprecated  use failOffsetY*/
  var maxDeltaY: js.UndefOr[Double] = js.undefined
  
  var maxPointers: js.UndefOr[Double] = js.undefined
  
  /** @deprecated  use activeOffsetX*/
  var minDeltaX: js.UndefOr[Double] = js.undefined
  
  /** @deprecated  use activeOffsetY*/
  var minDeltaY: js.UndefOr[Double] = js.undefined
  
  var minDist: js.UndefOr[Double] = js.undefined
  
  /** @deprecated  use activeOffsetX*/
  var minOffsetX: js.UndefOr[Double] = js.undefined
  
  /** @deprecated  use failOffsetY*/
  var minOffsetY: js.UndefOr[Double] = js.undefined
  
  var minPointers: js.UndefOr[Double] = js.undefined
  
  var minVelocity: js.UndefOr[Double] = js.undefined
  
  var minVelocityX: js.UndefOr[Double] = js.undefined
  
  var minVelocityY: js.UndefOr[Double] = js.undefined
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ PanGestureHandlerGestureEvent, Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PanGestureHandlerStateChangeEvent, Unit]] = js.undefined
}
object PanGestureHandlerProperties {
  
  inline def apply(): PanGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanGestureHandlerProperties]
  }
  
  extension [Self <: PanGestureHandlerProperties](x: Self) {
    
    inline def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
    
    inline def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value :_*))
    
    inline def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
    
    inline def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value :_*))
    
    inline def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
    
    inline def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
    
    inline def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
    
    inline def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value :_*))
    
    inline def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
    
    inline def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value :_*))
    
    inline def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
    
    inline def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
    
    inline def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
    
    inline def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    inline def setMinDeltaX(value: Double): Self = StObject.set(x, "minDeltaX", value.asInstanceOf[js.Any])
    
    inline def setMinDeltaXUndefined: Self = StObject.set(x, "minDeltaX", js.undefined)
    
    inline def setMinDeltaY(value: Double): Self = StObject.set(x, "minDeltaY", value.asInstanceOf[js.Any])
    
    inline def setMinDeltaYUndefined: Self = StObject.set(x, "minDeltaY", js.undefined)
    
    inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
    
    inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
    
    inline def setMinOffsetX(value: Double): Self = StObject.set(x, "minOffsetX", value.asInstanceOf[js.Any])
    
    inline def setMinOffsetXUndefined: Self = StObject.set(x, "minOffsetX", js.undefined)
    
    inline def setMinOffsetY(value: Double): Self = StObject.set(x, "minOffsetY", value.asInstanceOf[js.Any])
    
    inline def setMinOffsetYUndefined: Self = StObject.set(x, "minOffsetY", js.undefined)
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
    
    inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
    
    inline def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
    
    inline def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
    
    inline def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
    
    inline def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ PanGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ PanGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
