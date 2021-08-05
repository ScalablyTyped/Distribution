package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardStyle extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var shadowColor: js.UndefOr[String] = js.undefined
  
  var shadowOffset: js.UndefOr[Height] = js.undefined
  
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  
  var shadowRadius: js.UndefOr[Double] = js.undefined
}
object CardStyle {
  
  inline def apply(): CardStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardStyle]
  }
  
  extension [Self <: CardStyle](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffset(value: Height): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    inline def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacityUndefined: Self = StObject.set(x, "shadowOpacity", js.undefined)
    
    inline def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    inline def setShadowRadiusUndefined: Self = StObject.set(x, "shadowRadius", js.undefined)
  }
}
