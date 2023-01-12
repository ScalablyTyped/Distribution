package typings.semanticUiForm.anon

import typings.semanticUiForm.SemanticUI.Form.TextSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, 'unspecifiedField'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TextSettings._Impl>> */
trait PickImplunspecifiedFieldP
  extends StObject
     with Param {
  
  var unspecifiedField: String
  
  var unspecifiedRule: js.UndefOr[String] = js.undefined
}
object PickImplunspecifiedFieldP {
  
  inline def apply(unspecifiedField: String): PickImplunspecifiedFieldP = {
    val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplunspecifiedFieldP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplunspecifiedFieldP] (val x: Self) extends AnyVal {
    
    inline def setUnspecifiedField(value: String): Self = StObject.set(x, "unspecifiedField", value.asInstanceOf[js.Any])
    
    inline def setUnspecifiedRule(value: String): Self = StObject.set(x, "unspecifiedRule", value.asInstanceOf[js.Any])
    
    inline def setUnspecifiedRuleUndefined: Self = StObject.set(x, "unspecifiedRule", js.undefined)
  }
}
