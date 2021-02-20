package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'values'> */
@js.native
trait PickImplvaluesValues extends StObject {
  
  var values: String = js.native
}
object PickImplvaluesValues {
  
  @scala.inline
  def apply(values: String): PickImplvaluesValues = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvaluesValues]
  }
  
  @scala.inline
  implicit class PickImplvaluesValuesMutableBuilder[Self <: PickImplvaluesValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
