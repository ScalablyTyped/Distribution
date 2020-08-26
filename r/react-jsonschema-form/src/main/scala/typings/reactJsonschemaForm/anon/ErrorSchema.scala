package typings.reactJsonschemaForm.anon

import typings.reactJsonschemaForm.mod.AjvError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorSchema extends js.Object {
  var errorSchema: typings.reactJsonschemaForm.mod.ErrorSchema = js.native
  var errors: js.Array[AjvError] = js.native
}

object ErrorSchema {
  @scala.inline
  def apply(errorSchema: typings.reactJsonschemaForm.mod.ErrorSchema, errors: js.Array[AjvError]): ErrorSchema = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorSchema]
  }
  @scala.inline
  implicit class ErrorSchemaOps[Self <: ErrorSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorSchema(value: typings.reactJsonschemaForm.mod.ErrorSchema): Self = this.set("errorSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: AjvError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[AjvError]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

