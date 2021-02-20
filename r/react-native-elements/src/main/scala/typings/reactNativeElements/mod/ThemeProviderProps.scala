package typings.reactNativeElements.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeProviderProps[T] extends StObject {
  
  var children: ReactNode = js.native
  
  var theme: js.UndefOr[Theme[T]] = js.native
  
  var useDark: js.UndefOr[Boolean] = js.native
}
object ThemeProviderProps {
  
  @scala.inline
  def apply[T](): ThemeProviderProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProviderProps[T]]
  }
  
  @scala.inline
  implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps[_], T] (val x: Self with ThemeProviderProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme[T]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setUseDark(value: Boolean): Self = StObject.set(x, "useDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDarkUndefined: Self = StObject.set(x, "useDark", js.undefined)
  }
}
