package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedEffectTiming
  extends StObject
     with EffectTiming {
  
  var activeDuration: js.UndefOr[Double] = js.undefined
  
  var currentIteration: js.UndefOr[Double | Null] = js.undefined
  
  var endTime: js.UndefOr[Double] = js.undefined
  
  var localTime: js.UndefOr[Double | Null] = js.undefined
  
  var progress: js.UndefOr[Double | Null] = js.undefined
}
object ComputedEffectTiming {
  
  inline def apply(): ComputedEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedEffectTiming]
  }
  
  extension [Self <: ComputedEffectTiming](x: Self) {
    
    inline def setActiveDuration(value: Double): Self = StObject.set(x, "activeDuration", value.asInstanceOf[js.Any])
    
    inline def setActiveDurationUndefined: Self = StObject.set(x, "activeDuration", js.undefined)
    
    inline def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
    
    inline def setCurrentIterationNull: Self = StObject.set(x, "currentIteration", null)
    
    inline def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLocalTime(value: Double): Self = StObject.set(x, "localTime", value.asInstanceOf[js.Any])
    
    inline def setLocalTimeNull: Self = StObject.set(x, "localTime", null)
    
    inline def setLocalTimeUndefined: Self = StObject.set(x, "localTime", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
