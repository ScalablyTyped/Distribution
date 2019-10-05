package typings.ssDashUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseStatus extends js.Object {
  var errorCode: String
  var errors: js.Array[ResponseError]
  var message: String
  var stackTrace: String
}

object ResponseStatus {
  @scala.inline
  def apply(errorCode: String, errors: js.Array[ResponseError], message: String, stackTrace: String): ResponseStatus = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errors = errors, message = message, stackTrace = stackTrace)
  
    __obj.asInstanceOf[ResponseStatus]
  }
}

