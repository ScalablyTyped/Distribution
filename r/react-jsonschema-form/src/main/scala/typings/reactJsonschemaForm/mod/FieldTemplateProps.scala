package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldTemplateProps extends StObject {
  
  var children: ReactElement = js.native
  
  var classNames: String = js.native
  
  var description: ReactElement = js.native
  
  var disabled: Boolean = js.native
  
  var displayLabel: Boolean = js.native
  
  var errors: ReactElement = js.native
  
  var fields: js.Array[Field] = js.native
  
  var formContext: js.Any = js.native
  
  var help: ReactElement = js.native
  
  var hidden: Boolean = js.native
  
  var id: String = js.native
  
  var label: String = js.native
  
  var rawDescription: String = js.native
  
  var rawErrors: js.Array[String] = js.native
  
  var rawHelp: String = js.native
  
  var readonly: Boolean = js.native
  
  var required: Boolean = js.native
  
  var schema: JSONSchema6 = js.native
  
  var uiSchema: UiSchema = js.native
}
object FieldTemplateProps {
  
  @scala.inline
  def apply(
    children: ReactElement,
    classNames: String,
    description: ReactElement,
    disabled: Boolean,
    displayLabel: Boolean,
    errors: ReactElement,
    fields: js.Array[Field],
    formContext: js.Any,
    help: ReactElement,
    hidden: Boolean,
    id: String,
    label: String,
    rawDescription: String,
    rawErrors: js.Array[String],
    rawHelp: String,
    readonly: Boolean,
    required: Boolean,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): FieldTemplateProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayLabel = displayLabel.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rawDescription = rawDescription.asInstanceOf[js.Any], rawErrors = rawErrors.asInstanceOf[js.Any], rawHelp = rawHelp.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTemplateProps]
  }
  
  @scala.inline
  implicit class FieldTemplatePropsMutableBuilder[Self <: FieldTemplateProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNames(value: String): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLabel(value: Boolean): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: ReactElement): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFormContext(value: js.Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawDescription(value: String): Self = StObject.set(x, "rawDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawErrors(value: js.Array[String]): Self = StObject.set(x, "rawErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawErrorsVarargs(value: String*): Self = StObject.set(x, "rawErrors", js.Array(value :_*))
    
    @scala.inline
    def setRawHelp(value: String): Self = StObject.set(x, "rawHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
  }
}
