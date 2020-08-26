package typings.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginRequestPayload extends js.Object {
  var password: String = js.native
  var requestedSequenceNumber: Double = js.native
  var requestedSession: String = js.native
  var username: String = js.native
}

object LoginRequestPayload {
  @scala.inline
  def apply(password: String, requestedSequenceNumber: Double, requestedSession: String, username: String): LoginRequestPayload = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], requestedSequenceNumber = requestedSequenceNumber.asInstanceOf[js.Any], requestedSession = requestedSession.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRequestPayload]
  }
  @scala.inline
  implicit class LoginRequestPayloadOps[Self <: LoginRequestPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedSequenceNumber(value: Double): Self = this.set("requestedSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedSession(value: String): Self = this.set("requestedSession", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

