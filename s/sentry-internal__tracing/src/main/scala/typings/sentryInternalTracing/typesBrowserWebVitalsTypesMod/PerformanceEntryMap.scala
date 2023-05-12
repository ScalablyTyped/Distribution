package typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod

import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceNavigationTiming
import typings.std.PerformanceResourceTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEntryMap extends StObject {
  
  var navigation: PerformanceNavigationTiming
  
  var paint: PerformancePaintTiming
  
  var resource: PerformanceResourceTiming
}
object PerformanceEntryMap {
  
  inline def apply(
    navigation: PerformanceNavigationTiming,
    paint: PerformancePaintTiming,
    resource: PerformanceResourceTiming
  ): PerformanceEntryMap = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], paint = paint.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEntryMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceEntryMap] (val x: Self) extends AnyVal {
    
    inline def setNavigation(value: PerformanceNavigationTiming): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setPaint(value: PerformancePaintTiming): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setResource(value: PerformanceResourceTiming): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
