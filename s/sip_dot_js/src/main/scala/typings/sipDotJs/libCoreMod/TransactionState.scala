package typings.sipDotJs.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "TransactionState")
@js.native
object TransactionState extends js.Object {
  /* "Accepted" */ val Accepted: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Accepted with String = js.native
  /* "Calling" */ val Calling: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Calling with String = js.native
  /* "Completed" */ val Completed: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Completed with String = js.native
  /* "Confirmed" */ val Confirmed: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Confirmed with String = js.native
  /* "Proceeding" */ val Proceeding: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Proceeding with String = js.native
  /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Terminated with String = js.native
  /* "Trying" */ val Trying: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Trying with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState with String
  ] = js.native
}

