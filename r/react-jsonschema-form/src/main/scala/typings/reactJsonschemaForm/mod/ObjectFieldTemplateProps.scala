package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.StatelessComponent
import typings.reactJsonschemaForm.anon.Content
import typings.reactJsonschemaForm.anon.Description
import typings.reactJsonschemaForm.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectFieldTemplateProps[T] extends StObject {
  
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
  implicit class ObjectFieldTemplatePropsMutableBuilder[Self <: ObjectFieldTemplateProps[_], T] (val x: Self with ObjectFieldTemplateProps[T]) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionField(value: StatelessComponent[Description]): Self = StObject.set(x, "DescriptionField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormContext(value: js.Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdSchema(value: IdSchema[_]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Array[Content]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: Content*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleField(value: StatelessComponent[Id]): Self = StObject.set(x, "TitleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
  }
}
