package typings.sentryInternalTracing

import typings.sentryInternalTracing.anon.PartialBrowserTracingOpti
import typings.sentryInternalTracing.anon.PartialenableLongTaskbool
import typings.sentryInternalTracing.anon.PartialreportAllChangesbo
import typings.sentryInternalTracing.typesBrowserRequestMod.RequestInstrumentationOptions
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserBrowsertracingMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/browsertracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry-internal/tracing/types/browser/browsertracing", "BROWSER_TRACING_INTEGRATION_ID")
  @js.native
  val BROWSER_TRACING_INTEGRATION_ID: /* "BrowserTracing" */ String = js.native
  
  @JSImport("@sentry-internal/tracing/types/browser/browsertracing", "BrowserTracing")
  @js.native
  open class BrowserTracing ()
    extends StObject
       with Integration {
    def this(_options: PartialBrowserTracingOpti) = this()
    
    /* private */ var _collectWebVitals: Any = js.native
    
    /** Create routing idle transaction. */
    /* private */ var _createRouteTransaction: Any = js.native
    
    /* private */ var _getCurrentHub: Any = js.native
    
    /* private */ var _latestRouteName: Any = js.native
    
    /* private */ var _latestRouteSource: Any = js.native
    
    /** Start listener for interaction transactions */
    /* private */ var _registerInteractionListener: Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /** Browser Tracing integration options */
    var options: BrowserTracingOptions = js.native
    
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  
  inline def getMetaContent(metaName: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetaContent")(metaName.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @js.native
  trait BrowserTracingOptions
    extends StObject
       with RequestInstrumentationOptions {
    
    /**
      * _experiments allows the user to send options to define how this integration works.
      * Note that the `enableLongTask` options is deprecated in favor of the option at the top level, and will be removed in v8.
      *
      * TODO (v8): Remove enableLongTask
      *
      * Default: undefined
      */
    var _experiments: PartialenableLongTaskbool = js.native
    
    /**
      * _metricOptions allows the user to send options to change how metrics are collected.
      *
      * _metricOptions is currently experimental.
      *
      * Default: undefined
      */
    var _metricOptions: js.UndefOr[PartialreportAllChangesbo] = js.native
    
    /**
      * beforeNavigate is called before a pageload/navigation transaction is created and allows users to modify transaction
      * context data, or drop the transaction entirely (by setting `sampled = false` in the context).
      *
      * Note: For legacy reasons, transactions can also be dropped by returning `undefined`.
      *
      * @param context: The context data which will be passed to `startTransaction` by default
      *
      * @returns A (potentially) modified context object, with `sampled = false` if the transaction should be dropped.
      */
    var beforeNavigate: js.UndefOr[
        js.ThisFunction1[/* this */ Unit, /* context */ TransactionContext, js.UndefOr[TransactionContext]]
      ] = js.native
    
    /**
      * If true, Sentry will capture long tasks and add them to the corresponding transaction.
      *
      * Default: true
      */
    var enableLongTask: Boolean = js.native
    
    /**
      * The max duration for a transaction. If a transaction duration hits the `finalTimeout` value, it
      * will be finished.
      * Time is in ms.
      *
      * Default: 30000
      */
    var finalTimeout: Double = js.native
    
    /**
      * The heartbeat interval. If no new spans are started or open spans are finished within 3 heartbeats,
      * the transaction will be finished.
      * Time is in ms.
      *
      * Default: 5000
      */
    var heartbeatInterval: Double = js.native
    
    /**
      * The time to wait in ms until the transaction will be finished during an idle state. An idle state is defined
      * by a moment where there are no in-progress spans.
      *
      * The transaction will use the end timestamp of the last finished span as the endtime for the transaction.
      * If there are still active spans when this the `idleTimeout` is set, the `idleTimeout` will get reset.
      * Time is in ms.
      *
      * Default: 1000
      */
    var idleTimeout: Double = js.native
    
    /**
      * Flag Transactions where tabs moved to background with "cancelled". Browser background tab timing is
      * not suited towards doing precise measurements of operations. By default, we recommend that this option
      * be enabled as background transactions can mess up your statistics in nondeterministic ways.
      *
      * Default: true
      */
    var markBackgroundTransactions: Boolean = js.native
    
    /**
      * Instrumentation that creates routing change transactions. By default creates
      * pageload and navigation transactions.
      */
    def routingInstrumentation[T /* <: Transaction */](customStartTransaction: js.Function1[/* context */ TransactionContext, js.UndefOr[T]]): Unit = js.native
    def routingInstrumentation[T /* <: Transaction */](
      customStartTransaction: js.Function1[/* context */ TransactionContext, js.UndefOr[T]],
      startTransactionOnPageLoad: Boolean
    ): Unit = js.native
    def routingInstrumentation[T /* <: Transaction */](
      customStartTransaction: js.Function1[/* context */ TransactionContext, js.UndefOr[T]],
      startTransactionOnPageLoad: Boolean,
      startTransactionOnLocationChange: Boolean
    ): Unit = js.native
    def routingInstrumentation[T /* <: Transaction */](
      customStartTransaction: js.Function1[/* context */ TransactionContext, js.UndefOr[T]],
      startTransactionOnPageLoad: Unit,
      startTransactionOnLocationChange: Boolean
    ): Unit = js.native
    
    /**
      * Flag to enable/disable creation of `navigation` transaction on history changes.
      *
      * Default: true
      */
    var startTransactionOnLocationChange: Boolean = js.native
    
    /**
      * Flag to enable/disable creation of `pageload` transaction on first pageload.
      *
      * Default: true
      */
    var startTransactionOnPageLoad: Boolean = js.native
  }
}
