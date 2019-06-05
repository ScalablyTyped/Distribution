package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "TransactionState")
@js.native
object TransactionState extends js.Object {
  /* "Accepted" */ val Accepted: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Accepted with java.lang.String = js.native
  /* "Calling" */ val Calling: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Calling with java.lang.String = js.native
  /* "Completed" */ val Completed: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Completed with java.lang.String = js.native
  /* "Confirmed" */ val Confirmed: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Confirmed with java.lang.String = js.native
  /* "Proceeding" */ val Proceeding: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Proceeding with java.lang.String = js.native
  /* "Terminated" */ val Terminated: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Terminated with java.lang.String = js.native
  /* "Trying" */ val Trying: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Trying with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState with java.lang.String
  ] = js.native
}

