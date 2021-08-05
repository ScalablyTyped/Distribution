package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyle extends StObject {
  
  var color: String
  
  var fontStyle: String
}
object FontStyle {
  
  inline def apply(color: String, fontStyle: String): FontStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  
  extension [Self <: FontStyle](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
  }
}
