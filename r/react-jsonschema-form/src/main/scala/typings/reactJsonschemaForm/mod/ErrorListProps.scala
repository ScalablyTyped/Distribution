package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorListProps extends StObject {
  
  var errorSchema: FormValidation
  
  var errors: js.Array[AjvError]
  
  var formContext: js.Any
  
  var schema: JSONSchema6
  
  var uiSchema: UiSchema
}
object ErrorListProps {
  
  inline def apply(
    errorSchema: FormValidation,
    errors: js.Array[AjvError],
    formContext: js.Any,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): ErrorListProps = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorListProps]
  }
  
  extension [Self <: ErrorListProps](x: Self) {
    
    inline def setErrorSchema(value: FormValidation): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[AjvError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: AjvError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setFormContext(value: js.Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
  }
}
