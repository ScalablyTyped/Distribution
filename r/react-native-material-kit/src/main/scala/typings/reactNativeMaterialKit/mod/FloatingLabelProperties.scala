package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.mod.MKPropTypes.font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloatingLabelProperties extends StObject {
  
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  
  var floatingLabelAniDuration: js.UndefOr[Double] = js.native
  
  var floatingLabelBottomMargin: js.UndefOr[Double] = js.native
  
  var floatingLabelEnabled: js.UndefOr[Boolean] = js.native
  
  var floatingLabelFont: js.UndefOr[font] = js.native
}
object FloatingLabelProperties {
  
  @scala.inline
  def apply(): FloatingLabelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingLabelProperties]
  }
  
  @scala.inline
  implicit class FloatingLabelPropertiesMutableBuilder[Self <: FloatingLabelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setFloatingLabelAniDuration(value: Double): Self = StObject.set(x, "floatingLabelAniDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelAniDurationUndefined: Self = StObject.set(x, "floatingLabelAniDuration", js.undefined)
    
    @scala.inline
    def setFloatingLabelBottomMargin(value: Double): Self = StObject.set(x, "floatingLabelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelBottomMarginUndefined: Self = StObject.set(x, "floatingLabelBottomMargin", js.undefined)
    
    @scala.inline
    def setFloatingLabelEnabled(value: Boolean): Self = StObject.set(x, "floatingLabelEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelEnabledUndefined: Self = StObject.set(x, "floatingLabelEnabled", js.undefined)
    
    @scala.inline
    def setFloatingLabelFont(value: font): Self = StObject.set(x, "floatingLabelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelFontUndefined: Self = StObject.set(x, "floatingLabelFont", js.undefined)
  }
}
