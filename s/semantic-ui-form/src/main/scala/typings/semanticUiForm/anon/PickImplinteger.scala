package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'integer'> */
trait PickImplinteger extends StObject {
  
  var integer: String
}
object PickImplinteger {
  
  @scala.inline
  def apply(integer: String): PickImplinteger = {
    val __obj = js.Dynamic.literal(integer = integer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinteger]
  }
  
  @scala.inline
  implicit class PickImplintegerMutableBuilder[Self <: PickImplinteger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteger(value: String): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
  }
}
