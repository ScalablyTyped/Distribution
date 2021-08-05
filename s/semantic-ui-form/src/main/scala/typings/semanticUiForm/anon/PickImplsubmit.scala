package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'submit'> */
trait PickImplsubmit extends StObject {
  
  var submit: String
}
object PickImplsubmit {
  
  inline def apply(submit: String): PickImplsubmit = {
    val __obj = js.Dynamic.literal(submit = submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsubmit]
  }
  
  extension [Self <: PickImplsubmit](x: Self) {
    
    inline def setSubmit(value: String): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
  }
}
