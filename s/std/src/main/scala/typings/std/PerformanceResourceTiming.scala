package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script. */
trait PerformanceResourceTiming
  extends StObject
     with PerformanceEntry {
  
  val connectEnd: Double
  
  val connectStart: Double
  
  val decodedBodySize: Double
  
  val domainLookupEnd: Double
  
  val domainLookupStart: Double
  
  val encodedBodySize: Double
  
  val fetchStart: Double
  
  val initiatorType: java.lang.String
  
  val nextHopProtocol: java.lang.String
  
  val redirectEnd: Double
  
  val redirectStart: Double
  
  val requestStart: Double
  
  val responseEnd: Double
  
  val responseStart: Double
  
  val secureConnectionStart: Double
  
  val transferSize: Double
  
  val workerStart: Double
}
object PerformanceResourceTiming {
  
  inline def apply(
    connectEnd: Double,
    connectStart: Double,
    decodedBodySize: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    duration: Double,
    encodedBodySize: Double,
    entryType: java.lang.String,
    fetchStart: Double,
    initiatorType: java.lang.String,
    name: java.lang.String,
    nextHopProtocol: java.lang.String,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    startTime: Double,
    toJSON: () => js.Any,
    transferSize: Double,
    workerStart: Double
  ): PerformanceResourceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceResourceTiming]
  }
  
  extension [Self <: PerformanceResourceTiming](x: Self) {
    
    inline def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    inline def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    inline def setDecodedBodySize(value: Double): Self = StObject.set(x, "decodedBodySize", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    inline def setEncodedBodySize(value: Double): Self = StObject.set(x, "encodedBodySize", value.asInstanceOf[js.Any])
    
    inline def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    inline def setInitiatorType(value: java.lang.String): Self = StObject.set(x, "initiatorType", value.asInstanceOf[js.Any])
    
    inline def setNextHopProtocol(value: java.lang.String): Self = StObject.set(x, "nextHopProtocol", value.asInstanceOf[js.Any])
    
    inline def setRedirectEnd(value: Double): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
    
    inline def setRedirectStart(value: Double): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
    
    inline def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    inline def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    inline def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    inline def setSecureConnectionStart(value: Double): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
    
    inline def setTransferSize(value: Double): Self = StObject.set(x, "transferSize", value.asInstanceOf[js.Any])
    
    inline def setWorkerStart(value: Double): Self = StObject.set(x, "workerStart", value.asInstanceOf[js.Any])
  }
}
