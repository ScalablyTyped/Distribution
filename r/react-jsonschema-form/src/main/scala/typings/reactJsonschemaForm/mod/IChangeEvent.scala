package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChangeEvent[T] extends js.Object {
  
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
  implicit class IChangeEventOps[Self <: IChangeEvent[_], T] (val x: Self with IChangeEvent[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdit(value: Boolean): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorSchema(value: FormValidation): Self = this.set("errorSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: AjvError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[AjvError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: T): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdSchema(value: IdSchema[_]): Self = this.set("idSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = this.set("uiSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
