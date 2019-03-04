package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginRejectedPayload extends js.Object {
  var rejectReasonCode: java.lang.String
}

object LoginRejectedPayload {
  @scala.inline
  def apply(rejectReasonCode: java.lang.String): LoginRejectedPayload = {
    val __obj = js.Dynamic.literal(rejectReasonCode = rejectReasonCode)
  
    __obj.asInstanceOf[LoginRejectedPayload]
  }
}

