package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "InviteClientTransaction")
@js.native
class InviteClientTransaction protected ()
  extends typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction {
  /**
    * Constructor.
    * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
    * Then `toString` is called on the outgoing request and the message is sent via the transport.
    * After construction the transaction will be in the "calling" state and the transaction id
    * will equal the branch parameter set in the Via header of the outgoing request.
    * https://tools.ietf.org/html/rfc3261#section-17.1.1
    * @param request - The outgoing INVITE request.
    * @param transport - The transport.
    * @param user - The transaction user.
    */
  def this(
    request: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    transport: typings.sipDotJs.libCoreTransportMod.Transport,
    user: ClientTransactionUser
  ) = this()
}

