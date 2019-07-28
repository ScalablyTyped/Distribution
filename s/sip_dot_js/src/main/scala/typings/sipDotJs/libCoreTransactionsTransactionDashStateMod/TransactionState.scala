package typings.sipDotJs.libCoreTransactionsTransactionDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionState extends js.Object

@JSImport("sip.js/lib/core/transactions/transaction-state", "TransactionState")
@js.native
object TransactionState extends js.Object {
  @js.native
  sealed trait Accepted extends TransactionState
  
  @js.native
  sealed trait Calling extends TransactionState
  
  @js.native
  sealed trait Completed extends TransactionState
  
  @js.native
  sealed trait Confirmed extends TransactionState
  
  @js.native
  sealed trait Proceeding extends TransactionState
  
  @js.native
  sealed trait Terminated extends TransactionState
  
  @js.native
  sealed trait Trying extends TransactionState
  
  /* "Accepted" */ val Accepted: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Accepted with String = js.native
  /* "Calling" */ val Calling: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Calling with String = js.native
  /* "Completed" */ val Completed: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Completed with String = js.native
  /* "Confirmed" */ val Confirmed: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Confirmed with String = js.native
  /* "Proceeding" */ val Proceeding: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Proceeding with String = js.native
  /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Terminated with String = js.native
  /* "Trying" */ val Trying: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Trying with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionState with String] = js.native
}

