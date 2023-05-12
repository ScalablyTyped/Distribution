package typings.sentryReplay.typesTypesMod

import typings.std.DOMHighResTimeStamp
import typings.std.PerformanceResourceTiming
import typings.std.PerformanceServerTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
