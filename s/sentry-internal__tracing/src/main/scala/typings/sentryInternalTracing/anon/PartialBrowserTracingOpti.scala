package typings.sentryInternalTracing.anon

import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry-internal/tracing.@sentry-internal/tracing/types/browser/browsertracing.BrowserTracingOptions> */
trait PartialBrowserTracingOpti extends StObject {
  
  var _experiments: js.UndefOr[PartialenableLongTaskbool] = js.undefined
  
  var _metricOptions: js.UndefOr[PartialreportAllChangesbo] = js.undefined
  
  var beforeNavigate: js.UndefOr[
    js.ThisFunction1[/* this */ Unit, /* context */ TransactionContext, js.UndefOr[TransactionContext]]
  ] = js.undefined
  
  var enableLongTask: js.UndefOr[Boolean] = js.undefined
  
  var finalTimeout: js.UndefOr[Double] = js.undefined
  
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  
  var idleTimeout: js.UndefOr[Double] = js.undefined
  
  var markBackgroundTransactions: js.UndefOr[Boolean] = js.undefined
  
  var routingInstrumentation: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* customStartTransaction */ js.Function1[/* context */ TransactionContext, js.UndefOr[Transaction]], 
      /* startTransactionOnPageLoad */ js.UndefOr[Boolean], 
      /* startTransactionOnLocationChange */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  
  var shouldCreateSpanForRequest: js.UndefOr[js.ThisFunction1[/* this */ Unit, /* url */ String, Boolean]] = js.undefined
  
  var startTransactionOnLocationChange: js.UndefOr[Boolean] = js.undefined
  
  var startTransactionOnPageLoad: js.UndefOr[Boolean] = js.undefined
  
  var traceFetch: js.UndefOr[Boolean] = js.undefined
  
  var tracePropagationTargets: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var traceXHR: js.UndefOr[Boolean] = js.undefined
  
  var tracingOrigins: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
}
object PartialBrowserTracingOpti {
  
  inline def apply(): PartialBrowserTracingOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBrowserTracingOpti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBrowserTracingOpti] (val x: Self) extends AnyVal {
    
    inline def setBeforeNavigate(
      value: js.ThisFunction1[/* this */ Unit, /* context */ TransactionContext, js.UndefOr[TransactionContext]]
    ): Self = StObject.set(x, "beforeNavigate", value.asInstanceOf[js.Any])
    
    inline def setBeforeNavigateUndefined: Self = StObject.set(x, "beforeNavigate", js.undefined)
    
    inline def setEnableLongTask(value: Boolean): Self = StObject.set(x, "enableLongTask", value.asInstanceOf[js.Any])
    
    inline def setEnableLongTaskUndefined: Self = StObject.set(x, "enableLongTask", js.undefined)
    
    inline def setFinalTimeout(value: Double): Self = StObject.set(x, "finalTimeout", value.asInstanceOf[js.Any])
    
    inline def setFinalTimeoutUndefined: Self = StObject.set(x, "finalTimeout", js.undefined)
    
    inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
    
    inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setMarkBackgroundTransactions(value: Boolean): Self = StObject.set(x, "markBackgroundTransactions", value.asInstanceOf[js.Any])
    
    inline def setMarkBackgroundTransactionsUndefined: Self = StObject.set(x, "markBackgroundTransactions", js.undefined)
    
    inline def setRoutingInstrumentation(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* customStartTransaction */ js.Function1[/* context */ TransactionContext, js.UndefOr[Transaction]], 
          /* startTransactionOnPageLoad */ js.UndefOr[Boolean], 
          /* startTransactionOnLocationChange */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Self = StObject.set(x, "routingInstrumentation", value.asInstanceOf[js.Any])
    
    inline def setRoutingInstrumentationUndefined: Self = StObject.set(x, "routingInstrumentation", js.undefined)
    
    inline def setShouldCreateSpanForRequest(value: js.ThisFunction1[/* this */ Unit, /* url */ String, Boolean]): Self = StObject.set(x, "shouldCreateSpanForRequest", value.asInstanceOf[js.Any])
    
    inline def setShouldCreateSpanForRequestUndefined: Self = StObject.set(x, "shouldCreateSpanForRequest", js.undefined)
    
    inline def setStartTransactionOnLocationChange(value: Boolean): Self = StObject.set(x, "startTransactionOnLocationChange", value.asInstanceOf[js.Any])
    
    inline def setStartTransactionOnLocationChangeUndefined: Self = StObject.set(x, "startTransactionOnLocationChange", js.undefined)
    
    inline def setStartTransactionOnPageLoad(value: Boolean): Self = StObject.set(x, "startTransactionOnPageLoad", value.asInstanceOf[js.Any])
    
    inline def setStartTransactionOnPageLoadUndefined: Self = StObject.set(x, "startTransactionOnPageLoad", js.undefined)
    
    inline def setTraceFetch(value: Boolean): Self = StObject.set(x, "traceFetch", value.asInstanceOf[js.Any])
    
    inline def setTraceFetchUndefined: Self = StObject.set(x, "traceFetch", js.undefined)
    
    inline def setTracePropagationTargets(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "tracePropagationTargets", value.asInstanceOf[js.Any])
    
    inline def setTracePropagationTargetsUndefined: Self = StObject.set(x, "tracePropagationTargets", js.undefined)
    
    inline def setTracePropagationTargetsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "tracePropagationTargets", js.Array(value*))
    
    inline def setTraceXHR(value: Boolean): Self = StObject.set(x, "traceXHR", value.asInstanceOf[js.Any])
    
    inline def setTraceXHRUndefined: Self = StObject.set(x, "traceXHR", js.undefined)
    
    inline def setTracingOrigins(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "tracingOrigins", value.asInstanceOf[js.Any])
    
    inline def setTracingOriginsUndefined: Self = StObject.set(x, "tracingOrigins", js.undefined)
    
    inline def setTracingOriginsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "tracingOrigins", js.Array(value*))
    
    inline def set_experiments(value: PartialenableLongTaskbool): Self = StObject.set(x, "_experiments", value.asInstanceOf[js.Any])
    
    inline def set_experimentsUndefined: Self = StObject.set(x, "_experiments", js.undefined)
    
    inline def set_metricOptions(value: PartialreportAllChangesbo): Self = StObject.set(x, "_metricOptions", value.asInstanceOf[js.Any])
    
    inline def set_metricOptionsUndefined: Self = StObject.set(x, "_metricOptions", js.undefined)
  }
}
