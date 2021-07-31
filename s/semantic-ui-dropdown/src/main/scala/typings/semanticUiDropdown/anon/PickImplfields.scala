package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'fields'> */
trait PickImplfields extends StObject {
  
  var fields: FieldsSettings
}
object PickImplfields {
  
  @scala.inline
  def apply(fields: FieldsSettings): PickImplfields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfields]
  }
  
  @scala.inline
  implicit class PickImplfieldsMutableBuilder[Self <: PickImplfields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
