package typings.sparkpost.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkPostError extends Error {
  var errors: js.Array[ErrorWithDescription | ErrorWithParam] = js.native
  @JSName("name")
  var name_SparkPostError: typings.sparkpost.sparkpostStrings.SparkPostError = js.native
  var statusCode: Double = js.native
}

object SparkPostError {
  @scala.inline
  def apply(
    errors: js.Array[ErrorWithDescription | ErrorWithParam],
    message: String,
    name: typings.sparkpost.sparkpostStrings.SparkPostError,
    statusCode: Double
  ): SparkPostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkPostError]
  }
  @scala.inline
  implicit class SparkPostErrorOps[Self <: SparkPostError] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: (ErrorWithDescription | ErrorWithParam)*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[ErrorWithDescription | ErrorWithParam]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: typings.sparkpost.sparkpostStrings.SparkPostError): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

