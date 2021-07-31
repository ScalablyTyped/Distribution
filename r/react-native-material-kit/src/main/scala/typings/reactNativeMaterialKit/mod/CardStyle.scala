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
  
  @scala.inline
  def apply(): CardStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardStyle]
  }
  
  @scala.inline
  implicit class CardStyleMutableBuilder[Self <: CardStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: Height): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    @scala.inline
    def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOpacityUndefined: Self = StObject.set(x, "shadowOpacity", js.undefined)
    
    @scala.inline
    def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRadiusUndefined: Self = StObject.set(x, "shadowRadius", js.undefined)
  }
}
