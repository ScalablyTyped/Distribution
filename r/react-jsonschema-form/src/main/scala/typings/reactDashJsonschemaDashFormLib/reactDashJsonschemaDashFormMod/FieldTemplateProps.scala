package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldTemplateProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactElement[_]
  var classNames: java.lang.String
  var description: reactLib.reactMod.ReactNs.ReactElement[_]
  var disabled: scala.Boolean
  var displayLabel: scala.Boolean
  var errors: reactLib.reactMod.ReactNs.ReactElement[_]
  var fields: js.Array[Field]
  var formContext: js.Any
  var help: reactLib.reactMod.ReactNs.ReactElement[_]
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
    children: reactLib.reactMod.ReactNs.ReactElement[_],
    classNames: java.lang.String,
    description: reactLib.reactMod.ReactNs.ReactElement[_],
    disabled: scala.Boolean,
    displayLabel: scala.Boolean,
    errors: reactLib.reactMod.ReactNs.ReactElement[_],
    fields: js.Array[Field],
    formContext: js.Any,
    help: reactLib.reactMod.ReactNs.ReactElement[_],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("classNames")(classNames)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("displayLabel")(displayLabel)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("formContext")(formContext)
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("hidden")(hidden)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("rawDescription")(rawDescription)
    __obj.updateDynamic("rawErrors")(rawErrors)
    __obj.updateDynamic("rawHelp")(rawHelp)
    __obj.updateDynamic("readonly")(readonly)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("uiSchema")(uiSchema)
    __obj.asInstanceOf[FieldTemplateProps]
  }
}

