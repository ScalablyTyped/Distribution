package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.mod.MKPropTypes.font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatingLabelProperties extends StObject {
  
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  var floatingLabelAniDuration: js.UndefOr[Double] = js.undefined
  
  var floatingLabelBottomMargin: js.UndefOr[Double] = js.undefined
  
  var floatingLabelEnabled: js.UndefOr[Boolean] = js.undefined
  
  var floatingLabelFont: js.UndefOr[font] = js.undefined
}
object FloatingLabelProperties {
  
  inline def apply(): FloatingLabelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingLabelProperties]
  }
  
  extension [Self <: FloatingLabelProperties](x: Self) {
    
    inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setFloatingLabelAniDuration(value: Double): Self = StObject.set(x, "floatingLabelAniDuration", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelAniDurationUndefined: Self = StObject.set(x, "floatingLabelAniDuration", js.undefined)
    
    inline def setFloatingLabelBottomMargin(value: Double): Self = StObject.set(x, "floatingLabelBottomMargin", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelBottomMarginUndefined: Self = StObject.set(x, "floatingLabelBottomMargin", js.undefined)
    
    inline def setFloatingLabelEnabled(value: Boolean): Self = StObject.set(x, "floatingLabelEnabled", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelEnabledUndefined: Self = StObject.set(x, "floatingLabelEnabled", js.undefined)
    
    inline def setFloatingLabelFont(value: font): Self = StObject.set(x, "floatingLabelFont", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelFontUndefined: Self = StObject.set(x, "floatingLabelFont", js.undefined)
  }
}
