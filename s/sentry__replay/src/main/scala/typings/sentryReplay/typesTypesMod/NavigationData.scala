package typings.sentryReplay.typesTypesMod

import typings.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@sentry/replay.@sentry/replay/types/types.PerformanceNavigationTiming, 'decodedBodySize' | 'encodedBodySize' | 'duration' | 'domInteractive' | 'domContentLoadedEventEnd' | 'domContentLoadedEventStart' | 'loadEventStart' | 'loadEventEnd' | 'domComplete' | 'redirectCount'>> & {  size :number | undefined} */
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
