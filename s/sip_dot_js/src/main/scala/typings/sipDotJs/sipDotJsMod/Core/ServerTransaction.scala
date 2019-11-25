package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends typings.sipDotJs.libCoreMod.ServerTransaction {
  protected def this(
    _request: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    transport: typings.sipDotJs.libCoreTransportMod.Transport,
    user: ServerTransactionUser,
    state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

