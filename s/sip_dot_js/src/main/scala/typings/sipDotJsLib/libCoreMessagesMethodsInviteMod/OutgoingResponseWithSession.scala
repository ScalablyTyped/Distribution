package typings
package sipDotJsLib.libCoreMessagesMethodsInviteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingResponseWithSession
  extends sipDotJsLib.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse {
  /** Session associated with incoming request acceptance. */
  val session: sipDotJsLib.libCoreSessionSessionMod.Session
}

object OutgoingResponseWithSession {
  @scala.inline
  def apply(message: java.lang.String, session: sipDotJsLib.libCoreSessionSessionMod.Session): OutgoingResponseWithSession = {
    val __obj = js.Dynamic.literal(message = message, session = session)
  
    __obj.asInstanceOf[OutgoingResponseWithSession]
  }
}

