package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputEndEditingEventData extends StObject {
  
  var text: String = js.native
}
object TextInputEndEditingEventData {
  
  @scala.inline
  def apply(text: String): TextInputEndEditingEventData = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputEndEditingEventData]
  }
  
  @scala.inline
  implicit class TextInputEndEditingEventDataMutableBuilder[Self <: TextInputEndEditingEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
