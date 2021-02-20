package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFieldStyle extends StObject {
  
  var highlightColor: js.UndefOr[String] = js.native
  
  var textInputStyle: js.UndefOr[Color] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
}
object TextFieldStyle {
  
  @scala.inline
  def apply(): TextFieldStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldStyle]
  }
  
  @scala.inline
  implicit class TextFieldStyleMutableBuilder[Self <: TextFieldStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    @scala.inline
    def setTextInputStyle(value: Color): Self = StObject.set(x, "textInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputStyleUndefined: Self = StObject.set(x, "textInputStyle", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
