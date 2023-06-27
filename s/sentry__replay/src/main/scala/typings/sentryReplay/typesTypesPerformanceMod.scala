package typings.sentryReplay

import typings.sentryReplay.anon.JsHeapSizeLimit
import typings.sentryReplay.typesTypesRequestMod.ReplayNetworkRequestOrResponse
import typings.std.DOMHighResTimeStamp
import typings.std.PerformanceEntry
import typings.std.PerformanceResourceTiming
import typings.std.PerformanceServerTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesPerformanceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryReplay.typesTypesPerformanceMod.AllPerformanceEntryData
    - typings.sentryReplay.typesTypesPerformanceMod.MemoryData
    - typings.sentryReplay.typesTypesPerformanceMod.NetworkRequestData
    - typings.sentryReplay.typesTypesPerformanceMod.HistoryData
  */
  type AllEntryData = _AllEntryData | PaintData
  
  type AllPerformanceEntry = PerformancePaintTiming | PerformanceResourceTiming | PerformanceNavigationTiming
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryReplay.typesTypesPerformanceMod.PaintData
    - typings.sentryReplay.typesTypesPerformanceMod.NavigationData
    - typings.sentryReplay.typesTypesPerformanceMod.ResourceData
    - typings.sentryReplay.typesTypesPerformanceMod.LargestContentfulPaintData
  */
  type AllPerformanceEntryData = _AllPerformanceEntryData | PaintData
  
  trait ExperimentalPerformanceResourceTiming
    extends StObject
       with PerformanceResourceTiming {
    
    var responseStatus: js.UndefOr[Double] = js.undefined
  }
  object ExperimentalPerformanceResourceTiming {
    
    inline def apply(
      connectEnd: DOMHighResTimeStamp,
      connectStart: DOMHighResTimeStamp,
      decodedBodySize: Double,
      domainLookupEnd: DOMHighResTimeStamp,
      domainLookupStart: DOMHighResTimeStamp,
      duration: DOMHighResTimeStamp,
      encodedBodySize: Double,
      entryType: String,
      fetchStart: DOMHighResTimeStamp,
      initiatorType: String,
      name: String,
      nextHopProtocol: String,
      redirectEnd: DOMHighResTimeStamp,
      redirectStart: DOMHighResTimeStamp,
      requestStart: DOMHighResTimeStamp,
      responseEnd: DOMHighResTimeStamp,
      responseStart: DOMHighResTimeStamp,
      secureConnectionStart: DOMHighResTimeStamp,
      serverTiming: js.Array[PerformanceServerTiming],
      startTime: DOMHighResTimeStamp,
      toJSON: () => Any,
      transferSize: Double,
      workerStart: DOMHighResTimeStamp
    ): ExperimentalPerformanceResourceTiming = {
      val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], serverTiming = serverTiming.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentalPerformanceResourceTiming]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExperimentalPerformanceResourceTiming] (val x: Self) extends AnyVal {
      
      inline def setResponseStatus(value: Double): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
      
      inline def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    }
  }
  
  trait HistoryData
    extends StObject
       with _AllEntryData {
    
    var previous: String
  }
  object HistoryData {
    
    inline def apply(previous: String): HistoryData = {
      val __obj = js.Dynamic.literal(previous = previous.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HistoryData] (val x: Self) extends AnyVal {
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    }
  }
  
  trait LargestContentfulPaintData
    extends StObject
       with _AllPerformanceEntryData {
    
    /**
      * The recording id of the LCP node. -1 if not found
      */
    var nodeId: js.UndefOr[Double] = js.undefined
    
    var size: Double
    
    /**
      * Render time (in ms) of the LCP
      */
    var value: Double
  }
  object LargestContentfulPaintData {
    
    inline def apply(size: Double, value: Double): LargestContentfulPaintData = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LargestContentfulPaintData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LargestContentfulPaintData] (val x: Self) extends AnyVal {
      
      inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemoryData
    extends StObject
       with _AllEntryData {
    
    var memory: JsHeapSizeLimit
  }
  object MemoryData {
    
    inline def apply(memory: JsHeapSizeLimit): MemoryData = {
      val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryData] (val x: Self) extends AnyVal {
      
      inline def setMemory(value: JsHeapSizeLimit): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Pick<@sentry/replay.@sentry/replay/types/types/performance.PerformanceNavigationTiming, 'decodedBodySize' | 'encodedBodySize' | 'duration' | 'domInteractive' | 'domContentLoadedEventEnd' | 'domContentLoadedEventStart' | 'loadEventStart' | 'loadEventEnd' | 'domComplete' | 'redirectCount'>> & {  size :number | undefined} */
  trait NavigationData
    extends StObject
       with _AllPerformanceEntryData {
    
    var decodedBodySize: js.UndefOr[Double] = js.undefined
    
    var domComplete: js.UndefOr[Double] = js.undefined
    
    var domContentLoadedEventEnd: js.UndefOr[Double] = js.undefined
    
    var domContentLoadedEventStart: js.UndefOr[Double] = js.undefined
    
    var domInteractive: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[DOMHighResTimeStamp] = js.undefined
    
    var encodedBodySize: js.UndefOr[Double] = js.undefined
    
    var loadEventEnd: js.UndefOr[Double] = js.undefined
    
    var loadEventStart: js.UndefOr[Double] = js.undefined
    
    var redirectCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Transfer size of resource
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object NavigationData {
    
    inline def apply(): NavigationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationData] (val x: Self) extends AnyVal {
      
      inline def setDecodedBodySize(value: Double): Self = StObject.set(x, "decodedBodySize", value.asInstanceOf[js.Any])
      
      inline def setDecodedBodySizeUndefined: Self = StObject.set(x, "decodedBodySize", js.undefined)
      
      inline def setDomComplete(value: Double): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
      
      inline def setDomCompleteUndefined: Self = StObject.set(x, "domComplete", js.undefined)
      
      inline def setDomContentLoadedEventEnd(value: Double): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
      
      inline def setDomContentLoadedEventEndUndefined: Self = StObject.set(x, "domContentLoadedEventEnd", js.undefined)
      
      inline def setDomContentLoadedEventStart(value: Double): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
      
      inline def setDomContentLoadedEventStartUndefined: Self = StObject.set(x, "domContentLoadedEventStart", js.undefined)
      
      inline def setDomInteractive(value: Double): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
      
      inline def setDomInteractiveUndefined: Self = StObject.set(x, "domInteractive", js.undefined)
      
      inline def setDuration(value: DOMHighResTimeStamp): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEncodedBodySize(value: Double): Self = StObject.set(x, "encodedBodySize", value.asInstanceOf[js.Any])
      
      inline def setEncodedBodySizeUndefined: Self = StObject.set(x, "encodedBodySize", js.undefined)
      
      inline def setLoadEventEnd(value: Double): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
      
      inline def setLoadEventEndUndefined: Self = StObject.set(x, "loadEventEnd", js.undefined)
      
      inline def setLoadEventStart(value: Double): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
      
      inline def setLoadEventStartUndefined: Self = StObject.set(x, "loadEventStart", js.undefined)
      
      inline def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
      
      inline def setRedirectCountUndefined: Self = StObject.set(x, "redirectCount", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait NetworkRequestData
    extends StObject
       with _AllEntryData {
    
    var method: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[ReplayNetworkRequestOrResponse] = js.undefined
    
    var requestBodySize: js.UndefOr[Double] = js.undefined
    
    var response: js.UndefOr[ReplayNetworkRequestOrResponse] = js.undefined
    
    var responseBodySize: js.UndefOr[Double] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object NetworkRequestData {
    
    inline def apply(): NetworkRequestData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkRequestData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkRequestData] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRequest(value: ReplayNetworkRequestOrResponse): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestBodySize(value: Double): Self = StObject.set(x, "requestBodySize", value.asInstanceOf[js.Any])
      
      inline def setRequestBodySizeUndefined: Self = StObject.set(x, "requestBodySize", js.undefined)
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResponse(value: ReplayNetworkRequestOrResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseBodySize(value: Double): Self = StObject.set(x, "responseBodySize", value.asInstanceOf[js.Any])
      
      inline def setResponseBodySizeUndefined: Self = StObject.set(x, "responseBodySize", js.undefined)
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type PaintData = Unit
  
  trait PerformanceNavigationTiming
    extends StObject
       with PerformanceResourceTiming {
    
    /**
      * A DOMHighResTimeStamp representing the time immediately before the user agent
      * sets the document's readyState to "complete".
      */
    var domComplete: Double
    
    /**
      * A DOMHighResTimeStamp representing the time immediately after the current
      * document's DOMContentLoaded event handler completes.
      */
    var domContentLoadedEventEnd: Double
    
    /**
      * A DOMHighResTimeStamp representing the time immediately before the current
      * document's DOMContentLoaded event handler starts.
      */
    var domContentLoadedEventStart: Double
    
    /**
      * A DOMHighResTimeStamp representing the time immediately before the user agent
      * sets the document's readyState to "interactive".
      */
    var domInteractive: Double
    
    /**
      * A DOMHighResTimeStamp representing the time immediately after the current
      * document's load event handler completes.
      */
    var loadEventEnd: Double
    
    /**
      * A DOMHighResTimeStamp representing the time immediately before the current
      * document's load event handler starts.
      */
    var loadEventStart: Double
    
    /**
      * A number representing the number of redirects since the last non-redirect
      * navigation in the current browsing context.
      */
    var redirectCount: Double
    
    var `type`: String
  }
  object PerformanceNavigationTiming {
    
    inline def apply(
      connectEnd: DOMHighResTimeStamp,
      connectStart: DOMHighResTimeStamp,
      decodedBodySize: Double,
      domComplete: Double,
      domContentLoadedEventEnd: Double,
      domContentLoadedEventStart: Double,
      domInteractive: Double,
      domainLookupEnd: DOMHighResTimeStamp,
      domainLookupStart: DOMHighResTimeStamp,
      duration: DOMHighResTimeStamp,
      encodedBodySize: Double,
      entryType: String,
      fetchStart: DOMHighResTimeStamp,
      initiatorType: String,
      loadEventEnd: Double,
      loadEventStart: Double,
      name: String,
      nextHopProtocol: String,
      redirectCount: Double,
      redirectEnd: DOMHighResTimeStamp,
      redirectStart: DOMHighResTimeStamp,
      requestStart: DOMHighResTimeStamp,
      responseEnd: DOMHighResTimeStamp,
      responseStart: DOMHighResTimeStamp,
      secureConnectionStart: DOMHighResTimeStamp,
      serverTiming: js.Array[PerformanceServerTiming],
      startTime: DOMHighResTimeStamp,
      toJSON: () => Any,
      transferSize: Double,
      `type`: String,
      workerStart: DOMHighResTimeStamp
    ): PerformanceNavigationTiming = {
      val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectCount = redirectCount.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], serverTiming = serverTiming.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerformanceNavigationTiming]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerformanceNavigationTiming] (val x: Self) extends AnyVal {
      
      inline def setDomComplete(value: Double): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
      
      inline def setDomContentLoadedEventEnd(value: Double): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
      
      inline def setDomContentLoadedEventStart(value: Double): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
      
      inline def setDomInteractive(value: Double): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
      
      inline def setLoadEventEnd(value: Double): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
      
      inline def setLoadEventStart(value: Double): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
      
      inline def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PerformancePaintTiming = PerformanceEntry
  
  trait ReplayPerformanceEntry[T] extends StObject {
    
    /**
      * Additional unstructured data to be included
      */
    var data: T
    
    /**
      * The end timestamp in seconds
      */
    var end: Double
    
    /**
      * A more specific description of the performance entry
      */
    var name: String
    
    /**
      * The start timestamp in seconds
      */
    var start: Double
    
    /**
      * One of these types https://developer.mozilla.org/en-US/docs/Web/API/PerformanceEntry/entryType
      */
    var `type`: String
  }
  object ReplayPerformanceEntry {
    
    inline def apply[T](data: T, end: Double, name: String, start: Double, `type`: String): ReplayPerformanceEntry[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplayPerformanceEntry[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplayPerformanceEntry[?], T] (val x: Self & ReplayPerformanceEntry[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.PerformanceResourceTiming, 'decodedBodySize' | 'encodedBodySize'> & {  size :number,   statusCode :number | undefined} */
  trait ResourceData
    extends StObject
       with _AllPerformanceEntryData {
    
    var decodedBodySize: Double
    
    var encodedBodySize: Double
    
    /**
      * Transfer size of resource
      */
    var size: Double
    
    /**
      * HTTP status code. Note this is experimental and not available on all browsers.
      */
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object ResourceData {
    
    inline def apply(decodedBodySize: Double, encodedBodySize: Double, size: Double): ResourceData = {
      val __obj = js.Dynamic.literal(decodedBodySize = decodedBodySize.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceData] (val x: Self) extends AnyVal {
      
      inline def setDecodedBodySize(value: Double): Self = StObject.set(x, "decodedBodySize", value.asInstanceOf[js.Any])
      
      inline def setEncodedBodySize(value: Double): Self = StObject.set(x, "encodedBodySize", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait _AllEntryData extends StObject
  
  trait _AllPerformanceEntryData
    extends StObject
       with _AllEntryData
  object _AllPerformanceEntryData {
    
    inline def LargestContentfulPaintData(size: Double, value: Double): typings.sentryReplay.typesTypesPerformanceMod.LargestContentfulPaintData = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sentryReplay.typesTypesPerformanceMod.LargestContentfulPaintData]
    }
    
    inline def NavigationData(): typings.sentryReplay.typesTypesPerformanceMod.NavigationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.sentryReplay.typesTypesPerformanceMod.NavigationData]
    }
    
    inline def ResourceData(decodedBodySize: Double, encodedBodySize: Double, size: Double): typings.sentryReplay.typesTypesPerformanceMod.ResourceData = {
      val __obj = js.Dynamic.literal(decodedBodySize = decodedBodySize.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sentryReplay.typesTypesPerformanceMod.ResourceData]
    }
  }
}
