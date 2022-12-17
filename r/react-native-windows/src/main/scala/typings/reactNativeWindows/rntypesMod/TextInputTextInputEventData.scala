package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputTextInputEventData extends StObject {
  
  var previousText: String
  
  var range: End
  
  var text: String
}
object TextInputTextInputEventData {
  
  inline def apply(previousText: String, range: End, text: String): TextInputTextInputEventData = {
    val __obj = js.Dynamic.literal(previousText = previousText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputTextInputEventData]
  }
  
  extension [Self <: TextInputTextInputEventData](x: Self) {
    
    inline def setPreviousText(value: String): Self = StObject.set(x, "previousText", value.asInstanceOf[js.Any])
    
    inline def setRange(value: End): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
