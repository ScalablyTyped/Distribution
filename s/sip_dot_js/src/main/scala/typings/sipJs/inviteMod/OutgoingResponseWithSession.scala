package typings.sipJs.inviteMod

import typings.sipJs.outgoingResponseMod.OutgoingResponse
import typings.sipJs.sessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingResponseWithSession extends OutgoingResponse {
  /**
    * Session associated with incoming request acceptance, or
    * Session associated with incoming request progress (if an out of dialog request, an early dialog).
    */
  val session: Session = js.native
}

object OutgoingResponseWithSession {
  @scala.inline
  def apply(message: String, session: Session): OutgoingResponseWithSession = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingResponseWithSession]
  }
  @scala.inline
  implicit class OutgoingResponseWithSessionOps[Self <: OutgoingResponseWithSession] (val x: Self) extends AnyVal {
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
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
  }
  
}

