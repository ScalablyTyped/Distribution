package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-paper.react-native-paper/lib/typescript/components/Icon.IconProps & {  color :string | undefined,   source :any,   theme :react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme} */
trait IconPropscolorstringundef extends StObject {
  
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var size: Double
  
  var source: Any
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
}
object IconPropscolorstringundef {
  
  inline def apply(
    size: Double,
    source: Any,
    theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
  ): IconPropscolorstringundef = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconPropscolorstringundef]
  }
  
  extension [Self <: IconPropscolorstringundef](x: Self) {
    
    inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
