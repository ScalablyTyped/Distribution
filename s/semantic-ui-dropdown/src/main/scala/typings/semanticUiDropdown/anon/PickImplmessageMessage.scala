package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'message'> */
@js.native
trait PickImplmessageMessage extends StObject {
  
  var message: String = js.native
}
object PickImplmessageMessage {
  
  @scala.inline
  def apply(message: String): PickImplmessageMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmessageMessage]
  }
  
  @scala.inline
  implicit class PickImplmessageMessageMutableBuilder[Self <: PickImplmessageMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
