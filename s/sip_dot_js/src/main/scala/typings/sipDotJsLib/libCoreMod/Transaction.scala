package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Transaction")
@js.native
abstract class Transaction protected ()
  extends sipDotJsLib.libCoreTransactionsMod.Transaction {
  protected def this(_transport: sipDotJsLib.libCoreTransportMod.Transport, _user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.TransactionUser, _id: java.lang.String, _state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
}

