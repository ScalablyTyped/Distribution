package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldTemplateProps extends js.Object {
  var children: reactLib.reactMod.ReactElement[_]
  var classNames: java.lang.String
  var description: reactLib.reactMod.ReactElement[_]
  var disabled: scala.Boolean
  var displayLabel: scala.Boolean
  var errors: reactLib.reactMod.ReactElement[_]
  var fields: js.Array[Field]
  var formContext: js.Any
  var help: reactLib.reactMod.ReactElement[_]
  var hidden: scala.Boolean
  var id: java.lang.String
  var label: java.lang.String
  var rawDescription: java.lang.String
  var rawErrors: js.Array[java.lang.String]
  var rawHelp: java.lang.String
  var readonly: scala.Boolean
  var required: scala.Boolean
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var uiSchema: UiSchema
}

object FieldTemplateProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement[_],
    classNames: java.lang.String,
    description: reactLib.reactMod.ReactElement[_],
    disabled: scala.Boolean,
    displayLabel: scala.Boolean,
    errors: reactLib.reactMod.ReactElement[_],
    fields: js.Array[Field],
    formContext: js.Any,
    help: reactLib.reactMod.ReactElement[_],
    hidden: scala.Boolean,
    id: java.lang.String,
    label: java.lang.String,
    rawDescription: java.lang.String,
    rawErrors: js.Array[java.lang.String],
    rawHelp: java.lang.String,
    readonly: scala.Boolean,
    required: scala.Boolean,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    uiSchema: UiSchema
  ): FieldTemplateProps = {
    val __obj = js.Dynamic.literal(children = children, classNames = classNames, description = description, disabled = disabled, displayLabel = displayLabel, errors = errors, fields = fields, formContext = formContext, help = help, hidden = hidden, id = id, label = label, rawDescription = rawDescription, rawErrors = rawErrors, rawHelp = rawHelp, readonly = readonly, required = required, schema = schema, uiSchema = uiSchema)
  
    __obj.asInstanceOf[FieldTemplateProps]
  }
}

