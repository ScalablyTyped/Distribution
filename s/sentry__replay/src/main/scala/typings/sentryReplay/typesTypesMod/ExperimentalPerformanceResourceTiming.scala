package typings.sentryReplay.typesTypesMod

import typings.std.DOMHighResTimeStamp
import typings.std.PerformanceResourceTiming
import typings.std.PerformanceServerTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
