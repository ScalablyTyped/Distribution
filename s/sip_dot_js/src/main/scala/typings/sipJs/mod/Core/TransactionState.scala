package typings.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.TransactionState")
@js.native
object TransactionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.transactionStateMod.TransactionState & String] = js.native
  
  /* "Accepted" */ val Accepted: typings.sipJs.transactionStateMod.TransactionState.Accepted & String = js.native
  
  /* "Calling" */ val Calling: typings.sipJs.transactionStateMod.TransactionState.Calling & String = js.native
  
  /* "Completed" */ val Completed: typings.sipJs.transactionStateMod.TransactionState.Completed & String = js.native
  
  /* "Confirmed" */ val Confirmed: typings.sipJs.transactionStateMod.TransactionState.Confirmed & String = js.native
  
  /* "Proceeding" */ val Proceeding: typings.sipJs.transactionStateMod.TransactionState.Proceeding & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.transactionStateMod.TransactionState.Terminated & String = js.native
  
  /* "Trying" */ val Trying: typings.sipJs.transactionStateMod.TransactionState.Trying & String = js.native
}
