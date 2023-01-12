package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.FunctionComponent
import typings.reactJsonschemaForm.anon.Content
import typings.reactJsonschemaForm.anon.Description
import typings.reactJsonschemaForm.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectFieldTemplateProps[T] extends StObject {
  
  var DescriptionField: FunctionComponent[Description]
  
  var TitleField: FunctionComponent[Id]
  
  var description: String
  
  var formContext: Any
  
  var formData: T
  
  var idSchema: IdSchema[Any]
  
  var properties: js.Array[Content]
  
  var required: Boolean
  
  var schema: JSONSchema6
  
  var title: String
  
  var uiSchema: UiSchema
}
object ObjectFieldTemplateProps {
  
  inline def apply[T](
    DescriptionField: FunctionComponent[Description],
    TitleField: FunctionComponent[Id],
    description: String,
    formContext: Any,
    formData: T,
    idSchema: IdSchema[Any],
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
  implicit open class MutableBuilder[Self <: ObjectFieldTemplateProps[?], T] (val x: Self & ObjectFieldTemplateProps[T]) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionField(value: FunctionComponent[Description]): Self = StObject.set(x, "DescriptionField", value.asInstanceOf[js.Any])
    
    inline def setFormContext(value: Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setIdSchema(value: IdSchema[Any]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[Content]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: Content*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleField(value: FunctionComponent[Id]): Self = StObject.set(x, "TitleField", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
  }
}
