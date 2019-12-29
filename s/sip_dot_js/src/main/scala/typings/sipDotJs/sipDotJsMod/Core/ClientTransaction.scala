package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typings.sipDotJs.libCoreMod.ClientTransaction {
  protected def this(
    _request: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser,
    state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

/* static members */
@JSImport("sip.js", "Core.ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

