package typings.reactNativeElements.anon

import typings.reactNativeElements.distSearchbarSearchBarAndroidMod.SearchBarAndroidProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/searchbar/SearchBar-android.SearchBarAndroidProps>> */
trait PartialThemePropsSearchBa extends StObject {
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
  
  var theme: js.UndefOr[typings.reactNativeElements.distConfigThemeMod.Theme[SearchBarAndroidProps]] = js.undefined
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
}
object PartialThemePropsSearchBa {
  
  inline def apply(): PartialThemePropsSearchBa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThemePropsSearchBa]
  }
  
  extension [Self <: PartialThemePropsSearchBa](x: Self) {
    
    inline def setReplaceTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1(value))
    
    inline def setReplaceThemeUndefined: Self = StObject.set(x, "replaceTheme", js.undefined)
    
    inline def setTheme(value: typings.reactNativeElements.distConfigThemeMod.Theme[SearchBarAndroidProps]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUpdateTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1(value))
    
    inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
  }
}
