package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.semanticUiForm.SemanticUI.Form.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'fields'> */
trait PickImplfields extends StObject {
  
  var fields: StringDictionary[String | js.Array[String] | Field]
}
object PickImplfields {
  
  inline def apply(fields: StringDictionary[String | js.Array[String] | Field]): PickImplfields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfields]
  }
  
  extension [Self <: PickImplfields](x: Self) {
    
    inline def setFields(value: StringDictionary[String | js.Array[String] | Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
