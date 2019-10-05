package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typings.sipDotJs.libCoreTransactionsMod.ClientTransaction {
  protected def this(
    _request: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    transport: typings.sipDotJs.libCoreTransportMod.Transport,
    user: ClientTransactionUser,
    state: TransactionState,
    loggerCategory: String
  ) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

