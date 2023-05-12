package typings.sentryInternalTracing

import typings.sentryInternalTracing.anon.Dictkey
import typings.sentryInternalTracing.anon.GetRequestHeader
import typings.sentryInternalTracing.anon.Headers
import typings.sentryInternalTracing.anon.Method
import typings.sentryInternalTracing.anon.PartialDynamicSamplingCon
import typings.sentryInternalTracing.anon.PartialRequestInstrumenta
import typings.sentryTypes.typesSpanMod.Span
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserRequestMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry-internal/tracing/types/browser/request", "DEFAULT_TRACE_PROPAGATION_TARGETS")
  @js.native
  val DEFAULT_TRACE_PROPAGATION_TARGETS: js.Array[String | js.RegExp] = js.native
  
  inline def addTracingHeadersToFetchRequest(
    request: String,
    // unknown is actually type Request but we can't export DOM types from this package,
  dynamicSamplingContext: PartialDynamicSamplingCon,
    span: Span,
    options: Headers
  ): PolymorphicRequestHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("addTracingHeadersToFetchRequest")(request.asInstanceOf[js.Any], dynamicSamplingContext.asInstanceOf[js.Any], span.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PolymorphicRequestHeaders]
  inline def addTracingHeadersToFetchRequest(
    request: Any,
    // unknown is actually type Request but we can't export DOM types from this package,
  dynamicSamplingContext: PartialDynamicSamplingCon,
    span: Span,
    options: Headers
  ): PolymorphicRequestHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("addTracingHeadersToFetchRequest")(request.asInstanceOf[js.Any], dynamicSamplingContext.asInstanceOf[js.Any], span.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PolymorphicRequestHeaders]
  
  @JSImport("@sentry-internal/tracing/types/browser/request", "defaultRequestInstrumentationOptions")
  @js.native
  val defaultRequestInstrumentationOptions: RequestInstrumentationOptions = js.native
  
  inline def fetchCallback(
    handlerData: FetchData,
    shouldCreateSpan: js.Function1[/* url */ String, Boolean],
    shouldAttachHeaders: js.Function1[/* url */ String, Boolean],
    spans: Record[String, Span]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchCallback")(handlerData.asInstanceOf[js.Any], shouldCreateSpan.asInstanceOf[js.Any], shouldAttachHeaders.asInstanceOf[js.Any], spans.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def instrumentOutgoingRequests(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("instrumentOutgoingRequests")().asInstanceOf[Unit]
  inline def instrumentOutgoingRequests(_options: PartialRequestInstrumenta): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("instrumentOutgoingRequests")(_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shouldAttachHeaders(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldAttachHeaders")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldAttachHeaders(url: String, tracePropagationTargets: js.Array[String | js.RegExp]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldAttachHeaders")(url.asInstanceOf[js.Any], tracePropagationTargets.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def xhrCallback(
    handlerData: XHRData,
    shouldCreateSpan: js.Function1[/* url */ String, Boolean],
    shouldAttachHeaders: js.Function1[/* url */ String, Boolean],
    spans: Record[String, Span]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrCallback")(handlerData.asInstanceOf[js.Any], shouldCreateSpan.asInstanceOf[js.Any], shouldAttachHeaders.asInstanceOf[js.Any], spans.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FetchData extends StObject {
    
    var args: js.Array[Any]
    
    var endTimestamp: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var fetchData: js.UndefOr[Method] = js.undefined
    
    var response: js.UndefOr[Any] = js.undefined
    
    var startTimestamp: Double
  }
  object FetchData {
    
    inline def apply(args: js.Array[Any], startTimestamp: Double): FetchData = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchData] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFetchData(value: Method): Self = StObject.set(x, "fetchData", value.asInstanceOf[js.Any])
      
      inline def setFetchDataUndefined: Self = StObject.set(x, "fetchData", js.undefined)
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type PolymorphicRequestHeaders = (Record[String, js.UndefOr[String]]) | (js.Array[js.Tuple2[String, String]]) | Dictkey
  
  trait RequestInstrumentationOptions extends StObject {
    
    /**
      * This function will be called before creating a span for a request with the given url.
      * Return false if you don't want a span for the given url.
      *
      * Default: (url: string) => true
      */
    var shouldCreateSpanForRequest: js.UndefOr[js.ThisFunction1[/* this */ Unit, /* url */ String, Boolean]] = js.undefined
    
    /**
      * Flag to disable patching all together for fetch requests.
      *
      * Default: true
      */
    var traceFetch: Boolean
    
    /**
      * List of strings and/or regexes used to determine which outgoing requests will have `sentry-trace` and `baggage`
      * headers attached.
      *
      * Default: ['localhost', /^\//] {@see DEFAULT_TRACE_PROPAGATION_TARGETS}
      */
    var tracePropagationTargets: js.Array[String | js.RegExp]
    
    /**
      * Flag to disable patching all together for xhr requests.
      *
      * Default: true
      */
    var traceXHR: Boolean
    
    /**
      * @deprecated Will be removed in v8.
      * Use `shouldCreateSpanForRequest` to control span creation and `tracePropagationTargets` to control
      * trace header attachment.
      */
    var tracingOrigins: js.Array[String | js.RegExp]
  }
  object RequestInstrumentationOptions {
    
    inline def apply(
      traceFetch: Boolean,
      tracePropagationTargets: js.Array[String | js.RegExp],
      traceXHR: Boolean,
      tracingOrigins: js.Array[String | js.RegExp]
    ): RequestInstrumentationOptions = {
      val __obj = js.Dynamic.literal(traceFetch = traceFetch.asInstanceOf[js.Any], tracePropagationTargets = tracePropagationTargets.asInstanceOf[js.Any], traceXHR = traceXHR.asInstanceOf[js.Any], tracingOrigins = tracingOrigins.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInstrumentationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInstrumentationOptions] (val x: Self) extends AnyVal {
      
      inline def setShouldCreateSpanForRequest(value: js.ThisFunction1[/* this */ Unit, /* url */ String, Boolean]): Self = StObject.set(x, "shouldCreateSpanForRequest", value.asInstanceOf[js.Any])
      
      inline def setShouldCreateSpanForRequestUndefined: Self = StObject.set(x, "shouldCreateSpanForRequest", js.undefined)
      
      inline def setTraceFetch(value: Boolean): Self = StObject.set(x, "traceFetch", value.asInstanceOf[js.Any])
      
      inline def setTracePropagationTargets(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "tracePropagationTargets", value.asInstanceOf[js.Any])
      
      inline def setTracePropagationTargetsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "tracePropagationTargets", js.Array(value*))
      
      inline def setTraceXHR(value: Boolean): Self = StObject.set(x, "traceXHR", value.asInstanceOf[js.Any])
      
      inline def setTracingOrigins(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "tracingOrigins", value.asInstanceOf[js.Any])
      
      inline def setTracingOriginsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "tracingOrigins", js.Array(value*))
    }
  }
  
  trait XHRData extends StObject {
    
    var endTimestamp: js.UndefOr[Double] = js.undefined
    
    var startTimestamp: Double
    
    var xhr: js.UndefOr[GetRequestHeader] = js.undefined
  }
  object XHRData {
    
    inline def apply(startTimestamp: Double): XHRData = {
      val __obj = js.Dynamic.literal(startTimestamp = startTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[XHRData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XHRData] (val x: Self) extends AnyVal {
      
      inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: GetRequestHeader): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
}
