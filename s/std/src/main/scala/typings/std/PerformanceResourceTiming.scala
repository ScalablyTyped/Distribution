package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script. */
trait PerformanceResourceTiming
  extends StObject
     with PerformanceEntry {
  
  /* standard dom */
  val connectEnd: DOMHighResTimeStamp
  
  /* standard dom */
  val connectStart: DOMHighResTimeStamp
  
  /* standard dom */
  val decodedBodySize: Double
  
  /* standard dom */
  val domainLookupEnd: DOMHighResTimeStamp
  
  /* standard dom */
  val domainLookupStart: DOMHighResTimeStamp
  
  /* standard dom */
  val encodedBodySize: Double
  
  /* standard dom */
  val fetchStart: DOMHighResTimeStamp
  
  /* standard dom */
  val initiatorType: java.lang.String
  
  /* standard dom */
  val nextHopProtocol: java.lang.String
  
  /* standard dom */
  val redirectEnd: DOMHighResTimeStamp
  
  /* standard dom */
  val redirectStart: DOMHighResTimeStamp
  
  /* standard dom */
  val requestStart: DOMHighResTimeStamp
  
  /* standard dom */
  val responseEnd: DOMHighResTimeStamp
  
  /* standard dom */
  val responseStart: DOMHighResTimeStamp
  
  /* standard dom */
  val secureConnectionStart: DOMHighResTimeStamp
  
  /* standard dom */
  val serverTiming: js.Array[PerformanceServerTiming]
  
  /* standard dom */
  val transferSize: Double
  
  /* standard dom */
  val workerStart: DOMHighResTimeStamp
}
object PerformanceResourceTiming {
  
  inline def apply(
    connectEnd: DOMHighResTimeStamp,
    connectStart: DOMHighResTimeStamp,
    decodedBodySize: Double,
    domainLookupEnd: DOMHighResTimeStamp,
    domainLookupStart: DOMHighResTimeStamp,
    duration: DOMHighResTimeStamp,
    encodedBodySize: Double,
    entryType: java.lang.String,
    fetchStart: DOMHighResTimeStamp,
    initiatorType: java.lang.String,
    name: java.lang.String,
    nextHopProtocol: java.lang.String,
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
  ): PerformanceResourceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], serverTiming = serverTiming.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceResourceTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceResourceTiming] (val x: Self) extends AnyVal {
    
    inline def setConnectEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    inline def setConnectStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    inline def setDecodedBodySize(value: Double): Self = StObject.set(x, "decodedBodySize", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    inline def setEncodedBodySize(value: Double): Self = StObject.set(x, "encodedBodySize", value.asInstanceOf[js.Any])
    
    inline def setFetchStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    inline def setInitiatorType(value: java.lang.String): Self = StObject.set(x, "initiatorType", value.asInstanceOf[js.Any])
    
    inline def setNextHopProtocol(value: java.lang.String): Self = StObject.set(x, "nextHopProtocol", value.asInstanceOf[js.Any])
    
    inline def setRedirectEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
    
    inline def setRedirectStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
    
    inline def setRequestStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    inline def setResponseEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    inline def setResponseStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    inline def setSecureConnectionStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
    
    inline def setServerTiming(value: js.Array[PerformanceServerTiming]): Self = StObject.set(x, "serverTiming", value.asInstanceOf[js.Any])
    
    inline def setServerTimingVarargs(value: PerformanceServerTiming*): Self = StObject.set(x, "serverTiming", js.Array(value*))
    
    inline def setTransferSize(value: Double): Self = StObject.set(x, "transferSize", value.asInstanceOf[js.Any])
    
    inline def setWorkerStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "workerStart", value.asInstanceOf[js.Any])
  }
}
