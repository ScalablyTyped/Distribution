package typings.reactNativeCalendars.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkedDateCustomStyles extends StObject {
  
  var container: StyleProp[ViewStyle]
  
  var text: StyleProp[TextStyle]
}
object MarkedDateCustomStyles {
  
  inline def apply(): MarkedDateCustomStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkedDateCustomStyles]
  }
  
  extension [Self <: MarkedDateCustomStyles](x: Self) {
    
    inline def setContainer(value: StyleProp[ViewStyle]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setText(value: StyleProp[TextStyle]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
