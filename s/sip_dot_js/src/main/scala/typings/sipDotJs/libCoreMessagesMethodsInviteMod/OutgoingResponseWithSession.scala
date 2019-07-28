package typings.sipDotJs.libCoreMessagesMethodsInviteMod

import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse
import typings.sipDotJs.libCoreSessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingResponseWithSession extends OutgoingResponse {
  /** Session associated with incoming request acceptance. */
  val session: Session
}

object OutgoingResponseWithSession {
  @scala.inline
  def apply(message: String, session: Session): OutgoingResponseWithSession = {
    val __obj = js.Dynamic.literal(message = message, session = session)
  
    __obj.asInstanceOf[OutgoingResponseWithSession]
  }
}

