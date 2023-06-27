package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A legacy interface kept for backwards compatibility and contains properties that offer performance timing information for various events which occur during the loading and use of the current page. You get a PerformanceTiming object describing your page using the window.performance.timing property.
  * @deprecated This interface is deprecated in the Navigation Timing Level 2 specification. Please use the PerformanceNavigationTiming interface instead.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming)
  */
trait PerformanceTiming extends StObject {
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/connectEnd)
    */
  /* standard dom */
  val connectEnd: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/connectStart)
    */
  /* standard dom */
  val connectStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domComplete)
    */
  /* standard dom */
  val domComplete: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domContentLoadedEventEnd)
    */
  /* standard dom */
  val domContentLoadedEventEnd: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domContentLoadedEventStart)
    */
  /* standard dom */
  val domContentLoadedEventStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domInteractive)
    */
  /* standard dom */
  val domInteractive: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domLoading)
    */
  /* standard dom */
  val domLoading: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domainLookupEnd)
    */
  /* standard dom */
  val domainLookupEnd: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domainLookupStart)
    */
  /* standard dom */
  val domainLookupStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/fetchStart)
    */
  /* standard dom */
  val fetchStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/loadEventEnd)
    */
  /* standard dom */
  val loadEventEnd: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/loadEventStart)
    */
  /* standard dom */
  val loadEventStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/navigationStart)
    */
  /* standard dom */
  val navigationStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/redirectEnd)
    */
  /* standard dom */
  val redirectEnd: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/redirectStart)
    */
  /* standard dom */
  val redirectStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/requestStart)
    */
  /* standard dom */
  val requestStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/responseEnd)
    */
  /* standard dom */
  val responseEnd: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/responseStart)
    */
  /* standard dom */
  val responseStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/secureConnectionStart)
    */
  /* standard dom */
  val secureConnectionStart: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/toJSON)
    */
  /* standard dom */
  def toJSON(): Any
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/unloadEventEnd)
    */
  /* standard dom */
  val unloadEventEnd: Double
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/unloadEventStart)
    */
  /* standard dom */
  val unloadEventStart: Double
}
object PerformanceTiming {
  
  inline def apply(
    connectEnd: Double,
    connectStart: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domLoading: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    fetchStart: Double,
    loadEventEnd: Double,
    loadEventStart: Double,
    navigationStart: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    toJSON: () => Any,
    unloadEventEnd: Double,
    unloadEventStart: Double
  ): PerformanceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceTiming] (val x: Self) extends AnyVal {
    
    inline def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    inline def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    inline def setDomComplete(value: Double): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
    
    inline def setDomContentLoadedEventEnd(value: Double): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    
    inline def setDomContentLoadedEventStart(value: Double): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
    
    inline def setDomInteractive(value: Double): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
    
    inline def setDomLoading(value: Double): Self = StObject.set(x, "domLoading", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    inline def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    inline def setLoadEventEnd(value: Double): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
    
    inline def setLoadEventStart(value: Double): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
    
    inline def setNavigationStart(value: Double): Self = StObject.set(x, "navigationStart", value.asInstanceOf[js.Any])
    
    inline def setRedirectEnd(value: Double): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
    
    inline def setRedirectStart(value: Double): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
    
    inline def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    inline def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    inline def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    inline def setSecureConnectionStart(value: Double): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setUnloadEventEnd(value: Double): Self = StObject.set(x, "unloadEventEnd", value.asInstanceOf[js.Any])
    
    inline def setUnloadEventStart(value: Double): Self = StObject.set(x, "unloadEventStart", value.asInstanceOf[js.Any])
  }
}
