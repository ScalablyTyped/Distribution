package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStateStatus extends js.Object {
  var error: Boolean
  var operation: String
  var statusCode: Double
}

object GetStateStatus {
  @scala.inline
  def apply(error: Boolean, operation: String, statusCode: Double): GetStateStatus = {
    val __obj = js.Dynamic.literal(error = error, operation = operation, statusCode = statusCode)
  
    __obj.asInstanceOf[GetStateStatus]
  }
}

