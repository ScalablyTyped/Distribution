package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementAnimation extends StObject {
  
  var duration: Double = js.native
  
  var interpolation: js.UndefOr[Interpolation] = js.native
  
  var startDelay: js.UndefOr[Double] = js.native
}
object ElementAnimation {
  
  @scala.inline
  def apply(duration: Double): ElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAnimation]
  }
  
  @scala.inline
  implicit class ElementAnimationMutableBuilder[Self <: ElementAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolation(value: Interpolation): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
  }
}
