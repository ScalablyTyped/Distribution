package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputSubmitEditingEventData extends StObject {
  
  var text: String
}
object TextInputSubmitEditingEventData {
  
  inline def apply(text: String): TextInputSubmitEditingEventData = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputSubmitEditingEventData]
  }
  
  extension [Self <: TextInputSubmitEditingEventData](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
