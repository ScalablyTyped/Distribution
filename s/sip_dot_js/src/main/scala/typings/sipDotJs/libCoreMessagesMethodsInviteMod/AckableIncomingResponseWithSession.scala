package typings.sipDotJs.libCoreMessagesMethodsInviteMod

import typings.sipDotJs.libCoreMessagesIncomingDashResponseMod.IncomingResponse
import typings.sipDotJs.libCoreMessagesMethodsAckMod.OutgoingAckRequest
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreSessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AckableIncomingResponseWithSession extends IncomingResponse {
  /** Session associated with outgoing request acceptance. */
  val session: Session = js.native
  /**
    * Send an ACK to acknowledge this response.
    * @param options Request options bucket.
    */
  def ack(): OutgoingAckRequest = js.native
  def ack(options: RequestOptions): OutgoingAckRequest = js.native
}

