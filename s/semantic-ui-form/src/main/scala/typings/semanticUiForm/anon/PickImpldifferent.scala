package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'different'> */
trait PickImpldifferent extends StObject {
  
  var different: String
}
object PickImpldifferent {
  
  @scala.inline
  def apply(different: String): PickImpldifferent = {
    val __obj = js.Dynamic.literal(different = different.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldifferent]
  }
  
  @scala.inline
  implicit class PickImpldifferentMutableBuilder[Self <: PickImpldifferent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDifferent(value: String): Self = StObject.set(x, "different", value.asInstanceOf[js.Any])
  }
}
