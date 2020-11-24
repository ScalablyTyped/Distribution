package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateOpts extends js.Object {
  
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
  implicit class AnimateOptsOps[Self <: AnimateOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplete(value: /* value */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasingFunction1(value: /* time */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEasing(value: String | Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setInterpolatorFunction2(value: (/* from */ js.Any, /* to */ js.Any) => js.Function1[/* t */ Double, js.Any]): Self = this.set("interpolator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterpolator(value: String | Interpolator): Self = this.set("interpolator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolator: Self = this.set("interpolator", js.undefined)
    
    @scala.inline
    def setStep(value: (/* time */ Double, /* value */ js.Any) => Unit): Self = this.set("step", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
