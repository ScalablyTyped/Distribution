package typings.semanticUiForm.anon

import typings.semanticUiForm.SemanticUI.Form.TextSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, 'unspecifiedRule'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TextSettings._Impl>> */
trait PickImplunspecifiedRulePa
  extends StObject
     with Param {
  
  var unspecifiedField: js.UndefOr[String] = js.undefined
  
  var unspecifiedRule: String
}
object PickImplunspecifiedRulePa {
  
  inline def apply(unspecifiedRule: String): PickImplunspecifiedRulePa = {
    val __obj = js.Dynamic.literal(unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplunspecifiedRulePa]
  }
  
  extension [Self <: PickImplunspecifiedRulePa](x: Self) {
    
    inline def setUnspecifiedField(value: String): Self = StObject.set(x, "unspecifiedField", value.asInstanceOf[js.Any])
    
    inline def setUnspecifiedFieldUndefined: Self = StObject.set(x, "unspecifiedField", js.undefined)
    
    inline def setUnspecifiedRule(value: String): Self = StObject.set(x, "unspecifiedRule", value.asInstanceOf[js.Any])
  }
}
