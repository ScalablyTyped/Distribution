package typings.reactNativeElements.anon

import typings.reactNativeElements.distSearchbarSearchBarIosMod.SearchBarIosProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/searchbar/SearchBar-ios.SearchBarIosProps>> */
trait PartialThemePropsSearchBaTheme extends StObject {
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
  
  var theme: js.UndefOr[typings.reactNativeElements.distConfigThemeMod.Theme[SearchBarIosProps]] = js.undefined
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
}
object PartialThemePropsSearchBaTheme {
  
  inline def apply(): PartialThemePropsSearchBaTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThemePropsSearchBaTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialThemePropsSearchBaTheme] (val x: Self) extends AnyVal {
    
    inline def setReplaceTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1(value))
    
    inline def setReplaceThemeUndefined: Self = StObject.set(x, "replaceTheme", js.undefined)
    
    inline def setTheme(value: typings.reactNativeElements.distConfigThemeMod.Theme[SearchBarIosProps]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUpdateTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1(value))
    
    inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
  }
}
