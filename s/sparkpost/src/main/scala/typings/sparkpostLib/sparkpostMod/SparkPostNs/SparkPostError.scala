package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkPostError
  extends nodeLib.Error {
  var errors: js.Array[ErrorWithDescription] | js.Array[ErrorWithParam]
  var name: sparkpostLib.sparkpostLibStrings.SparkPostError
  var statusCode: scala.Double
}

object SparkPostError {
  @scala.inline
  def apply(
    errors: js.Array[ErrorWithDescription] | js.Array[ErrorWithParam],
    name: sparkpostLib.sparkpostLibStrings.SparkPostError,
    statusCode: scala.Double,
    stack: java.lang.String = null
  ): SparkPostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name, statusCode = statusCode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SparkPostError]
  }
}

