package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a FieldTemplate implementation */
trait FieldTemplateProps[T, F] extends StObject {
  
  /** The field or widget component instance for this field row */
  var children: ReactElement
  
  /** A string containing the base CSS classes, merged with any custom ones defined in your uiSchema */
  var classNames: js.UndefOr[String] = js.undefined
  
  /** A component instance rendering the field description, if one is defined (this will use any custom
    * `DescriptionField` defined)
    */
  var description: js.UndefOr[ReactElement] = js.undefined
  
  /** A boolean value stating if the field is disabled */
  var disabled: Boolean
  
  /** A boolean value stating if the label should be rendered or not. This is useful for nested fields in arrays where
    * you don't want to clutter the UI
    */
  var displayLabel: js.UndefOr[Boolean] = js.undefined
  
  /** A component instance listing any encountered errors for this field */
  var errors: js.UndefOr[ReactElement] = js.undefined
  
  /** The `formContext` object that was passed to `Form` */
  var formContext: js.UndefOr[F] = js.undefined
  
  /** The formData for this field */
  var formData: T
  
  /** A component instance rendering any `ui:help` uiSchema directive defined */
  var help: js.UndefOr[ReactElement] = js.undefined
  
  /** A boolean value stating if the field should be hidden */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean value stating if the field is hiding its errors */
  var hideError: js.UndefOr[Boolean] = js.undefined
  
  /** The id of the field in the hierarchy. You can use it to render a label targeting the wrapped widget */
  var id: String
  
  /** The computed label for this field, as a string */
  var label: String
  
  /** The value change event handler; Can be called with a new value to change the value for this field */
  def onChange(value: T): Unit
  
  /** The property drop/removal event handler; Called when a field is removed in an additionalProperty context */
  def onDropPropertyClick(value: String): js.Function0[Unit]
  
  /** The key change event handler; Called when the key associated with a field is changed for an additionalProperty */
  def onKeyChange(value: String): js.Function0[Unit]
  
  /** A string containing any `ui:description` uiSchema directive defined */
  var rawDescription: js.UndefOr[String] = js.undefined
  
  /** An array of strings listing all generated error messages from encountered errors for this field */
  var rawErrors: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A string containing any `ui:help` uiSchema directive defined. **NOTE:** `rawHelp` will be `undefined` if passed
    * `ui:help` is a React component instead of a string
    */
  var rawHelp: js.UndefOr[String] = js.undefined
  
  /** A boolean value stating if the field is read-only */
  var readonly: Boolean
  
  /** The `registry` object */
  var registry: Registry[T, F]
  
  /** A boolean value stating if the field is required */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /** The schema object for this field */
  var schema: RJSFSchema
  
  /** The uiSchema object for this field */
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object FieldTemplateProps {
  
  inline def apply[T, F](
    children: ReactElement,
    disabled: Boolean,
    formData: T,
    id: String,
    label: String,
    onChange: T => Unit,
    onDropPropertyClick: String => js.Function0[Unit],
    onKeyChange: String => js.Function0[Unit],
    readonly: Boolean,
    registry: Registry[T, F],
    schema: RJSFSchema
  ): FieldTemplateProps[T, F] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onDropPropertyClick = js.Any.fromFunction1(onDropPropertyClick), onKeyChange = js.Any.fromFunction1(onKeyChange), readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTemplateProps[T, F]]
  }
  
  extension [Self <: FieldTemplateProps[?, ?], T, F](x: Self & (FieldTemplateProps[T, F])) {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassNames(value: String): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabel(value: Boolean): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
    
    inline def setErrors(value: ReactElement): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setFormContext(value: F): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setFormContextUndefined: Self = StObject.set(x, "formContext", js.undefined)
    
    inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHideError(value: Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
    
    inline def setHideErrorUndefined: Self = StObject.set(x, "hideError", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnDropPropertyClick(value: String => js.Function0[Unit]): Self = StObject.set(x, "onDropPropertyClick", js.Any.fromFunction1(value))
    
    inline def setOnKeyChange(value: String => js.Function0[Unit]): Self = StObject.set(x, "onKeyChange", js.Any.fromFunction1(value))
    
    inline def setRawDescription(value: String): Self = StObject.set(x, "rawDescription", value.asInstanceOf[js.Any])
    
    inline def setRawDescriptionUndefined: Self = StObject.set(x, "rawDescription", js.undefined)
    
    inline def setRawErrors(value: js.Array[String]): Self = StObject.set(x, "rawErrors", value.asInstanceOf[js.Any])
    
    inline def setRawErrorsUndefined: Self = StObject.set(x, "rawErrors", js.undefined)
    
    inline def setRawErrorsVarargs(value: String*): Self = StObject.set(x, "rawErrors", js.Array(value*))
    
    inline def setRawHelp(value: String): Self = StObject.set(x, "rawHelp", value.asInstanceOf[js.Any])
    
    inline def setRawHelpUndefined: Self = StObject.set(x, "rawHelp", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
