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
  
  inline def apply(): RadioStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioStyle]
  }
  
  extension [Self <: RadioStyle](x: Self) {
    
    inline def setBorderOffColor(value: String): Self = StObject.set(x, "borderOffColor", value.asInstanceOf[js.Any])
    
    inline def setBorderOffColorUndefined: Self = StObject.set(x, "borderOffColor", js.undefined)
    
    inline def setBorderOnColor(value: String): Self = StObject.set(x, "borderOnColor", value.asInstanceOf[js.Any])
    
    inline def setBorderOnColorUndefined: Self = StObject.set(x, "borderOnColor", js.undefined)
    
    inline def setExtraRippleRadius(value: Double): Self = StObject.set(x, "extraRippleRadius", value.asInstanceOf[js.Any])
    
    inline def setExtraRippleRadiusUndefined: Self = StObject.set(x, "extraRippleRadius", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
  }
}
