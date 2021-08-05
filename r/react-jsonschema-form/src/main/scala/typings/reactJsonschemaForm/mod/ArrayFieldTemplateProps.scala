package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.StatelessComponent
import typings.reactJsonschemaForm.anon.Children
import typings.reactJsonschemaForm.anon.Definitions
import typings.reactJsonschemaForm.anon.Description
import typings.reactJsonschemaForm.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayFieldTemplateProps[T] extends StObject {
  
  var DescriptionField: StatelessComponent[Description]
  
  var TitleField: StatelessComponent[Id]
  
  var canAdd: Boolean
  
  var className: String
  
  var disabled: Boolean
  
  var formContext: js.Any
  
  var formData: T
  
  var idSchema: IdSchema[js.Any]
  
  var items: js.Array[Children]
  
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, Unit]
  
  var readonly: Boolean
  
  var registry: Definitions
  
  var required: Boolean
  
  var schema: JSONSchema6
  
  var title: String
  
  var uiSchema: UiSchema
}
object ArrayFieldTemplateProps {
  
  inline def apply[T](
    DescriptionField: StatelessComponent[Description],
    TitleField: StatelessComponent[Id],
    canAdd: Boolean,
    className: String,
    disabled: Boolean,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[js.Any],
    items: js.Array[Children],
    onAddClick: js.Any => js.Function1[/* event */ js.Any, Unit],
    readonly: Boolean,
    registry: Definitions,
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ArrayFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], canAdd = canAdd.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onAddClick = js.Any.fromFunction1(onAddClick), readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldTemplateProps[T]]
  }
  
  extension [Self <: ArrayFieldTemplateProps[?], T](x: Self & ArrayFieldTemplateProps[T]) {
    
    inline def setCanAdd(value: Boolean): Self = StObject.set(x, "canAdd", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDescriptionField(value: StatelessComponent[Description]): Self = StObject.set(x, "DescriptionField", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setFormContext(value: js.Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setIdSchema(value: IdSchema[js.Any]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Children]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Children*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setOnAddClick(value: js.Any => js.Function1[/* event */ js.Any, Unit]): Self = StObject.set(x, "onAddClick", js.Any.fromFunction1(value))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Definitions): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleField(value: StatelessComponent[Id]): Self = StObject.set(x, "TitleField", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
  }
}
