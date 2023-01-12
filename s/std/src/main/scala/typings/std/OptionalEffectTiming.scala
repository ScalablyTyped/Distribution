package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalEffectTiming extends StObject {
  
  /* standard dom */
  var delay: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var direction: js.UndefOr[PlaybackDirection] = js.undefined
  
  /* standard dom */
  var duration: js.UndefOr[Double | java.lang.String] = js.undefined
  
  /* standard dom */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var endDelay: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var fill: js.UndefOr[FillMode] = js.undefined
  
  /* standard dom */
  var iterationStart: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var iterations: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var playbackRate: js.UndefOr[Double] = js.undefined
}
object OptionalEffectTiming {
  
  inline def apply(): OptionalEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalEffectTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalEffectTiming] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDirection(value: PlaybackDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDuration(value: Double | java.lang.String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEndDelay(value: Double): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
    
    inline def setEndDelayUndefined: Self = StObject.set(x, "endDelay", js.undefined)
    
    inline def setFill(value: FillMode): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setIterationStart(value: Double): Self = StObject.set(x, "iterationStart", value.asInstanceOf[js.Any])
    
    inline def setIterationStartUndefined: Self = StObject.set(x, "iterationStart", js.undefined)
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
  }
}
