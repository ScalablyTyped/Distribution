package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-paper.react-native-paper/lib/typescript/components/Icon.IconProps & {  color :string} */
trait IconPropscolorstring extends StObject {
  
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  var color: String
  
  var size: Double
}
object IconPropscolorstring {
  
  inline def apply(color: String, size: Double): IconPropscolorstring = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconPropscolorstring]
  }
  
  extension [Self <: IconPropscolorstring](x: Self) {
    
    inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
