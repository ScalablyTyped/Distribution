package typings.reactJsonschemaForm.schemaFieldMod

import typings.jsonSchema.mod.JSONSchema6
import typings.reactJsonschemaForm.anon.Definitions
import typings.reactJsonschemaForm.mod.ErrorSchema
import typings.reactJsonschemaForm.mod.IdSchema
import typings.reactJsonschemaForm.mod.UiSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-jsonschema-form.react-jsonschema-form.FieldProps<T>, 'schema' | 'uiSchema' | 'idSchema' | 'formData' | 'errorSchema' | 'registry' | 'formContext'> */
@js.native
trait SchemaFieldProps[T] extends js.Object {
  
  var errorSchema: ErrorSchema = js.native
  
  var formContext: js.Any = js.native
  
  var formData: T = js.native
  
  var idSchema: IdSchema[_] = js.native
  
  var registry: Definitions = js.native
  
  var schema: JSONSchema6 = js.native
  
  var uiSchema: UiSchema = js.native
}
object SchemaFieldProps {
  
  @scala.inline
  def apply[T](
    errorSchema: ErrorSchema,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    registry: Definitions,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): SchemaFieldProps[T] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldProps[T]]
  }
  
  @scala.inline
  implicit class SchemaFieldPropsOps[Self <: SchemaFieldProps[_], T] (val x: Self with SchemaFieldProps[T]) extends AnyVal {
    
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
    def setErrorSchema(value: ErrorSchema): Self = this.set("errorSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormContext(value: js.Any): Self = this.set("formContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: T): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdSchema(value: IdSchema[_]): Self = this.set("idSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistry(value: Definitions): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = this.set("uiSchema", value.asInstanceOf[js.Any])
  }
}
