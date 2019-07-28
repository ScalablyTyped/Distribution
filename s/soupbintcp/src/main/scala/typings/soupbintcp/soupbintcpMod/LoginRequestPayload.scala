package typings.soupbintcp.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginRequestPayload extends js.Object {
  var password: String
  var requestedSequenceNumber: Double
  var requestedSession: String
  var username: String
}

object LoginRequestPayload {
  @scala.inline
  def apply(password: String, requestedSequenceNumber: Double, requestedSession: String, username: String): LoginRequestPayload = {
    val __obj = js.Dynamic.literal(password = password, requestedSequenceNumber = requestedSequenceNumber, requestedSession = requestedSession, username = username)
  
    __obj.asInstanceOf[LoginRequestPayload]
  }
}

