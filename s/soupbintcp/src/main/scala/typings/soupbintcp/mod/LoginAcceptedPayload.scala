package typings.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginAcceptedPayload extends js.Object {
  var sequenceNumber: Double
  var username: String
}

object LoginAcceptedPayload {
  @scala.inline
  def apply(sequenceNumber: Double, username: String): LoginAcceptedPayload = {
    val __obj = js.Dynamic.literal(sequenceNumber = sequenceNumber.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginAcceptedPayload]
  }
}

