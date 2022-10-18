package typings.reactNativePaper.anon

import typings.callstackReactThemeProvider.mod.DeepPartial
import typings.reactNativePaper.libTypescriptTypesMod.Mode
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.ThemeAnimation
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.ThemeColors
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.ThemeFonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> */
trait DeepPartialThemeDark extends StObject {
  
  var animation: js.UndefOr[DeepPartial[ThemeAnimation]] = js.undefined
  
  var colors: js.UndefOr[DeepPartial[ThemeColors]] = js.undefined
  
  var dark: js.UndefOr[DeepPartial[Boolean]] = js.undefined
  
  var fonts: js.UndefOr[DeepPartial[ThemeFonts]] = js.undefined
  
  var mode: js.UndefOr[DeepPartial[js.UndefOr[Mode]]] = js.undefined
  
  var roundness: js.UndefOr[DeepPartial[Double]] = js.undefined
}
object DeepPartialThemeDark {
  
  inline def apply(): DeepPartialThemeDark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialThemeDark]
  }
  
  extension [Self <: DeepPartialThemeDark](x: Self) {
    
    inline def setAnimation(value: DeepPartial[ThemeAnimation]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setColors(value: DeepPartial[ThemeColors]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setDark(value: DeepPartial[Boolean]): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setFonts(value: DeepPartial[ThemeFonts]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setMode(value: DeepPartial[js.UndefOr[Mode]]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRoundness(value: DeepPartial[Double]): Self = StObject.set(x, "roundness", value.asInstanceOf[js.Any])
    
    inline def setRoundnessUndefined: Self = StObject.set(x, "roundness", js.undefined)
  }
}
