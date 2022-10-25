package typings.sipJs.libCoreMod

import typings.sipJs.libCoreTransactionsTransactionUserMod.ServerTransactionUser
import typings.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "InviteServerTransaction")
@js.native
open class InviteServerTransaction protected ()
  extends typings.sipJs.libCoreTransactionsMod.InviteServerTransaction {
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
  def this(
    request: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser
  ) = this()
}
