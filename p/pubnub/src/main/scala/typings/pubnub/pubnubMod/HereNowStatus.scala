package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HereNowStatus extends js.Object {
  var error: Boolean
  var operation: String
   // see Pubnub.Operations;
  var statusCode: Double
}

object HereNowStatus {
  @scala.inline
  def apply(error: Boolean, operation: String, statusCode: Double): HereNowStatus = {
    val __obj = js.Dynamic.literal(error = error, operation = operation, statusCode = statusCode)
  
    __obj.asInstanceOf[HereNowStatus]
  }
}

