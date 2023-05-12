package typings.storybookTheming.distCreateC2b2ce6dMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorybookTheme
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var animation: Animation
  
  var appBorderColor: String
  
  var appBorderRadius: Double
  
  var background: Background
  
  var barBg: String
  
  var barSelectedColor: String
  
  var barTextColor: String
  
  var brand: Brand
  
  var code: StringDictionary[String | js.Object]
  
  var color: Color
  
  var easing: Easing
  
  var input: typings.storybookTheming.anon.Background
  
  var layoutMargin: Double
  
  var typography: Typography
}
object StorybookTheme {
  
  inline def apply(
    animation: Animation,
    appBorderColor: String,
    appBorderRadius: Double,
    background: Background,
    barBg: String,
    barSelectedColor: String,
    barTextColor: String,
    brand: Brand,
    code: StringDictionary[String | js.Object],
    color: Color,
    easing: Easing,
    input: typings.storybookTheming.anon.Background,
    layoutMargin: Double,
    typography: Typography
  ): StorybookTheme = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], appBorderColor = appBorderColor.asInstanceOf[js.Any], appBorderRadius = appBorderRadius.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], barBg = barBg.asInstanceOf[js.Any], barSelectedColor = barSelectedColor.asInstanceOf[js.Any], barTextColor = barTextColor.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layoutMargin = layoutMargin.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorybookTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorybookTheme] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAppBorderColor(value: String): Self = StObject.set(x, "appBorderColor", value.asInstanceOf[js.Any])
    
    inline def setAppBorderRadius(value: Double): Self = StObject.set(x, "appBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBarBg(value: String): Self = StObject.set(x, "barBg", value.asInstanceOf[js.Any])
    
    inline def setBarSelectedColor(value: String): Self = StObject.set(x, "barSelectedColor", value.asInstanceOf[js.Any])
    
    inline def setBarTextColor(value: String): Self = StObject.set(x, "barTextColor", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: Brand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCode(value: StringDictionary[String | js.Object]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setInput(value: typings.storybookTheming.anon.Background): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLayoutMargin(value: Double): Self = StObject.set(x, "layoutMargin", value.asInstanceOf[js.Any])
    
    inline def setTypography(value: Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
