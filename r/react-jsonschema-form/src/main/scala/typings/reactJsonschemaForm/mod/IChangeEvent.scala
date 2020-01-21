package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangeEvent[T] extends js.Object {
  var edit: Boolean
  var errorSchema: FormValidation
  var errors: js.Array[AjvError]
  var formData: T
  var idSchema: IdSchema
  var schema: JSONSchema6
  var status: js.UndefOr[String] = js.undefined
  var uiSchema: UiSchema
}

object IChangeEvent {
  @scala.inline
  def apply[T](
    edit: Boolean,
    errorSchema: FormValidation,
    errors: js.Array[AjvError],
    formData: T,
    idSchema: IdSchema,
    schema: JSONSchema6,
    uiSchema: UiSchema,
    status: String = null
  ): IChangeEvent[T] = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeEvent[T]]
  }
}

