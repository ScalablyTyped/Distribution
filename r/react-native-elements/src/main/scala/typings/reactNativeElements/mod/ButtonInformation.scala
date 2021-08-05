package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonInformation extends StObject {
  
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var icon: String
  
  var title: String
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object ButtonInformation {
  
  inline def apply(icon: String, title: String): ButtonInformation = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonInformation]
  }
  
  extension [Self <: ButtonInformation](x: Self) {
    
    inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
  }
}
