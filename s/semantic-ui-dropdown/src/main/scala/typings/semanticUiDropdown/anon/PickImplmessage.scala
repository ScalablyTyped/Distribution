package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'message'> */
trait PickImplmessage extends StObject {
  
  var message: MessageSettings
}
object PickImplmessage {
  
  @scala.inline
  def apply(message: MessageSettings): PickImplmessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmessage]
  }
  
  @scala.inline
  implicit class PickImplmessageMutableBuilder[Self <: PickImplmessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: MessageSettings): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
