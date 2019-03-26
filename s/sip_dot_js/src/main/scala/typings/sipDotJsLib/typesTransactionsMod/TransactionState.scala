package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionState extends js.Object

@JSImport("sip.js/types/transactions", "TransactionState")
@js.native
object TransactionState extends js.Object {
  @js.native
  sealed trait Accepted
    extends sipDotJsLib.typesTransactionsMod.TransactionState
  
  @js.native
  sealed trait Calling
    extends sipDotJsLib.typesTransactionsMod.TransactionState
  
  @js.native
  sealed trait Completed
    extends sipDotJsLib.typesTransactionsMod.TransactionState
  
  @js.native
  sealed trait Confirmed
    extends sipDotJsLib.typesTransactionsMod.TransactionState
  
  @js.native
  sealed trait Proceeding
    extends sipDotJsLib.typesTransactionsMod.TransactionState
  
  @js.native
  sealed trait Terminated
    extends sipDotJsLib.typesTransactionsMod.TransactionState
  
  @js.native
  sealed trait Trying
    extends sipDotJsLib.typesTransactionsMod.TransactionState
  
  /* "Accepted" */ val Accepted: Accepted with java.lang.String = js.native
  /* "Calling" */ val Calling: Calling with java.lang.String = js.native
  /* "Completed" */ val Completed: Completed with java.lang.String = js.native
  /* "Confirmed" */ val Confirmed: Confirmed with java.lang.String = js.native
  /* "Proceeding" */ val Proceeding: Proceeding with java.lang.String = js.native
  /* "Terminated" */ val Terminated: Terminated with java.lang.String = js.native
  /* "Trying" */ val Trying: Trying with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.typesTransactionsMod.TransactionState with java.lang.String] = js.native
}

