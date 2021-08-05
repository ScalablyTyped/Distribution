package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyleString extends StObject {
  
  var fontStyle: String
}
object FontStyleString {
  
  inline def apply(fontStyle: String): FontStyleString = {
    val __obj = js.Dynamic.literal(fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyleString]
  }
  
  extension [Self <: FontStyleString](x: Self) {
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
  }
}
