package typings
package sipDotJsLib.libCoreTransactionsTransactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions/transaction", "Transaction")
@js.native
abstract class Transaction protected ()
  extends nodeLib.eventsMod.EventEmitter {
  protected def this(_transport: sipDotJsLib.libCoreTransportMod.Transport, _user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.TransactionUser, _id: java.lang.String, _state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
  var _id: js.Any = js.native
  var _state: js.Any = js.native
  var _transport: js.Any = js.native
  var _user: js.Any = js.native
  /** Transaction id. */
  val id: java.lang.String = js.native
  /** Transaction kind. Deprecated. */
  val kind: java.lang.String = js.native
  var logger: sipDotJsLib.libCoreLogMod.Logger = js.native
  /** Transaction state. */
  val state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState = js.native
  /** Transaction transport. */
  val transport: sipDotJsLib.libCoreTransportMod.Transport = js.native
  /**
    * Destructor.
    * Once the transaction is in the "terminated" state, it is destroyed
    * immediately and there is no need to call `dispose`. However, if a
    * transaction needs to be ended prematurely, the transaction user may
    * do so by calling this method (for example, perhaps the UA is shutting down).
    * No state transition will occur upon calling this method, all outstanding
    * transmission timers will be cancelled, and use of the transaction after
    * calling `dispose` is undefined.
    */
  def dispose(): scala.Unit = js.native
  /* protected */ def logTransportError(error: sipDotJsLib.libCoreExceptionsMod.TransportError, message: java.lang.String): scala.Unit = js.native
  /* protected */ def onTransportError(error: sipDotJsLib.libCoreExceptionsMod.TransportError): scala.Unit = js.native
  /** Subscribe to 'stateChanged' event. */
  @JSName("on")
  def on_stateChanged(name: sipDotJsLib.sipDotJsLibStrings.stateChanged, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Pass message to transport for transmission. If transport fails,
    * the transaction user is notified by callback to onTransportError().
    * @throws {TransportError} If transport fails.
    */
  /* protected */ def send(message: java.lang.String): js.Promise[scala.Unit] = js.native
  /* protected */ def setState(state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState): scala.Unit = js.native
  /* protected */ def typeToString(): java.lang.String = js.native
}

