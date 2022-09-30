package typings.reactToolbox

import typings.reactCssThemr.mod.TReactCSSThemrTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-css-themr.react-css-themr.ThemeProviderProps> */
  trait ReadonlyThemeProviderProp extends StObject {
    
    val innerRef: js.UndefOr[js.Function] = js.undefined
    
    val theme: TReactCSSThemrTheme
  }
  object ReadonlyThemeProviderProp {
    
    inline def apply(theme: TReactCSSThemrTheme): ReadonlyThemeProviderProp = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyThemeProviderProp]
    }
    
    extension [Self <: ReadonlyThemeProviderProp](x: Self) {
      
      inline def setInnerRef(value: js.Function): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTheme(value: TReactCSSThemrTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
