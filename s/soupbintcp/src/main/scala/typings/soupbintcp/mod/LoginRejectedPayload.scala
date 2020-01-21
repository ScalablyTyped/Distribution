package typings.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginRejectedPayload extends js.Object {
  var rejectReasonCode: String
}

object LoginRejectedPayload {
  @scala.inline
  def apply(rejectReasonCode: String): LoginRejectedPayload = {
    val __obj = js.Dynamic.literal(rejectReasonCode = rejectReasonCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginRejectedPayload]
  }
}

