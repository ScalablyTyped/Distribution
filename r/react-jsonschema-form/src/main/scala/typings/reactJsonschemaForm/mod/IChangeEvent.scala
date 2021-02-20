package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChangeEvent[T] extends StObject {
  
  var edit: Boolean = js.native
  
  var errorSchema: FormValidation = js.native
  
  var errors: js.Array[AjvError] = js.native
  
  var formData: T = js.native
  
  var idSchema: IdSchema[_] = js.native
  
  var schema: JSONSchema6 = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var uiSchema: UiSchema = js.native
}
object IChangeEvent {
  
  @scala.inline
  def apply[T](
    edit: Boolean,
    errorSchema: FormValidation,
    errors: js.Array[AjvError],
    formData: T,
    idSchema: IdSchema[_],
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): IChangeEvent[T] = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeEvent[T]]
  }
  
  @scala.inline
  implicit class IChangeEventMutableBuilder[Self <: IChangeEvent[_], T] (val x: Self with IChangeEvent[T]) extends AnyVal {
    
    @scala.inline
    def setEdit(value: Boolean): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorSchema(value: FormValidation): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[AjvError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: AjvError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdSchema(value: IdSchema[_]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
  }
}
