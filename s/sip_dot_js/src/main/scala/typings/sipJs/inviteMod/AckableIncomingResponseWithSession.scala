package typings.sipJs.inviteMod

import typings.sipJs.ackMod.OutgoingAckRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.sessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AckableIncomingResponseWithSession extends IncomingResponse {
  /** Session associated with outgoing request acceptance. */
  val session: Session = js.native
  /**
    * Send an ACK to acknowledge this response.
    * @param options - Request options bucket.
    */
  def ack(): OutgoingAckRequest = js.native
  def ack(options: RequestOptions): OutgoingAckRequest = js.native
}

