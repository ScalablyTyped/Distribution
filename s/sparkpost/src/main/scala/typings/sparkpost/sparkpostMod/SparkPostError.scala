package typings.sparkpost.sparkpostMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkPostError extends Error {
  var errors: js.Array[ErrorWithDescription | ErrorWithParam]
  @JSName("name")
  var name_SparkPostError: typings.sparkpost.sparkpostStrings.SparkPostError
  var statusCode: Double
}

object SparkPostError {
  @scala.inline
  def apply(
    errors: js.Array[ErrorWithDescription | ErrorWithParam],
    message: String,
    name: typings.sparkpost.sparkpostStrings.SparkPostError,
    statusCode: Double,
    stack: String = null
  ): SparkPostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkPostError]
  }
}

