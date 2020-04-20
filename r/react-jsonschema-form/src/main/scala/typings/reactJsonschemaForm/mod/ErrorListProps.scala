package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
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
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorListProps]
  }
}

