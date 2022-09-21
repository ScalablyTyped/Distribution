package typings.reactNativePaper.anon

import typings.callstackReactThemeProvider.mod.DeepPartial
import typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.ThemeFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.ThemeFonts> */
trait DeepPartialThemeFonts extends StObject {
  
  var light: js.UndefOr[DeepPartial[ThemeFont]] = js.undefined
  
  var medium: js.UndefOr[DeepPartial[ThemeFont]] = js.undefined
  
  var regular: js.UndefOr[DeepPartial[ThemeFont]] = js.undefined
  
  var thin: js.UndefOr[DeepPartial[ThemeFont]] = js.undefined
}
object DeepPartialThemeFonts {
  
  inline def apply(): DeepPartialThemeFonts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialThemeFonts]
  }
  
  extension [Self <: DeepPartialThemeFonts](x: Self) {
    
    inline def setLight(value: DeepPartial[ThemeFont]): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setMedium(value: DeepPartial[ThemeFont]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setRegular(value: DeepPartial[ThemeFont]): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    
    inline def setThin(value: DeepPartial[ThemeFont]): Self = StObject.set(x, "thin", value.asInstanceOf[js.Any])
    
    inline def setThinUndefined: Self = StObject.set(x, "thin", js.undefined)
  }
}
