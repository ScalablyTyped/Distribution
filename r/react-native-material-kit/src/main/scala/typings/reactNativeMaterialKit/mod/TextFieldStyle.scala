package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFieldStyle extends StObject {
  
  var highlightColor: js.UndefOr[String] = js.undefined
  
  var textInputStyle: js.UndefOr[Color] = js.undefined
  
  var tintColor: js.UndefOr[String] = js.undefined
}
object TextFieldStyle {
  
  inline def apply(): TextFieldStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldStyle]
  }
  
  extension [Self <: TextFieldStyle](x: Self) {
    
    inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    inline def setTextInputStyle(value: Color): Self = StObject.set(x, "textInputStyle", value.asInstanceOf[js.Any])
    
    inline def setTextInputStyleUndefined: Self = StObject.set(x, "textInputStyle", js.undefined)
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
