package typings.reactNativeElements.anon

import typings.reactNativeElements.distConfigThemeMod.FullTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeFullTheme extends StObject {
  
  var theme: FullTheme
  
  var useDark: Boolean
}
object ThemeFullTheme {
  
  inline def apply(theme: FullTheme, useDark: Boolean): ThemeFullTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], useDark = useDark.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeFullTheme]
  }
  
  extension [Self <: ThemeFullTheme](x: Self) {
    
    inline def setTheme(value: FullTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUseDark(value: Boolean): Self = StObject.set(x, "useDark", value.asInstanceOf[js.Any])
  }
}
