package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorListProps extends js.Object {
  var errorSchema: FormValidation
  var errors: js.Array[AjvError]
  var formContext: js.Any
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var uiSchema: UiSchema
}

object ErrorListProps {
  @scala.inline
  def apply(
    errorSchema: FormValidation,
    errors: js.Array[AjvError],
    formContext: js.Any,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    uiSchema: UiSchema
  ): ErrorListProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorSchema")(errorSchema)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("formContext")(formContext)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("uiSchema")(uiSchema)
    __obj.asInstanceOf[ErrorListProps]
  }
}

