package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'regExp'> */
trait PickImplregExp extends StObject {
  
  var regExp: String
}
object PickImplregExp {
  
  @scala.inline
  def apply(regExp: String): PickImplregExp = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplregExp]
  }
  
  @scala.inline
  implicit class PickImplregExpMutableBuilder[Self <: PickImplregExp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegExp(value: String): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
  }
}
