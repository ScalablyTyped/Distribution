package typings.sentryInternalTracing

import typings.sentryInternalTracing.sentryInternalTracingStrings.`first-input`
import typings.sentryInternalTracing.sentryInternalTracingStrings.`largest-contentful-paint`
import typings.sentryInternalTracing.sentryInternalTracingStrings.`layout-shift`
import typings.sentryInternalTracing.sentryInternalTracingStrings.event
import typings.sentryInternalTracing.sentryInternalTracingStrings.longtask
import typings.sentryInternalTracing.sentryInternalTracingStrings.navigation
import typings.sentryInternalTracing.sentryInternalTracingStrings.paint
import typings.sentryInternalTracing.sentryInternalTracingStrings.resource
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.NavigationTimingPolyfillEntry
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.PerformancePaintTiming
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.LargestContentfulPaint
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.LayoutShift
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceEventTiming
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceNavigationTiming
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceObserverInit
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesPolyfillsMod.FirstInputPolyfillEntry
import typings.std.PerformanceEntry
import typings.std.PerformanceObserver
import typings.std.PerformanceResourceTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsLibObserveMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/web-vitals/lib/observe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observe[K /* <: navigation | resource | paint | event | `layout-shift` | `largest-contentful-paint` | `first-input` | longtask */](
    `type`: K,
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: @sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/lib/observe.PerformanceEntryMap[K] */ /* entries */ js.Any, 
      Unit
    ]
  ): js.UndefOr[PerformanceObserver] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PerformanceObserver]]
  inline def observe[K /* <: navigation | resource | paint | event | `layout-shift` | `largest-contentful-paint` | `first-input` | longtask */](
    `type`: K,
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: @sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/lib/observe.PerformanceEntryMap[K] */ /* entries */ js.Any, 
      Unit
    ],
    opts: PerformanceObserverInit
  ): js.UndefOr[PerformanceObserver] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PerformanceObserver]]
  
  type PerformanceEntryHandler = js.Function1[/* entry */ PerformanceEntry, Unit]
  
  trait PerformanceEntryMap extends StObject {
    
    var event: js.Array[PerformanceEventTiming]
    
    var `first-input`: js.Array[FirstInputPolyfillEntry | PerformanceEventTiming]
    
    var `largest-contentful-paint`: js.Array[LargestContentfulPaint]
    
    var `layout-shift`: js.Array[LayoutShift]
    
    var longtask: js.Array[PerformanceEntry]
    
    var navigation: js.Array[NavigationTimingPolyfillEntry | PerformanceNavigationTiming]
    
    var paint: js.Array[PerformancePaintTiming]
    
    var resource: js.Array[PerformanceResourceTiming]
  }
  object PerformanceEntryMap {
    
    inline def apply(
      event: js.Array[PerformanceEventTiming],
      `first-input`: js.Array[FirstInputPolyfillEntry | PerformanceEventTiming],
      `largest-contentful-paint`: js.Array[LargestContentfulPaint],
      `layout-shift`: js.Array[LayoutShift],
      longtask: js.Array[PerformanceEntry],
      navigation: js.Array[NavigationTimingPolyfillEntry | PerformanceNavigationTiming],
      paint: js.Array[PerformancePaintTiming],
      resource: js.Array[PerformanceResourceTiming]
    ): PerformanceEntryMap = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], longtask = longtask.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], paint = paint.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("first-input")(`first-input`.asInstanceOf[js.Any])
      __obj.updateDynamic("largest-contentful-paint")(`largest-contentful-paint`.asInstanceOf[js.Any])
      __obj.updateDynamic("layout-shift")(`layout-shift`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerformanceEntryMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerformanceEntryMap] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: js.Array[PerformanceEventTiming]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventVarargs(value: PerformanceEventTiming*): Self = StObject.set(x, "event", js.Array(value*))
      
      inline def `setFirst-input`(value: js.Array[FirstInputPolyfillEntry | PerformanceEventTiming]): Self = StObject.set(x, "first-input", value.asInstanceOf[js.Any])
      
      inline def `setFirst-inputVarargs`(value: (FirstInputPolyfillEntry | PerformanceEventTiming)*): Self = StObject.set(x, "first-input", js.Array(value*))
      
      inline def `setLargest-contentful-paint`(value: js.Array[LargestContentfulPaint]): Self = StObject.set(x, "largest-contentful-paint", value.asInstanceOf[js.Any])
      
      inline def `setLargest-contentful-paintVarargs`(value: LargestContentfulPaint*): Self = StObject.set(x, "largest-contentful-paint", js.Array(value*))
      
      inline def `setLayout-shift`(value: js.Array[LayoutShift]): Self = StObject.set(x, "layout-shift", value.asInstanceOf[js.Any])
      
      inline def `setLayout-shiftVarargs`(value: LayoutShift*): Self = StObject.set(x, "layout-shift", js.Array(value*))
      
      inline def setLongtask(value: js.Array[PerformanceEntry]): Self = StObject.set(x, "longtask", value.asInstanceOf[js.Any])
      
      inline def setLongtaskVarargs(value: PerformanceEntry*): Self = StObject.set(x, "longtask", js.Array(value*))
      
      inline def setNavigation(value: js.Array[NavigationTimingPolyfillEntry | PerformanceNavigationTiming]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationVarargs(value: (NavigationTimingPolyfillEntry | PerformanceNavigationTiming)*): Self = StObject.set(x, "navigation", js.Array(value*))
      
      inline def setPaint(value: js.Array[PerformancePaintTiming]): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
      
      inline def setPaintVarargs(value: PerformancePaintTiming*): Self = StObject.set(x, "paint", js.Array(value*))
      
      inline def setResource(value: js.Array[PerformanceResourceTiming]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceVarargs(value: PerformanceResourceTiming*): Self = StObject.set(x, "resource", js.Array(value*))
    }
  }
}
