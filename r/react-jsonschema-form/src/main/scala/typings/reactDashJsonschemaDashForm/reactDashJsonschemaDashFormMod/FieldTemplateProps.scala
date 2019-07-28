package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.react.reactMod.ReactElement
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
    val __obj = js.Dynamic.literal(children = children, classNames = classNames, description = description, disabled = disabled, displayLabel = displayLabel, errors = errors, fields = fields, formContext = formContext, help = help, hidden = hidden, id = id, label = label, rawDescription = rawDescription, rawErrors = rawErrors, rawHelp = rawHelp, readonly = readonly, required = required, schema = schema, uiSchema = uiSchema)
  
    __obj.asInstanceOf[FieldTemplateProps]
  }
}

