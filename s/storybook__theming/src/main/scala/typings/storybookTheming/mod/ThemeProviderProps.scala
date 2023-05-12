package typings.storybookTheming.mod

import typings.react.mod.ReactNode
import typings.storybookTheming.anon.PartialTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Definitions by: Junyoung Clare Jang <https://github.com/Ailrun>
trait ThemeProviderProps extends StObject {
  
  var children: ReactNode
  
  var theme: PartialTheme | (js.Function1[/* outerTheme */ Theme, Theme])
}
object ThemeProviderProps {
  
  inline def apply(theme: PartialTheme | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTheme(value: PartialTheme | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
  }
}
