package typings.soupbintcp.mod

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
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], requestedSequenceNumber = requestedSequenceNumber.asInstanceOf[js.Any], requestedSession = requestedSession.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRequestPayload]
  }
}

