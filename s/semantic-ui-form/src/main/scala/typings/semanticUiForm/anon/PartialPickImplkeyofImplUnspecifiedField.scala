package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TextSettings._Impl>> */
trait PartialPickImplkeyofImplUnspecifiedField extends StObject {
  
  var unspecifiedField: js.UndefOr[String] = js.undefined
  
  var unspecifiedRule: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplUnspecifiedField {
  
  inline def apply(): PartialPickImplkeyofImplUnspecifiedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplUnspecifiedField]
  }
  
  extension [Self <: PartialPickImplkeyofImplUnspecifiedField](x: Self) {
    
    inline def setUnspecifiedField(value: String): Self = StObject.set(x, "unspecifiedField", value.asInstanceOf[js.Any])
    
    inline def setUnspecifiedFieldUndefined: Self = StObject.set(x, "unspecifiedField", js.undefined)
    
    inline def setUnspecifiedRule(value: String): Self = StObject.set(x, "unspecifiedRule", value.asInstanceOf[js.Any])
    
    inline def setUnspecifiedRuleUndefined: Self = StObject.set(x, "unspecifiedRule", js.undefined)
  }
}
