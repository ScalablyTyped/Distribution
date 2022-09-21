package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisallowInterruption
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  var disallowInterruption: js.UndefOr[Boolean] = js.undefined
  
  var maxDist: js.UndefOr[Double] = js.undefined
  
  var maxPointers: js.UndefOr[Double] = js.undefined
  
  var minDurationMs: js.UndefOr[Double] = js.undefined
  
  var minPointers: js.UndefOr[Double] = js.undefined
  
  var shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
  
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
}
object DisallowInterruption {
  
  inline def apply(): DisallowInterruption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisallowInterruption]
  }
  
  extension [Self <: DisallowInterruption](x: Self) {
    
    inline def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
    
    inline def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
    
    inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
    
    inline def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    inline def setMinDurationMs(value: Double): Self = StObject.set(x, "minDurationMs", value.asInstanceOf[js.Any])
    
    inline def setMinDurationMsUndefined: Self = StObject.set(x, "minDurationMs", js.undefined)
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    inline def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    inline def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
  }
}
