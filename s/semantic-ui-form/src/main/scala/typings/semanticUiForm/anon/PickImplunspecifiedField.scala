package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, 'unspecifiedField'> */
trait PickImplunspecifiedField extends StObject {
  
  var unspecifiedField: String
}
object PickImplunspecifiedField {
  
  inline def apply(unspecifiedField: String): PickImplunspecifiedField = {
    val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplunspecifiedField]
  }
  
  extension [Self <: PickImplunspecifiedField](x: Self) {
    
    inline def setUnspecifiedField(value: String): Self = StObject.set(x, "unspecifiedField", value.asInstanceOf[js.Any])
  }
}
