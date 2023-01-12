package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedEffectTiming
  extends StObject
     with EffectTiming {
  
  /* standard dom */
  var activeDuration: js.UndefOr[CSSNumberish] = js.undefined
  
  /* standard dom */
  var currentIteration: js.UndefOr[Double | Null] = js.undefined
  
  /* standard dom */
  var endTime: js.UndefOr[CSSNumberish] = js.undefined
  
  /* standard dom */
  var localTime: js.UndefOr[CSSNumberish | Null] = js.undefined
  
  /* standard dom */
  var progress: js.UndefOr[Double | Null] = js.undefined
  
  /* standard dom */
  var startTime: js.UndefOr[CSSNumberish] = js.undefined
}
object ComputedEffectTiming {
  
  inline def apply(): ComputedEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedEffectTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputedEffectTiming] (val x: Self) extends AnyVal {
    
    inline def setActiveDuration(value: CSSNumberish): Self = StObject.set(x, "activeDuration", value.asInstanceOf[js.Any])
    
    inline def setActiveDurationUndefined: Self = StObject.set(x, "activeDuration", js.undefined)
    
    inline def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
    
    inline def setCurrentIterationNull: Self = StObject.set(x, "currentIteration", null)
    
    inline def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
    
    inline def setEndTime(value: CSSNumberish): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLocalTime(value: CSSNumberish): Self = StObject.set(x, "localTime", value.asInstanceOf[js.Any])
    
    inline def setLocalTimeNull: Self = StObject.set(x, "localTime", null)
    
    inline def setLocalTimeUndefined: Self = StObject.set(x, "localTime", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStartTime(value: CSSNumberish): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
