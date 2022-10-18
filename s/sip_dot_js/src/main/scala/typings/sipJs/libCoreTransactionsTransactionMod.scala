package typings.sipJs

import typings.sipJs.anon.Once
import typings.sipJs.libCoreExceptionsMod.TransportError
import typings.sipJs.libCoreLogMod.Logger
import typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState
import typings.sipJs.libCoreTransactionsTransactionUserMod.TransactionUser
import typings.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTransactionsTransactionMod {
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/transactions/transaction", "Transaction")
  @js.native
  open class Transaction protected () extends StObject {
    /* protected */ def this(
      _transport: Transport,
      _user: TransactionUser,
      _id: String,
      _state: TransactionState,
      loggerCategory: String
    ) = this()
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _transport: Any = js.native
    
    /* private */ var _user: Any = js.native
    
    /**
      * Sets up a function that will be called whenever the transaction state changes.
      * @param listener - Callback function.
      * @param options - An options object that specifies characteristics about the listener.
      *                  If once true, indicates that the listener should be invoked at most once after being added.
      *                  If once true, the listener would be automatically removed when invoked.
      */
    def addStateChangeListener(listener: js.Function0[Unit]): Unit = js.native
    def addStateChangeListener(listener: js.Function0[Unit], options: Once): Unit = js.native
    
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
    
    /** Transaction id. */
    def id: String = js.native
    
    /** Transaction kind. Deprecated. */
    def kind: String = js.native
    
    /* private */ var listeners: Any = js.native
    
    /* protected */ def logTransportError(error: TransportError, message: String): Unit = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * This is currently public so tests may spy on it.
      * @internal
      */
    def notifyStateChangeListeners(): Unit = js.native
    
    /* protected */ def onTransportError(error: TransportError): Unit = js.native
    
    /**
      * Removes a listener previously registered with addStateListener.
      * @param listener - Callback function.
      */
    def removeStateChangeListener(listener: js.Function0[Unit]): Unit = js.native
    
    /**
      * Pass message to transport for transmission. If transport fails,
      * the transaction user is notified by callback to onTransportError().
      * @returns
      * Rejects with `TransportError` if transport fails.
      */
    /* protected */ def send(message: String): js.Promise[Unit] = js.native
    
    /* protected */ def setState(state: TransactionState): Unit = js.native
    
    /** Transaction state. */
    def state: TransactionState = js.native
    
    /** Transaction transport. */
    def transport: Transport = js.native
    
    /* protected */ def typeToString(): String = js.native
  }
}
