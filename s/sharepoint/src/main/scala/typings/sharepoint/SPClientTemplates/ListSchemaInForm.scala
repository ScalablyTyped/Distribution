package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemaInForm extends ListSchema {
  
  @JSName("Field")
  var Field_ListSchemaInForm: js.Array[FieldSchemaInForm] = js.native
}
object ListSchemaInForm {
  
  @scala.inline
  def apply(Field: js.Array[FieldSchemaInForm]): ListSchemaInForm = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaInForm]
  }
  
  @scala.inline
  implicit class ListSchemaInFormMutableBuilder[Self <: ListSchemaInForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: js.Array[FieldSchemaInForm]): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldVarargs(value: FieldSchemaInForm*): Self = StObject.set(x, "Field", js.Array(value :_*))
  }
}
