package typings.storybookTheming.mod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookTheming.anon.Border
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var animation: Animation
  
  var appBorderColor: String
  
  var appBorderRadius: Double
  
  var background: Background_
  
  var barBg: String
  
  var barSelectedColor: String
  
  var barTextColor: String
  
  var brand: Brand
  
  var code: StringDictionary[String | js.Object]
  
  var color: Color_
  
  var easing: Easing
  
  var input: Border
  
  var layoutMargin: Double
  
  var typography: Typography_
}
object Theme {
  
  inline def apply(
    animation: Animation,
    appBorderColor: String,
    appBorderRadius: Double,
    background: Background_,
    barBg: String,
    barSelectedColor: String,
    barTextColor: String,
    brand: Brand,
    code: StringDictionary[String | js.Object],
    color: Color_,
    easing: Easing,
    input: Border,
    layoutMargin: Double,
    typography: Typography_
  ): Theme = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], appBorderColor = appBorderColor.asInstanceOf[js.Any], appBorderRadius = appBorderRadius.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], barBg = barBg.asInstanceOf[js.Any], barSelectedColor = barSelectedColor.asInstanceOf[js.Any], barTextColor = barTextColor.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layoutMargin = layoutMargin.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAppBorderColor(value: String): Self = StObject.set(x, "appBorderColor", value.asInstanceOf[js.Any])
    
    inline def setAppBorderRadius(value: Double): Self = StObject.set(x, "appBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: Background_): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBarBg(value: String): Self = StObject.set(x, "barBg", value.asInstanceOf[js.Any])
    
    inline def setBarSelectedColor(value: String): Self = StObject.set(x, "barSelectedColor", value.asInstanceOf[js.Any])
    
    inline def setBarTextColor(value: String): Self = StObject.set(x, "barTextColor", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: Brand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCode(value: StringDictionary[String | js.Object]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Border): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLayoutMargin(value: Double): Self = StObject.set(x, "layoutMargin", value.asInstanceOf[js.Any])
    
    inline def setTypography(value: Typography_): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
