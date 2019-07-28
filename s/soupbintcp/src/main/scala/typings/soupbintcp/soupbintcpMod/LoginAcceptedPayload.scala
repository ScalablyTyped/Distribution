package typings.soupbintcp.soupbintcpMod

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
    val __obj = js.Dynamic.literal(sequenceNumber = sequenceNumber, username = username)
  
    __obj.asInstanceOf[LoginAcceptedPayload]
  }
}

