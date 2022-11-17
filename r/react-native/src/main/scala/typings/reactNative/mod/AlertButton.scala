package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertButton extends StObject {
  
  var onPress: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
  
  var style: js.UndefOr["default" | "cancel" | "destructive"] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object AlertButton {
  
  inline def apply(): AlertButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertButton]
  }
  
  extension [Self <: AlertButton](x: Self) {
    
    inline def setOnPress(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStyle(value: "default" | "cancel" | "destructive"): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
