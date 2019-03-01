package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseError extends js.Object {
  var errorCode: java.lang.String
  var fieldName: java.lang.String
  var message: java.lang.String
}

object ResponseError {
  @scala.inline
  def apply(errorCode: java.lang.String, fieldName: java.lang.String, message: java.lang.String): ResponseError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ResponseError]
  }
}

