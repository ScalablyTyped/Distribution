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
  
  @scala.inline
  def apply(): ComputedEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedEffectTiming]
  }
  
  @scala.inline
  implicit class ComputedEffectTimingMutableBuilder[Self <: ComputedEffectTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveDuration(value: Double): Self = StObject.set(x, "activeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDurationUndefined: Self = StObject.set(x, "activeDuration", js.undefined)
    
    @scala.inline
    def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIterationNull: Self = StObject.set(x, "currentIteration", null)
    
    @scala.inline
    def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
    
    @scala.inline
    def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setLocalTime(value: Double): Self = StObject.set(x, "localTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalTimeNull: Self = StObject.set(x, "localTime", null)
    
    @scala.inline
    def setLocalTimeUndefined: Self = StObject.set(x, "localTime", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressNull: Self = StObject.set(x, "progress", null)
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
