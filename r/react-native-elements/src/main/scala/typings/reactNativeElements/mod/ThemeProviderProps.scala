package typings.reactNativeElements.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeProviderProps[T] extends StObject {
  
  var children: ReactNode
  
  var theme: js.UndefOr[Theme[T]] = js.undefined
  
  var useDark: js.UndefOr[Boolean] = js.undefined
}
object ThemeProviderProps {
  
  inline def apply[T](): ThemeProviderProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProviderProps[T]]
  }
  
  extension [Self <: ThemeProviderProps[?], T](x: Self & ThemeProviderProps[T]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTheme(value: Theme[T]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUseDark(value: Boolean): Self = StObject.set(x, "useDark", value.asInstanceOf[js.Any])
    
    inline def setUseDarkUndefined: Self = StObject.set(x, "useDark", js.undefined)
  }
}
