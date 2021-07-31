package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'empty'> */
trait PickImplempty extends StObject {
  
  var empty: String
}
object PickImplempty {
  
  @scala.inline
  def apply(empty: String): PickImplempty = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplempty]
  }
  
  @scala.inline
  implicit class PickImplemptyMutableBuilder[Self <: PickImplempty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
  }
}
