package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'values'> */
trait PickImplvaluesValues extends StObject {
  
  var values: String
}
object PickImplvaluesValues {
  
  inline def apply(values: String): PickImplvaluesValues = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvaluesValues]
  }
  
  extension [Self <: PickImplvaluesValues](x: Self) {
    
    inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
