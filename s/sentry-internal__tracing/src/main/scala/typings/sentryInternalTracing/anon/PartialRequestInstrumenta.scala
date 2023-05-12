package typings.sentryInternalTracing.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry-internal/tracing.@sentry-internal/tracing/types/browser/request.RequestInstrumentationOptions> */
trait PartialRequestInstrumenta extends StObject {
  
  var shouldCreateSpanForRequest: js.UndefOr[js.ThisFunction1[/* this */ Unit, /* url */ String, Boolean]] = js.undefined
  
  var traceFetch: js.UndefOr[Boolean] = js.undefined
  
  var tracePropagationTargets: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var traceXHR: js.UndefOr[Boolean] = js.undefined
  
  var tracingOrigins: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
}
object PartialRequestInstrumenta {
  
  inline def apply(): PartialRequestInstrumenta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequestInstrumenta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRequestInstrumenta] (val x: Self) extends AnyVal {
    
    inline def setShouldCreateSpanForRequest(value: js.ThisFunction1[/* this */ Unit, /* url */ String, Boolean]): Self = StObject.set(x, "shouldCreateSpanForRequest", value.asInstanceOf[js.Any])
    
    inline def setShouldCreateSpanForRequestUndefined: Self = StObject.set(x, "shouldCreateSpanForRequest", js.undefined)
    
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
  }
}
