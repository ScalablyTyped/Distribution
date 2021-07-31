package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioStyle extends StObject {
  
  var borderOffColor: js.UndefOr[String] = js.undefined
  
  var borderOnColor: js.UndefOr[String] = js.undefined
  
  var extraRippleRadius: js.UndefOr[Double] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var rippleColor: js.UndefOr[String] = js.undefined
}
object RadioStyle {
  
  @scala.inline
  def apply(): RadioStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioStyle]
  }
  
  @scala.inline
  implicit class RadioStyleMutableBuilder[Self <: RadioStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderOffColor(value: String): Self = StObject.set(x, "borderOffColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderOffColorUndefined: Self = StObject.set(x, "borderOffColor", js.undefined)
    
    @scala.inline
    def setBorderOnColor(value: String): Self = StObject.set(x, "borderOnColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderOnColorUndefined: Self = StObject.set(x, "borderOnColor", js.undefined)
    
    @scala.inline
    def setExtraRippleRadius(value: Double): Self = StObject.set(x, "extraRippleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraRippleRadiusUndefined: Self = StObject.set(x, "extraRippleRadius", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
  }
}
