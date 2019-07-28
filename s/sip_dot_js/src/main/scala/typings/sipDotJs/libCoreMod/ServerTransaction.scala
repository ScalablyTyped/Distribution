package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends typings.sipDotJs.libCoreTransactionsMod.ServerTransaction {
  protected def this(
    _request: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    transport: typings.sipDotJs.libCoreTransportMod.Transport,
    user: ServerTransactionUser,
    state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

