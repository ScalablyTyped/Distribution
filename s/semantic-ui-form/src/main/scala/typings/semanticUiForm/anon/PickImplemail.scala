package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'email'> */
@js.native
trait PickImplemail extends StObject {
  
  var email: String = js.native
}
object PickImplemail {
  
  @scala.inline
  def apply(email: String): PickImplemail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplemail]
  }
  
  @scala.inline
  implicit class PickImplemailMutableBuilder[Self <: PickImplemail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
