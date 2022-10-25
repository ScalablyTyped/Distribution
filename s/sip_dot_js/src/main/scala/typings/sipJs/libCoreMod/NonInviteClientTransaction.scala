package typings.sipJs.libCoreMod

import typings.sipJs.libCoreTransactionsTransactionUserMod.ClientTransactionUser
import typings.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "NonInviteClientTransaction")
@js.native
open class NonInviteClientTransaction protected ()
  extends typings.sipJs.libCoreTransactionsMod.NonInviteClientTransaction {
  /**
    * Constructor
    * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
    * Then `toString` is called on the outgoing request and the message is sent via the transport.
    * After construction the transaction will be in the "calling" state and the transaction id
    * will equal the branch parameter set in the Via header of the outgoing request.
    * https://tools.ietf.org/html/rfc3261#section-17.1.2
    * @param request - The outgoing Non-INVITE request.
    * @param transport - The transport.
    * @param user - The transaction user.
    */
  def this(
    request: typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser
  ) = this()
}
