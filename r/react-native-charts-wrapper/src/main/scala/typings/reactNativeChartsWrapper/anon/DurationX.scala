package typings.reactNativeChartsWrapper.anon

import typings.reactNativeChartsWrapper.mod.EasingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationX extends StObject {
  
  var durationX: js.UndefOr[Double] = js.undefined
  
  var durationY: js.UndefOr[Double] = js.undefined
  
  var easingX: js.UndefOr[EasingType] = js.undefined
  
  var easingY: js.UndefOr[EasingType] = js.undefined
}
object DurationX {
  
  inline def apply(): DurationX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationX]
  }
  
  extension [Self <: DurationX](x: Self) {
    
    inline def setDurationX(value: Double): Self = StObject.set(x, "durationX", value.asInstanceOf[js.Any])
    
    inline def setDurationXUndefined: Self = StObject.set(x, "durationX", js.undefined)
    
    inline def setDurationY(value: Double): Self = StObject.set(x, "durationY", value.asInstanceOf[js.Any])
    
    inline def setDurationYUndefined: Self = StObject.set(x, "durationY", js.undefined)
    
    inline def setEasingX(value: EasingType): Self = StObject.set(x, "easingX", value.asInstanceOf[js.Any])
    
    inline def setEasingXUndefined: Self = StObject.set(x, "easingX", js.undefined)
    
    inline def setEasingY(value: EasingType): Self = StObject.set(x, "easingY", value.asInstanceOf[js.Any])
    
    inline def setEasingYUndefined: Self = StObject.set(x, "easingY", js.undefined)
  }
}
