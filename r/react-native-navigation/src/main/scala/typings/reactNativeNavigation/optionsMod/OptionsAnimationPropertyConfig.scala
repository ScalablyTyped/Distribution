package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsAnimationPropertyConfig extends StObject {
  
  /**
    * Animation duration
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Animate from this value, ex. 0
    */
  var from: js.UndefOr[Double] = js.native
  
  /**
    * Animation interplation
    */
  var interpolation: js.UndefOr[Interpolation] = js.native
  
  /**
    * Animation delay
    * @default 0
    */
  var startDelay: js.UndefOr[Double] = js.native
  
  /**
    * Animate to this value, ex. 1
    */
  var to: js.UndefOr[Double] = js.native
}
object OptionsAnimationPropertyConfig {
  
  @scala.inline
  def apply(): OptionsAnimationPropertyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsAnimationPropertyConfig]
  }
  
  @scala.inline
  implicit class OptionsAnimationPropertyConfigMutableBuilder[Self <: OptionsAnimationPropertyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setInterpolation(value: Interpolation): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
