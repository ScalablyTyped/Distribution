package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsAnimationPropertyConfig extends StObject {
  
  /**
    * Animation duration
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Animate from this value, ex. 0
    */
  var from: js.UndefOr[Double] = js.undefined
  
  /**
    * Animation interplation
    */
  var interpolation: js.UndefOr[Interpolation] = js.undefined
  
  /**
    * Animation delay
    * @default 0
    */
  var startDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Animate to this value, ex. 1
    */
  var to: js.UndefOr[Double] = js.undefined
}
object OptionsAnimationPropertyConfig {
  
  inline def apply(): OptionsAnimationPropertyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsAnimationPropertyConfig]
  }
  
  extension [Self <: OptionsAnimationPropertyConfig](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setInterpolation(value: Interpolation): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
    
    inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
