package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchableWithoutFeedbackPropsIOS extends StObject {
  
  /**
    * *(Apple TV only)* TV preferred focus (see documentation for the View component).
    *
    * @platform ios
    */
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
    *
    * enabled: If true, parallax effects are enabled.  Defaults to true.
    * shiftDistanceX: Defaults to 2.0.
    * shiftDistanceY: Defaults to 2.0.
    * tiltAngle: Defaults to 0.05.
    * magnification: Defaults to 1.0.
    * pressMagnification: Defaults to 1.0.
    * pressDuration: Defaults to 0.3.
    * pressDelay: Defaults to 0.0.
    *
    * @platform ios
    */
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
}
object TouchableWithoutFeedbackPropsIOS {
  
  inline def apply(): TouchableWithoutFeedbackPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableWithoutFeedbackPropsIOS]
  }
  
  extension [Self <: TouchableWithoutFeedbackPropsIOS](x: Self) {
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
  }
}
