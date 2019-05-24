package typings
package sipDotJsLib.libCoreMessagesMethodsInviteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AckableIncomingResponseWithSession
  extends sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse {
  /** Session associated with outgoing request acceptance. */
  val session: sipDotJsLib.libCoreSessionSessionMod.Session = js.native
  /**
    * Send an ACK to acknowledge this response.
    * @param options Request options bucket.
    */
  def ack(): sipDotJsLib.libCoreMessagesMethodsAckMod.OutgoingAckRequest = js.native
  def ack(options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions): sipDotJsLib.libCoreMessagesMethodsAckMod.OutgoingAckRequest = js.native
}

