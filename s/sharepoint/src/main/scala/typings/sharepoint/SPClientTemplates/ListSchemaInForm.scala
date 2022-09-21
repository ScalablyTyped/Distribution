package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemaInForm
  extends StObject
     with ListSchema {
  
  @JSName("Field")
  var Field_ListSchemaInForm: js.Array[FieldSchemaInForm]
}
object ListSchemaInForm {
  
  inline def apply(Field: js.Array[FieldSchemaInForm]): ListSchemaInForm = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaInForm]
  }
  
  extension [Self <: ListSchemaInForm](x: Self) {
    
    inline def setField(value: js.Array[FieldSchemaInForm]): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setFieldVarargs(value: FieldSchemaInForm*): Self = StObject.set(x, "Field", js.Array(value*))
  }
}
