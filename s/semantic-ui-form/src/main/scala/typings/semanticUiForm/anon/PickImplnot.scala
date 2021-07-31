package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'not'> */
trait PickImplnot extends StObject {
  
  var not: String
}
object PickImplnot {
  
  @scala.inline
  def apply(not: String): PickImplnot = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnot]
  }
  
  @scala.inline
  implicit class PickImplnotMutableBuilder[Self <: PickImplnot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNot(value: String): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
  }
}
