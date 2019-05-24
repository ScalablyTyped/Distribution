package typings
package sipDotJsLib.libCoreTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Core/transactions", "ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends sipDotJsLib.libCoreTransactionsClientDashTransactionMod.ClientTransaction {
  protected def this(_request: sipDotJsLib.libSIPMessageMod.OutgoingRequest, transport: sipDotJsLib.libTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser, state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
}

/* static members */
@JSImport("sip.js/lib/Core/transactions", "ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

