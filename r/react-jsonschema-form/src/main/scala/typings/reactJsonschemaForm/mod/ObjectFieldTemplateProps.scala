package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.StatelessComponent
import typings.reactJsonschemaForm.anon.Content
import typings.reactJsonschemaForm.anon.Description
import typings.reactJsonschemaForm.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectFieldTemplateProps[T] extends js.Object {
  
  var DescriptionField: StatelessComponent[Description] = js.native
  
  var TitleField: StatelessComponent[Id] = js.native
  
  var description: String = js.native
  
  var formContext: js.Any = js.native
  
  var formData: T = js.native
  
  var idSchema: IdSchema[_] = js.native
  
  var properties: js.Array[Content] = js.native
  
  var required: Boolean = js.native
  
  var schema: JSONSchema6 = js.native
  
  var title: String = js.native
  
  var uiSchema: UiSchema = js.native
}
object ObjectFieldTemplateProps {
  
  @scala.inline
  def apply[T](
    DescriptionField: StatelessComponent[Description],
    TitleField: StatelessComponent[Id],
    description: String,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    properties: js.Array[Content],
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ObjectFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldTemplateProps[T]]
  }
  
  @scala.inline
  implicit class ObjectFieldTemplatePropsOps[Self <: ObjectFieldTemplateProps[_], T] (val x: Self with ObjectFieldTemplateProps[T]) extends AnyVal {
    
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
    def setDescriptionField(value: StatelessComponent[Description]): Self = this.set("DescriptionField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleField(value: StatelessComponent[Id]): Self = this.set("TitleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormContext(value: js.Any): Self = this.set("formContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: T): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdSchema(value: IdSchema[_]): Self = this.set("idSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: Content*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[Content]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = this.set("uiSchema", value.asInstanceOf[js.Any])
  }
}
