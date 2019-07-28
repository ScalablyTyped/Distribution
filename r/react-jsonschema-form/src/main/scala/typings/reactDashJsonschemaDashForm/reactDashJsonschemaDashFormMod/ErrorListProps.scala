package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorListProps extends js.Object {
  var errorSchema: FormValidation
  var errors: js.Array[AjvError]
  var formContext: js.Any
  var schema: JSONSchema6
  var uiSchema: UiSchema
}

object ErrorListProps {
  @scala.inline
  def apply(
    errorSchema: FormValidation,
    errors: js.Array[AjvError],
    formContext: js.Any,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): ErrorListProps = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema, errors = errors, formContext = formContext, schema = schema, uiSchema = uiSchema)
  
    __obj.asInstanceOf[ErrorListProps]
  }
}

