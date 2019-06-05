package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends sipDotJsLib.libCoreTransactionsMod.ClientTransaction {
  protected def this(_request: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser, state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

