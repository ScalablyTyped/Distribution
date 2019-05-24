package typings
package sipDotJsLib.libCoreTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Core/transactions", "Transaction")
@js.native
abstract class Transaction protected ()
  extends sipDotJsLib.libCoreTransactionsTransactionMod.Transaction {
  protected def this(_transport: sipDotJsLib.libTransportMod.Transport, _user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.TransactionUser, _id: java.lang.String, _state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
}

