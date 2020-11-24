package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/transactions/transaction-state", JSImport.Namespace)
@js.native
object transactionStateMod extends js.Object {
  
  @js.native
  sealed trait TransactionState extends js.Object
  @js.native
  object TransactionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransactionState with String] = js.native
    
    @js.native
    sealed trait Accepted extends TransactionState
    /* "Accepted" */ @js.native
    object Accepted extends TopLevel[Accepted with String]
    
    @js.native
    sealed trait Calling extends TransactionState
    /* "Calling" */ @js.native
    object Calling extends TopLevel[Calling with String]
    
    @js.native
    sealed trait Completed extends TransactionState
    /* "Completed" */ @js.native
    object Completed extends TopLevel[Completed with String]
    
    @js.native
    sealed trait Confirmed extends TransactionState
    /* "Confirmed" */ @js.native
    object Confirmed extends TopLevel[Confirmed with String]
    
    @js.native
    sealed trait Proceeding extends TransactionState
    /* "Proceeding" */ @js.native
    object Proceeding extends TopLevel[Proceeding with String]
    
    @js.native
    sealed trait Terminated extends TransactionState
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
    @js.native
    sealed trait Trying extends TransactionState
    /* "Trying" */ @js.native
    object Trying extends TopLevel[Trying with String]
  }
}
