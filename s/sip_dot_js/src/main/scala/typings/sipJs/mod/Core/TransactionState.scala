package typings.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.TransactionState")
@js.native
object TransactionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState & String] = js.native
  
  /* "Accepted" */ val Accepted: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Accepted & String = js.native
  
  /* "Calling" */ val Calling: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Calling & String = js.native
  
  /* "Completed" */ val Completed: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Completed & String = js.native
  
  /* "Confirmed" */ val Confirmed: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Confirmed & String = js.native
  
  /* "Proceeding" */ val Proceeding: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Proceeding & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Terminated & String = js.native
  
  /* "Trying" */ val Trying: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState.Trying & String = js.native
}
