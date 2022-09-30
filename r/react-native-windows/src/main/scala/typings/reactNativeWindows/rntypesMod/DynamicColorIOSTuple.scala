package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicColorIOSTuple extends StObject {
  
  var dark: ColorValue
  
  var highContrastDark: js.UndefOr[ColorValue] = js.undefined
  
  var highContrastLight: js.UndefOr[ColorValue] = js.undefined
  
  var light: ColorValue
}
object DynamicColorIOSTuple {
  
  inline def apply(dark: ColorValue, light: ColorValue): DynamicColorIOSTuple = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicColorIOSTuple]
  }
  
  extension [Self <: DynamicColorIOSTuple](x: Self) {
    
    inline def setDark(value: ColorValue): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setHighContrastDark(value: ColorValue): Self = StObject.set(x, "highContrastDark", value.asInstanceOf[js.Any])
    
    inline def setHighContrastDarkUndefined: Self = StObject.set(x, "highContrastDark", js.undefined)
    
    inline def setHighContrastLight(value: ColorValue): Self = StObject.set(x, "highContrastLight", value.asInstanceOf[js.Any])
    
    inline def setHighContrastLightUndefined: Self = StObject.set(x, "highContrastLight", js.undefined)
    
    inline def setLight(value: ColorValue): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
