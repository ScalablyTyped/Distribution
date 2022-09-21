package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeUseDark extends StObject {
  
  var theme: Theme
  
  var useDark: js.UndefOr[Boolean] = js.undefined
}
object ThemeUseDark {
  
  inline def apply(theme: Theme): ThemeUseDark = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeUseDark]
  }
  
  extension [Self <: ThemeUseDark](x: Self) {
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUseDark(value: Boolean): Self = StObject.set(x, "useDark", value.asInstanceOf[js.Any])
    
    inline def setUseDarkUndefined: Self = StObject.set(x, "useDark", js.undefined)
  }
}
