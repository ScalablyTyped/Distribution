package typings.sipDotJs.libCoreTransactionsMod

import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions", "NonInviteServerTransaction")
@js.native
class NonInviteServerTransaction protected ()
  extends typings.sipDotJs.libCoreTransactionsNonDashInviteDashServerDashTransactionMod.NonInviteServerTransaction {
  /**
    * Constructor.
    * After construction the transaction will be in the "trying": state and the transaction
    * `id` will equal the branch parameter set in the Via header of the incoming request.
    * https://tools.ietf.org/html/rfc3261#section-17.2.2
    * @param request - Incoming Non-INVITE request from the transport.
    * @param transport - The transport.
    * @param user - The transaction user.
    */
  def this(request: IncomingRequestMessage, transport: Transport, user: ServerTransactionUser) = this()
}

