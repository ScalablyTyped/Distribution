package typings.reactNativeElements.anon

import typings.reactNativeElements.distSearchbarSearchBarDefaultMod.SearchBarDefaultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/searchbar/SearchBar-default.SearchBarDefaultProps>> */
trait PartialThemePropsSearchBaReplaceTheme extends StObject {
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
  
  var theme: js.UndefOr[typings.reactNativeElements.distConfigThemeMod.Theme[SearchBarDefaultProps]] = js.undefined
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
}
object PartialThemePropsSearchBaReplaceTheme {
  
  inline def apply(): PartialThemePropsSearchBaReplaceTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThemePropsSearchBaReplaceTheme]
  }
  
  extension [Self <: PartialThemePropsSearchBaReplaceTheme](x: Self) {
    
    inline def setReplaceTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1(value))
    
    inline def setReplaceThemeUndefined: Self = StObject.set(x, "replaceTheme", js.undefined)
    
    inline def setTheme(value: typings.reactNativeElements.distConfigThemeMod.Theme[SearchBarDefaultProps]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUpdateTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1(value))
    
    inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
  }
}
