package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation
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
  implicit class MKRipplePropertiesOps[Self <: MKRippleProperties] (val x: Self) extends AnyVal {
    
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
    def setMaskBorderRadius(value: Double): Self = this.set("maskBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBorderRadius: Self = this.set("maskBorderRadius", js.undefined)
    
    @scala.inline
    def setMaskBorderRadiusInPercent(value: Double): Self = this.set("maskBorderRadiusInPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBorderRadiusInPercent: Self = this.set("maskBorderRadiusInPercent", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = this.set("maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskColor: Self = this.set("maskColor", js.undefined)
    
    @scala.inline
    def setMaskDuration(value: Double): Self = this.set("maskDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskDuration: Self = this.set("maskDuration", js.undefined)
    
    @scala.inline
    def setMaskEnabled(value: Boolean): Self = this.set("maskEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskEnabled: Self = this.set("maskEnabled", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    
    @scala.inline
    def setRippleDuration(value: Double): Self = this.set("rippleDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleDuration: Self = this.set("rippleDuration", js.undefined)
    
    @scala.inline
    def setRippleLocation(value: rippleLocation): Self = this.set("rippleLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleLocation: Self = this.set("rippleLocation", js.undefined)
    
    @scala.inline
    def setShadowAniEnabled(value: Boolean): Self = this.set("shadowAniEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowAniEnabled: Self = this.set("shadowAniEnabled", js.undefined)
  }
}
