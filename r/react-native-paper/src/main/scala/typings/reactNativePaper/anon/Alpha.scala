package typings.reactNativePaper.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativePaper.reactNativePaperStrings.light
import typings.reactNativePaper.reactNativePaperStrings.medium
import typings.reactNativePaper.reactNativePaperStrings.regular
import typings.reactNativePaper.reactNativePaperStrings.thin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alpha extends StObject {
  
  var alpha: Double
  
  var family: regular | medium | light | thin
  
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
}
object Alpha {
  
  inline def apply(
    alpha: Double,
    family: regular | medium | light | thin,
    theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
  ): Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
  
  extension [Self <: Alpha](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setFamily(value: regular | medium | light | thin): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
