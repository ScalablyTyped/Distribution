package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangeEvent[T] extends js.Object {
  var edit: scala.Boolean
  var errorSchema: FormValidation
  var errors: js.Array[AjvError]
  var formData: T
  var idSchema: IdSchema
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var status: js.UndefOr[java.lang.String] = js.undefined
  var uiSchema: UiSchema
}

object IChangeEvent {
  @scala.inline
  def apply[T](
    edit: scala.Boolean,
    errorSchema: FormValidation,
    errors: js.Array[AjvError],
    formData: T,
    idSchema: IdSchema,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    uiSchema: UiSchema,
    status: java.lang.String = null
  ): IChangeEvent[T] = {
    val __obj = js.Dynamic.literal(edit = edit, errorSchema = errorSchema, errors = errors, formData = formData.asInstanceOf[js.Any], idSchema = idSchema, schema = schema, uiSchema = uiSchema)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[IChangeEvent[T]]
  }
}

