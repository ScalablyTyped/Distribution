package typings.sipJs

import typings.events.mod.EventEmitter
import typings.sipJs.coreExceptionsMod.TransportError
import typings.sipJs.coreTransportMod.Transport
import typings.sipJs.logMod.Logger
import typings.sipJs.sipJsStrings.stateChanged
import typings.sipJs.transactionStateMod.TransactionState
import typings.sipJs.transactionUserMod.TransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions/transaction", JSImport.Namespace)
@js.native
object transactionMod extends js.Object {
  @js.native
  abstract class Transaction protected () extends EventEmitter {
    protected def this(
      _transport: Transport,
      _user: TransactionUser,
      _id: String,
      _state: TransactionState,
      loggerCategory: String
    ) = this()
    var _id: js.Any = js.native
    var _state: js.Any = js.native
    var _transport: js.Any = js.native
    var _user: js.Any = js.native
    /** Transaction id. */
    val id: String = js.native
    /** Transaction kind. Deprecated. */
    val kind: String = js.native
    var logger: Logger = js.native
    /** Transaction state. */
    val state: TransactionState = js.native
    /** Transaction transport. */
    val transport: Transport = js.native
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
    def dispose(): Unit = js.native
    /* protected */ def logTransportError(error: TransportError, message: String): Unit = js.native
    /* protected */ def onTransportError(error: TransportError): Unit = js.native
    /** Subscribe to 'stateChanged' event. */
    @JSName("on")
    def on_stateChanged(name: stateChanged, callback: js.Function0[Unit]): this.type = js.native
    /**
      * Pass message to transport for transmission. If transport fails,
      * the transaction user is notified by callback to onTransportError().
      * @returns
      * Rejects with `TransportError` if transport fails.
      */
    /* protected */ def send(message: String): js.Promise[Unit] = js.native
    /* protected */ def setState(state: TransactionState): Unit = js.native
    /* protected */ def typeToString(): String = js.native
  }
  
}

