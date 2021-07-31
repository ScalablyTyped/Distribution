package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionStateMod {
  
  @js.native
  sealed trait TransactionState extends StObject
  @JSImport("sip.js/lib/core/transactions/transaction-state", "TransactionState")
  @js.native
  object TransactionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransactionState & String] = js.native
    
    @js.native
    sealed trait Accepted
      extends StObject
         with TransactionState
    /* "Accepted" */ val Accepted: typings.sipJs.transactionStateMod.TransactionState.Accepted & String = js.native
    
    @js.native
    sealed trait Calling
      extends StObject
         with TransactionState
    /* "Calling" */ val Calling: typings.sipJs.transactionStateMod.TransactionState.Calling & String = js.native
    
    @js.native
    sealed trait Completed
      extends StObject
         with TransactionState
    /* "Completed" */ val Completed: typings.sipJs.transactionStateMod.TransactionState.Completed & String = js.native
    
    @js.native
    sealed trait Confirmed
      extends StObject
         with TransactionState
    /* "Confirmed" */ val Confirmed: typings.sipJs.transactionStateMod.TransactionState.Confirmed & String = js.native
    
    @js.native
    sealed trait Proceeding
      extends StObject
         with TransactionState
    /* "Proceeding" */ val Proceeding: typings.sipJs.transactionStateMod.TransactionState.Proceeding & String = js.native
    
    @js.native
    sealed trait Terminated
      extends StObject
         with TransactionState
    /* "Terminated" */ val Terminated: typings.sipJs.transactionStateMod.TransactionState.Terminated & String = js.native
    
    @js.native
    sealed trait Trying
      extends StObject
         with TransactionState
    /* "Trying" */ val Trying: typings.sipJs.transactionStateMod.TransactionState.Trying & String = js.native
  }
}
