package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimateOpts extends StObject {
  
  /** This is called when the animation is complete.
  	 * @param value the final value of the animation
  	 */
  var complete: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  
  /** The duration for the transition in milliseconds. */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** An easing name e.g. 'ease' or an easing function. */
  var easing: js.UndefOr[String | Easing] = js.undefined
  
  /** An interpolator name or function. */
  var interpolator: js.UndefOr[String | Interpolator] = js.undefined
  
  /** This is called when an animation frame is applied.
  	 * @param time the current time code as a number between 0 and 1
  	 * @param value the value computed for the current time code
  	 */
  var step: js.UndefOr[js.Function2[/* time */ Double, /* value */ js.Any, Unit]] = js.undefined
}
object AnimateOpts {
  
  inline def apply(): AnimateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateOpts]
  }
  
  extension [Self <: AnimateOpts](x: Self) {
    
    inline def setComplete(value: /* value */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String | Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction1(value: /* time */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setInterpolator(value: String | Interpolator): Self = StObject.set(x, "interpolator", value.asInstanceOf[js.Any])
    
    inline def setInterpolatorFunction2(value: (/* from */ js.Any, /* to */ js.Any) => js.Function1[/* t */ Double, js.Any]): Self = StObject.set(x, "interpolator", js.Any.fromFunction2(value))
    
    inline def setInterpolatorUndefined: Self = StObject.set(x, "interpolator", js.undefined)
    
    inline def setStep(value: (/* time */ Double, /* value */ js.Any) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
