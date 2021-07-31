package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A legacy interface kept for backwards compatibility and contains properties that offer performance timing information for various events which occur during the loading and use of the current page. You get a PerformanceTiming object describing your page using the window.performance.timing property. */
trait PerformanceTiming extends StObject {
  
  val connectEnd: Double
  
  val connectStart: Double
  
  val domComplete: Double
  
  val domContentLoadedEventEnd: Double
  
  val domContentLoadedEventStart: Double
  
  val domInteractive: Double
  
  val domLoading: Double
  
  val domainLookupEnd: Double
  
  val domainLookupStart: Double
  
  val fetchStart: Double
  
  val loadEventEnd: Double
  
  val loadEventStart: Double
  
  val navigationStart: Double
  
  val redirectEnd: Double
  
  val redirectStart: Double
  
  val requestStart: Double
  
  val responseEnd: Double
  
  val responseStart: Double
  
  val secureConnectionStart: Double
  
  def toJSON(): js.Any
  
  val unloadEventEnd: Double
  
  val unloadEventStart: Double
}
object PerformanceTiming {
  
  @scala.inline
  def apply(
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
    toJSON: () => js.Any,
    unloadEventEnd: Double,
    unloadEventStart: Double
  ): PerformanceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceTiming]
  }
  
  @scala.inline
  implicit class PerformanceTimingMutableBuilder[Self <: PerformanceTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomComplete(value: Double): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedEventEnd(value: Double): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedEventStart(value: Double): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomInteractive(value: Double): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomLoading(value: Double): Self = StObject.set(x, "domLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventEnd(value: Double): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventStart(value: Double): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationStart(value: Double): Self = StObject.set(x, "navigationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectEnd(value: Double): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectStart(value: Double): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureConnectionStart(value: Double): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnloadEventEnd(value: Double): Self = StObject.set(x, "unloadEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnloadEventStart(value: Double): Self = StObject.set(x, "unloadEventStart", value.asInstanceOf[js.Any])
  }
}
