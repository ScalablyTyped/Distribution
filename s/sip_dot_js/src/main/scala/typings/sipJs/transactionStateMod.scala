package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions/transaction-state", JSImport.Namespace)
@js.native
object transactionStateMod extends js.Object {
  @js.native
  sealed trait TransactionState extends js.Object
  
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransactionState with String] = js.native
    /* "Accepted" */ @js.native
    object Accepted extends TopLevel[Accepted with String]
    
    /* "Calling" */ @js.native
    object Calling extends TopLevel[Calling with String]
    
    /* "Completed" */ @js.native
    object Completed extends TopLevel[Completed with String]
    
    /* "Confirmed" */ @js.native
    object Confirmed extends TopLevel[Confirmed with String]
    
    /* "Proceeding" */ @js.native
    object Proceeding extends TopLevel[Proceeding with String]
    
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
    /* "Trying" */ @js.native
    object Trying extends TopLevel[Trying with String]
    
  }
  
}

