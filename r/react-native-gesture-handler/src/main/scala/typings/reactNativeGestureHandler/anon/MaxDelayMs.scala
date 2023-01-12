package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxDelayMs
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  var maxDelayMs: js.UndefOr[Double] = js.undefined
  
  var maxDeltaX: js.UndefOr[Double] = js.undefined
  
  var maxDeltaY: js.UndefOr[Double] = js.undefined
  
  var maxDist: js.UndefOr[Double] = js.undefined
  
  var maxDurationMs: js.UndefOr[Double] = js.undefined
  
  var maxPointers: js.UndefOr[Double] = js.undefined
  
  var minDurationMs: js.UndefOr[Double] = js.undefined
  
  var minPointers: js.UndefOr[Double] = js.undefined
  
  var numberOfTaps: js.UndefOr[Double] = js.undefined
  
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
}
object MaxDelayMs {
  
  inline def apply(): MaxDelayMs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxDelayMs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxDelayMs] (val x: Self) extends AnyVal {
    
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
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    inline def setMinDurationMs(value: Double): Self = StObject.set(x, "minDurationMs", value.asInstanceOf[js.Any])
    
    inline def setMinDurationMsUndefined: Self = StObject.set(x, "minDurationMs", js.undefined)
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    inline def setNumberOfTaps(value: Double): Self = StObject.set(x, "numberOfTaps", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTapsUndefined: Self = StObject.set(x, "numberOfTaps", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
  }
}
