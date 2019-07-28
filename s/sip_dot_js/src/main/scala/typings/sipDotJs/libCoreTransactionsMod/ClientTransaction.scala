package typings.sipDotJs.libCoreTransactionsMod

import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions", "ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typings.sipDotJs.libCoreTransactionsClientDashTransactionMod.ClientTransaction {
  protected def this(
    _request: OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser,
    state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

/* static members */
@JSImport("sip.js/lib/core/transactions", "ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

