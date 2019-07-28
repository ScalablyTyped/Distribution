package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStateStatus extends js.Object {
  var error: Boolean
  var operation: String
  var statusCode: Double
}

object SetStateStatus {
  @scala.inline
  def apply(error: Boolean, operation: String, statusCode: Double): SetStateStatus = {
    val __obj = js.Dynamic.literal(error = error, operation = operation, statusCode = statusCode)
  
    __obj.asInstanceOf[SetStateStatus]
  }
}

