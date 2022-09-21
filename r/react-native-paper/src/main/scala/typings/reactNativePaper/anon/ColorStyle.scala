package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStyle extends StObject {
  
  var color: String
  
  var style: MarginLeft
}
object ColorStyle {
  
  inline def apply(color: String, style: MarginLeft): ColorStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyle]
  }
  
  extension [Self <: ColorStyle](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: MarginLeft): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
