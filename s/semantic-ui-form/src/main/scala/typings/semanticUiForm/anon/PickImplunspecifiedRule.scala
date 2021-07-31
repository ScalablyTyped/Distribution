package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, 'unspecifiedRule'> */
trait PickImplunspecifiedRule extends StObject {
  
  var unspecifiedRule: String
}
object PickImplunspecifiedRule {
  
  @scala.inline
  def apply(unspecifiedRule: String): PickImplunspecifiedRule = {
    val __obj = js.Dynamic.literal(unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplunspecifiedRule]
  }
  
  @scala.inline
  implicit class PickImplunspecifiedRuleMutableBuilder[Self <: PickImplunspecifiedRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnspecifiedRule(value: String): Self = StObject.set(x, "unspecifiedRule", value.asInstanceOf[js.Any])
  }
}
