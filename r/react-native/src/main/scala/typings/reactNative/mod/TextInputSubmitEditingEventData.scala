package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputSubmitEditingEventData extends StObject {
  
  var text: String
}
object TextInputSubmitEditingEventData {
  
  @scala.inline
  def apply(text: String): TextInputSubmitEditingEventData = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputSubmitEditingEventData]
  }
  
  @scala.inline
  implicit class TextInputSubmitEditingEventDataMutableBuilder[Self <: TextInputSubmitEditingEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
