package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantStatus extends js.Object {
  var error: Boolean
  var operation: String
  var statusCode: Double
}

object GrantStatus {
  @scala.inline
  def apply(error: Boolean, operation: String, statusCode: Double): GrantStatus = {
    val __obj = js.Dynamic.literal(error = error, operation = operation, statusCode = statusCode)
  
    __obj.asInstanceOf[GrantStatus]
  }
}

