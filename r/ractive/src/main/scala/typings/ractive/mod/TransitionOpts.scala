package typings.ractive.mod

import typings.ractive.ractiveStrings.fast
import typings.ractive.ractiveStrings.slow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionOpts extends StObject {
  
  /** The delay in milliseconds to wait before triggering the transition. */
  var delay: js.UndefOr[Double] = js.native
  
  /** The duration for the transition in milliseconds, slow for 600ms, fast for 200ms, and any other string for 400ms. */
  var duration: js.UndefOr[Double | slow | fast | String] = js.native
  
  /** The easing to use for the transition. */
  var easing: js.UndefOr[String] = js.native
}
object TransitionOpts {
  
  @scala.inline
  def apply(): TransitionOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionOpts]
  }
  
  @scala.inline
  implicit class TransitionOptsMutableBuilder[Self <: TransitionOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double | slow | fast | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
