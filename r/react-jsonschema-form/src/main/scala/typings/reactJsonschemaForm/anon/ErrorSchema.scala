package typings.reactJsonschemaForm.anon

import typings.reactJsonschemaForm.mod.AjvError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorSchema extends js.Object {
  var errorSchema: typings.reactJsonschemaForm.mod.ErrorSchema
  var errors: js.Array[AjvError]
}

object ErrorSchema {
  @scala.inline
  def apply(errorSchema: typings.reactJsonschemaForm.mod.ErrorSchema, errors: js.Array[AjvError]): ErrorSchema = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorSchema]
  }
}

