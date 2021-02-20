package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MKRippleProperties extends ViewProps {
  
  var maskBorderRadius: js.UndefOr[Double] = js.native
  
  var maskBorderRadiusInPercent: js.UndefOr[Double] = js.native
  
  var maskColor: js.UndefOr[String] = js.native
  
  var maskDuration: js.UndefOr[Double] = js.native
  
  var maskEnabled: js.UndefOr[Boolean] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
  
  var rippleDuration: js.UndefOr[Double] = js.native
  
  var rippleLocation: js.UndefOr[typings.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation] = js.native
  
  var shadowAniEnabled: js.UndefOr[Boolean] = js.native
}
object MKRippleProperties {
  
  @scala.inline
  def apply(): MKRippleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKRippleProperties]
  }
  
  @scala.inline
  implicit class MKRipplePropertiesMutableBuilder[Self <: MKRippleProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaskBorderRadius(value: Double): Self = StObject.set(x, "maskBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderRadiusInPercent(value: Double): Self = StObject.set(x, "maskBorderRadiusInPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderRadiusInPercentUndefined: Self = StObject.set(x, "maskBorderRadiusInPercent", js.undefined)
    
    @scala.inline
    def setMaskBorderRadiusUndefined: Self = StObject.set(x, "maskBorderRadius", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    @scala.inline
    def setMaskDuration(value: Double): Self = StObject.set(x, "maskDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskDurationUndefined: Self = StObject.set(x, "maskDuration", js.undefined)
    
    @scala.inline
    def setMaskEnabled(value: Boolean): Self = StObject.set(x, "maskEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskEnabledUndefined: Self = StObject.set(x, "maskEnabled", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
    
    @scala.inline
    def setRippleLocation(value: rippleLocation): Self = StObject.set(x, "rippleLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleLocationUndefined: Self = StObject.set(x, "rippleLocation", js.undefined)
    
    @scala.inline
    def setShadowAniEnabled(value: Boolean): Self = StObject.set(x, "shadowAniEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowAniEnabledUndefined: Self = StObject.set(x, "shadowAniEnabled", js.undefined)
  }
}
