package typings.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.TransactionState")
@js.native
object TransactionState extends js.Object {
  /* "Accepted" */ val Accepted: typings.sipJs.transactionStateMod.TransactionState.Accepted with String = js.native
  /* "Calling" */ val Calling: typings.sipJs.transactionStateMod.TransactionState.Calling with String = js.native
  /* "Completed" */ val Completed: typings.sipJs.transactionStateMod.TransactionState.Completed with String = js.native
  /* "Confirmed" */ val Confirmed: typings.sipJs.transactionStateMod.TransactionState.Confirmed with String = js.native
  /* "Proceeding" */ val Proceeding: typings.sipJs.transactionStateMod.TransactionState.Proceeding with String = js.native
  /* "Terminated" */ val Terminated: typings.sipJs.transactionStateMod.TransactionState.Terminated with String = js.native
  /* "Trying" */ val Trying: typings.sipJs.transactionStateMod.TransactionState.Trying with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.transactionStateMod.TransactionState with String] = js.native
}

