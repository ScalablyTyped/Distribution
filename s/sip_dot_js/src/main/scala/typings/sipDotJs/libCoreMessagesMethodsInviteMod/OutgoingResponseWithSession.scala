package typings.sipDotJs.libCoreMessagesMethodsInviteMod

import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse
import typings.sipDotJs.libCoreSessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingResponseWithSession extends OutgoingResponse {
  /**
    * Session associated with incoming request acceptance, or
    * Session associated with incoming request progress (if an out of dialog request, an early dialog).
    */
  val session: Session
}

object OutgoingResponseWithSession {
  @scala.inline
  def apply(message: String, session: Session): OutgoingResponseWithSession = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutgoingResponseWithSession]
  }
}

