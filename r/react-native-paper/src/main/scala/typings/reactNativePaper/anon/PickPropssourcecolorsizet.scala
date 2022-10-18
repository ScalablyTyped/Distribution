package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageURISource
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-paper.react-native-paper/lib/typescript/components/CrossFadeIcon.Props, 'source' | 'color' | 'size'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickPropssourcecolorsizet extends StObject {
  
  var color: String
  
  var size: Double
  
  var source: IconSource
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
}
object PickPropssourcecolorsizet {
  
  inline def apply(color: String, size: Double, source: IconSource): PickPropssourcecolorsizet = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropssourcecolorsizet]
  }
  
  extension [Self <: PickPropssourcecolorsizet](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSource(value: IconSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    
    inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
