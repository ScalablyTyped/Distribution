package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/transactions", "InviteClientTransaction")
@js.native
class InviteClientTransaction protected () extends ClientTransaction {
  /**
    * Constructor.
    * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
    * Then `toString` is called on the outgoing request and the message is sent via the transport.
    * After construction the transaction will be in the "calling" state and the transaction id
    * will equal the branch parameter set in the Via header of the outgoing request.
    * https://tools.ietf.org/html/rfc3261#section-17.1.1
    * @param request The outgoing INVITE request.
    * @param transport The transport.
    * @param user The transaction user.
    */
  def this(request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest, transport: sipDotJsLib.typesTransportMod.Transport, user: ClientTransactionUser) = this()
  /**
    * ACK a 2xx final response.
    *
    * The transaction includes the ACK only if the final response was not a 2xx response (the
    * transaction will generate and send the ACK to the transport automagically). If the
    * final response was a 2xx, the ACK is not considered part of the transaction (the
    * transaction user needs to generate and send the ACK).
    *
    * This library is not strictly RFC compliant with regard to ACK handling for 2xx final
    * responses. Specifically, retransmissions of ACKs to a 2xx final responses is handled
    * by the transaction layer (instead of the UAC core). The "standard" approach is for
    * the UAC core to receive all 2xx responses and manage sending ACK retransmissions to
    * the transport directly. Herein the transaction layer manages sending ACKs to 2xx responses
    * and any retransmissions of those ACKs as needed.
    *
    * @param response The incoming 2xx final response.
    * @param ack The outgoing ACK request.
    */
  def ackResponse(
    response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse,
    ack: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest
  ): scala.Unit = js.native
}

