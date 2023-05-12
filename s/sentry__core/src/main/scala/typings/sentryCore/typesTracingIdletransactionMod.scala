package typings.sentryCore

import typings.sentryCore.anon.RestartOnChildSpanChange
import typings.sentryCore.typesHubMod.Hub
import typings.sentryCore.typesTracingSpanMod.SpanRecorder
import typings.sentryCore.typesTracingTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionContext
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingIdletransactionMod {
  
  @JSImport("@sentry/core/types/tracing/idletransaction", "IdleTransaction")
  @js.native
  open class IdleTransaction protected () extends Transaction {
    def this(transactionContext: TransactionContext, _idleHub: Hub) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    
    /**
      * Checks when entries of this.activities are not changing for 3 beats.
      * If this occurs we finish the transaction.
      */
    /* private */ var _beat: Any = js.native
    
    /* private */ val _beforeFinishCallbacks: Any = js.native
    
    /**
      * The final value in ms that a transaction cannot exceed
      */
    /* private */ val _finalTimeout: Any = js.native
    
    /* private */ var _finishReason: Any = js.native
    
    /* private */ var _finished: Any = js.native
    
    /* private */ var _heartbeatCounter: Any = js.native
    
    /* private */ val _heartbeatInterval: Any = js.native
    
    /* private */ val _idleHub: Any = js.native
    
    /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    /* private */ val _idleTimeout: Any = js.native
    
    /* private */ var _idleTimeoutCanceledPermanently: Any = js.native
    
    /**
      * Timer that tracks Transaction idleTimeout
      */
    /* private */ var _idleTimeoutID: Any = js.native
    
    /* private */ val _onScope: Any = js.native
    
    /**
      * Pings the heartbeat
      */
    /* private */ var _pingHeartbeat: Any = js.native
    
    /**
      * Remove an activity from usage
      * @param spanId The span id that represents the activity
      */
    /* private */ var _popActivity: Any = js.native
    
    /* private */ var _prevHeartbeatString: Any = js.native
    
    /**
      * Start tracking a specific activity.
      * @param spanId The span id that represents the activity
      */
    /* private */ var _pushActivity: Any = js.native
    
    /**
      * Restarts idle timeout, if there is no running idle timeout it will start one.
      */
    /* private */ var _restartIdleTimeout: Any = js.native
    
    var activities: Record[String, Boolean] = js.native
    
    /**
      * Cancels the existing idle timeout, if there is one.
      * @param restartOnChildSpanChange Default is `true`.
      *                                 If set to false the transaction will end
      *                                 with the last child span.
      */
    def cancelIdleTimeout(): Unit = js.native
    def cancelIdleTimeout(endTimestamp: Unit, param1: RestartOnChildSpanChange): Unit = js.native
    @JSName("cancelIdleTimeout")
    def cancelIdleTimeout_0(
      endTimestamp: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@sentry/core.anon.FnCallEndTimestamp>[0] */ js.Any
    ): Unit = js.native
    @JSName("cancelIdleTimeout")
    def cancelIdleTimeout_0(
      endTimestamp: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@sentry/core.anon.FnCallEndTimestamp>[0] */ js.Any,
      param1: RestartOnChildSpanChange
    ): Unit = js.native
    
    /**
      * Register a callback function that gets excecuted before the transaction finishes.
      * Useful for cleanup or if you want to add any additional spans based on current context.
      *
      * This is exposed because users have no other way of running something before an idle transaction
      * finishes.
      */
    def registerBeforeFinishCallback(callback: BeforeFinishCallback): Unit = js.native
    
    /**
      * Temporary method used to externally set the transaction's `finishReason`
      *
      * ** WARNING**
      * This is for the purpose of experimentation only and will be removed in the near future, do not use!
      *
      * @internal
      *
      */
    def setFinishReason(reason: String): Unit = js.native
  }
  
  @JSImport("@sentry/core/types/tracing/idletransaction", "IdleTransactionSpanRecorder")
  @js.native
  open class IdleTransactionSpanRecorder protected () extends SpanRecorder {
    def this(
      _pushActivity: js.Function1[/* id */ String, Unit],
      _popActivity: js.Function1[/* id */ String, Unit],
      transactionSpanId: String
    ) = this()
    def this(
      _pushActivity: js.Function1[/* id */ String, Unit],
      _popActivity: js.Function1[/* id */ String, Unit],
      transactionSpanId: String,
      maxlen: Double
    ) = this()
    
    /* private */ val _popActivity: Any = js.native
    
    /* private */ val _pushActivity: Any = js.native
    
    var transactionSpanId: String = js.native
  }
  
  object TRACING_DEFAULTS {
    
    @JSImport("@sentry/core/types/tracing/idletransaction", "TRACING_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@sentry/core/types/tracing/idletransaction", "TRACING_DEFAULTS.finalTimeout")
    @js.native
    def finalTimeout: Double = js.native
    inline def finalTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finalTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/core/types/tracing/idletransaction", "TRACING_DEFAULTS.heartbeatInterval")
    @js.native
    def heartbeatInterval: Double = js.native
    inline def heartbeatInterval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/core/types/tracing/idletransaction", "TRACING_DEFAULTS.idleTimeout")
    @js.native
    def idleTimeout: Double = js.native
    inline def idleTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(x.asInstanceOf[js.Any])
  }
  
  type BeforeFinishCallback = js.Function2[/* transactionSpan */ IdleTransaction, /* endTimestamp */ Double, Unit]
}
