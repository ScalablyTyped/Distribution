package typings.reactNativePaper.anon

import typings.callstackReactThemeProvider.mod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.ThemeAnimation> */
trait DeepPartialThemeAnimation extends StObject {
  
  var scale: js.UndefOr[DeepPartial[Double]] = js.undefined
}
object DeepPartialThemeAnimation {
  
  inline def apply(): DeepPartialThemeAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialThemeAnimation]
  }
  
  extension [Self <: DeepPartialThemeAnimation](x: Self) {
    
    inline def setScale(value: DeepPartial[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
