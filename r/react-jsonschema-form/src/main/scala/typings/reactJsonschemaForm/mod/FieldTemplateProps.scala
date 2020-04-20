package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldTemplateProps extends js.Object {
  var children: ReactElement
  var classNames: String
  var description: ReactElement
  var disabled: Boolean
  var displayLabel: Boolean
  var errors: ReactElement
  var fields: js.Array[Field]
  var formContext: js.Any
  var help: ReactElement
  var hidden: Boolean
  var id: String
  var label: String
  var rawDescription: String
  var rawErrors: js.Array[String]
  var rawHelp: String
  var readonly: Boolean
  var required: Boolean
  var schema: JSONSchema6
  var uiSchema: UiSchema
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
}

