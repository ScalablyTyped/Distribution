package typings.sodiumjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "Transaction")
@js.native
class Transaction ()
  extends typings.sodiumjs.transactionMod.Transaction

/* static members */
@JSImport("sodiumjs", "Transaction")
@js.native
object Transaction extends js.Object {
  var collectCyclesAtEnd: js.Any = js.native
  var currentTransaction: typings.sodiumjs.transactionMod.Transaction = js.native
  var onStartHooks: js.Any = js.native
  var runningOnStartHooks: js.Any = js.native
  def _collectCyclesAtEnd(): scala.Unit = js.native
  /**
    * Add a runnable that will be executed whenever a transaction is started.
    * That runnable may start transactions itself, which will not cause the
    * hooks to be run recursively.
    *
    * The main use case of this is the implementation of a time/alarm system.
    */
  def onStart(r: js.Function0[scala.Unit]): scala.Unit = js.native
  def run[A](f: js.Function0[A]): A = js.native
}

