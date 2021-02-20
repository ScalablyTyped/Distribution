package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateOpts extends StObject {
  
  /** This is called when the animation is complete.
  	 * @param value the final value of the animation
  	 */
  var complete: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  /** The duration for the transition in milliseconds. */
  var duration: js.UndefOr[Double] = js.native
  
  /** An easing name e.g. 'ease' or an easing function. */
  var easing: js.UndefOr[String | Easing] = js.native
  
  /** An interpolator name or function. */
  var interpolator: js.UndefOr[String | Interpolator] = js.native
  
  /** This is called when an animation frame is applied.
  	 * @param time the current time code as a number between 0 and 1
  	 * @param value the value computed for the current time code
  	 */
  var step: js.UndefOr[js.Function2[/* time */ Double, /* value */ js.Any, Unit]] = js.native
}
object AnimateOpts {
  
  @scala.inline
  def apply(): AnimateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateOpts]
  }
  
  @scala.inline
  implicit class AnimateOptsMutableBuilder[Self <: AnimateOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* value */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String | Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingFunction1(value: /* time */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setInterpolator(value: String | Interpolator): Self = StObject.set(x, "interpolator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolatorFunction2(value: (/* from */ js.Any, /* to */ js.Any) => js.Function1[/* t */ Double, js.Any]): Self = StObject.set(x, "interpolator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterpolatorUndefined: Self = StObject.set(x, "interpolator", js.undefined)
    
    @scala.inline
    def setStep(value: (/* time */ Double, /* value */ js.Any) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
