package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseStatus extends js.Object {
  var errorCode: java.lang.String
  var errors: js.Array[ResponseError]
  var message: java.lang.String
  var stackTrace: java.lang.String
}

object ResponseStatus {
  @scala.inline
  def apply(
    errorCode: java.lang.String,
    errors: js.Array[ResponseError],
    message: java.lang.String,
    stackTrace: java.lang.String
  ): ResponseStatus = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errors = errors, message = message, stackTrace = stackTrace)
  
    __obj.asInstanceOf[ResponseStatus]
  }
}

