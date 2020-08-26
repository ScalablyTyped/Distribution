package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorListProps extends js.Object {
  var errorSchema: FormValidation = js.native
  var errors: js.Array[AjvError] = js.native
  var formContext: js.Any = js.native
  var schema: JSONSchema6 = js.native
  var uiSchema: UiSchema = js.native
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
  @scala.inline
  implicit class ErrorListPropsOps[Self <: ErrorListProps] (val x: Self) extends AnyVal {
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
    def setErrorSchema(value: FormValidation): Self = this.set("errorSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: AjvError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[AjvError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormContext(value: js.Any): Self = this.set("formContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: JSONSchema6): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setUiSchema(value: UiSchema): Self = this.set("uiSchema", value.asInstanceOf[js.Any])
  }
  
}

