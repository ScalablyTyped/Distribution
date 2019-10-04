package typings.sipDotJs.libCoreTransactionsMod

import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions", "InviteServerTransaction")
@js.native
class InviteServerTransaction protected ()
  extends typings.sipDotJs.libCoreTransactionsInviteDashServerDashTransactionMod.InviteServerTransaction {
  /**
    * Constructor.
    * Upon construction, a "100 Trying" reply will be immediately sent.
    * After construction the transaction will be in the "proceeding" state and the transaction
    * `id` will equal the branch parameter set in the Via header of the incoming request.
    * https://tools.ietf.org/html/rfc3261#section-17.2.1
    * @param request - Incoming INVITE request from the transport.
    * @param transport - The transport.
    * @param user - The transaction user.
    */
  def this(request: IncomingRequestMessage, transport: Transport, user: ServerTransactionUser) = this()
}

