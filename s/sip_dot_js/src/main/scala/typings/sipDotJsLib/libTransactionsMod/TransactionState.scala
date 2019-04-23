package typings
package sipDotJsLib.libTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionState extends js.Object

@JSImport("sip.js/lib/Transactions", "TransactionState")
@js.native
object TransactionState extends js.Object {
  @js.native
  sealed trait Accepted
    extends sipDotJsLib.libTransactionsMod.TransactionState
  
  @js.native
  sealed trait Calling
    extends sipDotJsLib.libTransactionsMod.TransactionState
  
  @js.native
  sealed trait Completed
    extends sipDotJsLib.libTransactionsMod.TransactionState
  
  @js.native
  sealed trait Confirmed
    extends sipDotJsLib.libTransactionsMod.TransactionState
  
  @js.native
  sealed trait Proceeding
    extends sipDotJsLib.libTransactionsMod.TransactionState
  
  @js.native
  sealed trait Terminated
    extends sipDotJsLib.libTransactionsMod.TransactionState
  
  @js.native
  sealed trait Trying
    extends sipDotJsLib.libTransactionsMod.TransactionState
  
  /* "Accepted" */ val Accepted: Accepted with java.lang.String = js.native
  /* "Calling" */ val Calling: Calling with java.lang.String = js.native
  /* "Completed" */ val Completed: Completed with java.lang.String = js.native
  /* "Confirmed" */ val Confirmed: Confirmed with java.lang.String = js.native
  /* "Proceeding" */ val Proceeding: Proceeding with java.lang.String = js.native
  /* "Terminated" */ val Terminated: Terminated with java.lang.String = js.native
  /* "Trying" */ val Trying: Trying with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libTransactionsMod.TransactionState with java.lang.String] = js.native
}

