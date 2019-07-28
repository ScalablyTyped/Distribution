package typings.sipDotJs.libCoreTransactionsMod

import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions", "ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends typings.sipDotJs.libCoreTransactionsServerDashTransactionMod.ServerTransaction {
  protected def this(
    _request: IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser,
    state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

