package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to an ObjectFieldTemplate implementation */
trait ObjectFieldTemplateProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** A string value containing the description for the object */
  var description: js.UndefOr[String] = js.undefined
  
  /** A boolean value stating if the object is disabled */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** The optional validation errors in the form of an `ErrorSchema` */
  var errorSchema: js.UndefOr[ErrorSchema[T]] = js.undefined
  
  /** The `formContext` object that was passed to Form */
  var formContext: js.UndefOr[F] = js.undefined
  
  /** The form data for the object */
  var formData: js.UndefOr[T] = js.undefined
  
  /** A boolean value stating if the field is hiding its errors */
  var hideError: js.UndefOr[Boolean] = js.undefined
  
  /** An object containing the id for this object & ids for its properties */
  var idSchema: IdSchema[T]
  
  /** Returns a function that adds a new property to the object (to be used with additionalProperties) */
  def onAddClick(schema: S): js.Function0[Unit]
  
  /** An array of objects representing the properties in the object */
  var properties: js.Array[ObjectFieldTemplatePropertyType]
  
  /** A boolean value stating if the object is read-only */
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** A boolean value stating if the object is required */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /** The schema object for this object */
  var schema: S
  
  /** A string value containing the title for the object */
  var title: String
  
  /** The uiSchema object for this object field */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object ObjectFieldTemplateProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
    idSchema: IdSchema[T],
    onAddClick: S => js.Function0[Unit],
    properties: js.Array[ObjectFieldTemplatePropertyType],
    registry: Registry[T, S, F],
    schema: S,
    title: String
  ): ObjectFieldTemplateProps[T, S, F] = {
    val __obj = js.Dynamic.literal(idSchema = idSchema.asInstanceOf[js.Any], onAddClick = js.Any.fromFunction1(onAddClick), properties = properties.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldTemplateProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectFieldTemplateProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (ObjectFieldTemplateProps[T, S, F])) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorSchema(value: ErrorSchema[T]): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
    
    inline def setErrorSchemaUndefined: Self = StObject.set(x, "errorSchema", js.undefined)
    
    inline def setFormContext(value: F): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setFormContextUndefined: Self = StObject.set(x, "formContext", js.undefined)
    
    inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHideError(value: Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
    
    inline def setHideErrorUndefined: Self = StObject.set(x, "hideError", js.undefined)
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setOnAddClick(value: S => js.Function0[Unit]): Self = StObject.set(x, "onAddClick", js.Any.fromFunction1(value))
    
    inline def setProperties(value: js.Array[ObjectFieldTemplatePropertyType]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: ObjectFieldTemplatePropertyType*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
