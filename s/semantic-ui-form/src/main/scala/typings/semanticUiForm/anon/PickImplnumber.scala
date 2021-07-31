package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'number'> */
trait PickImplnumber extends StObject {
  
  var number: String
}
object PickImplnumber {
  
  @scala.inline
  def apply(number: String): PickImplnumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnumber]
  }
  
  @scala.inline
  implicit class PickImplnumberMutableBuilder[Self <: PickImplnumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
