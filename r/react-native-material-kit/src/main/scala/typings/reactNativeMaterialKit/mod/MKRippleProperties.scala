package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MKRippleProperties
  extends StObject
     with ViewProps {
  
  var maskBorderRadius: js.UndefOr[Double] = js.undefined
  
  var maskBorderRadiusInPercent: js.UndefOr[Double] = js.undefined
  
  var maskColor: js.UndefOr[String] = js.undefined
  
  var maskDuration: js.UndefOr[Double] = js.undefined
  
  var maskEnabled: js.UndefOr[Boolean] = js.undefined
  
  var rippleColor: js.UndefOr[String] = js.undefined
  
  var rippleDuration: js.UndefOr[Double] = js.undefined
  
  var rippleLocation: js.UndefOr[typings.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation] = js.undefined
  
  var shadowAniEnabled: js.UndefOr[Boolean] = js.undefined
}
object MKRippleProperties {
  
  inline def apply(): MKRippleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKRippleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MKRippleProperties] (val x: Self) extends AnyVal {
    
    inline def setMaskBorderRadius(value: Double): Self = StObject.set(x, "maskBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderRadiusInPercent(value: Double): Self = StObject.set(x, "maskBorderRadiusInPercent", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderRadiusInPercentUndefined: Self = StObject.set(x, "maskBorderRadiusInPercent", js.undefined)
    
    inline def setMaskBorderRadiusUndefined: Self = StObject.set(x, "maskBorderRadius", js.undefined)
    
    inline def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    inline def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    inline def setMaskDuration(value: Double): Self = StObject.set(x, "maskDuration", value.asInstanceOf[js.Any])
    
    inline def setMaskDurationUndefined: Self = StObject.set(x, "maskDuration", js.undefined)
    
    inline def setMaskEnabled(value: Boolean): Self = StObject.set(x, "maskEnabled", value.asInstanceOf[js.Any])
    
    inline def setMaskEnabledUndefined: Self = StObject.set(x, "maskEnabled", js.undefined)
    
    inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    inline def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
    
    inline def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
    
    inline def setRippleLocation(value: rippleLocation): Self = StObject.set(x, "rippleLocation", value.asInstanceOf[js.Any])
    
    inline def setRippleLocationUndefined: Self = StObject.set(x, "rippleLocation", js.undefined)
    
    inline def setShadowAniEnabled(value: Boolean): Self = StObject.set(x, "shadowAniEnabled", value.asInstanceOf[js.Any])
    
    inline def setShadowAniEnabledUndefined: Self = StObject.set(x, "shadowAniEnabled", js.undefined)
  }
}
