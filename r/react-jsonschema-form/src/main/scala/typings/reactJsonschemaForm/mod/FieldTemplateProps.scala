package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldTemplateProps extends js.Object {
  
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
  implicit class FieldTemplatePropsOps[Self <: FieldTemplateProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNames(value: String): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLabel(value: Boolean): Self = this.set("displayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: ReactElement): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormContext(value: js.Any): Self = this.set("formContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: ReactElement): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawDescription(value: String): Self = this.set("rawDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawErrorsVarargs(value: String*): Self = this.set("rawErrors", js.Array(value :_*))
    
    @scala.inline
    def setRawErrors(value: js.Array[String]): Self = this.set("rawErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawHelp(value: String): Self = this.set("rawHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = this.set("uiSchema", value.asInstanceOf[js.Any])
  }
}
