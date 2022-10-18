package typings.reactNativeDialog

import typings.reactNative.mod.ColorSchemeName
import typings.reactNative.mod.StyleSheet.NamedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseThemeMod {
  
  @JSImport("react-native-dialog/lib/useTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(buildStyles: StyleBuilder): UseTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buildStyles.asInstanceOf[js.Any]).asInstanceOf[UseTheme]
  
  type StyleBuilder = js.Function1[/* isDark */ Boolean, NamedStyles[Any]]
  
  trait UseTheme extends StObject {
    
    var isDark: Boolean
    
    var styles: NamedStyles[Any]
    
    var theme: ColorSchemeName
  }
  object UseTheme {
    
    inline def apply(isDark: Boolean, styles: NamedStyles[Any]): UseTheme = {
      val __obj = js.Dynamic.literal(isDark = isDark.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseTheme]
    }
    
    extension [Self <: UseTheme](x: Self) {
      
      inline def setIsDark(value: Boolean): Self = StObject.set(x, "isDark", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: NamedStyles[Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: ColorSchemeName): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeNull: Self = StObject.set(x, "theme", null)
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
