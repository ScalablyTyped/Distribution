package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'contain'> */
trait PickImplcontain extends StObject {
  
  var contain: String
}
object PickImplcontain {
  
  @scala.inline
  def apply(contain: String): PickImplcontain = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontain]
  }
  
  @scala.inline
  implicit class PickImplcontainMutableBuilder[Self <: PickImplcontain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContain(value: String): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
  }
}
