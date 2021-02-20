package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'message'> */
@js.native
trait PickImplmessage extends StObject {
  
  var message: String = js.native
}
object PickImplmessage {
  
  @scala.inline
  def apply(message: String): PickImplmessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmessage]
  }
  
  @scala.inline
  implicit class PickImplmessageMutableBuilder[Self <: PickImplmessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
