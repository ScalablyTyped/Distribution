package typings.sentryInternalTracing

import typings.sentryInternalTracing.sentryInternalTracingStrings.LCP
import typings.sentryInternalTracing.sentryInternalTracingStrings.`back-forward-cache`
import typings.sentryInternalTracing.sentryInternalTracingStrings.`back-forward`
import typings.sentryInternalTracing.sentryInternalTracingStrings.`needs-improvement`
import typings.sentryInternalTracing.sentryInternalTracingStrings.good
import typings.sentryInternalTracing.sentryInternalTracingStrings.navigate
import typings.sentryInternalTracing.sentryInternalTracingStrings.poor
import typings.sentryInternalTracing.sentryInternalTracingStrings.prerender
import typings.sentryInternalTracing.sentryInternalTracingStrings.reload
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.Metric
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.ReportCallback
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.LargestContentfulPaint
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceNavigationTiming
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesPolyfillsMod.NavigationTimingPolyfillEntry
import typings.std.PerformanceResourceTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsTypesLcpMod {
  
  trait LCPAttribution extends StObject {
    
    /**
      * The element corresponding to the largest contentful paint for the page.
      */
    var element: js.UndefOr[String] = js.undefined
    
    /**
      * The delta between when the LCP resource finishes loading until the LCP
      * element is fully rendered. See [Optimize
      * LCP](https://web.dev/optimize-lcp/) for details.
      */
    var elementRenderDelay: Double
    
    /**
      * The `LargestContentfulPaint` entry corresponding to LCP.
      */
    var lcpEntry: js.UndefOr[LargestContentfulPaint] = js.undefined
    
    /**
      * The `resource` entry for the LCP resource (if applicable), which is useful
      * for diagnosing resource load issues.
      */
    var lcpResourceEntry: js.UndefOr[PerformanceResourceTiming] = js.undefined
    
    /**
      * The `navigation` entry of the current page, which is useful for diagnosing
      * general page load issues.
      */
    var navigationEntry: js.UndefOr[PerformanceNavigationTiming | NavigationTimingPolyfillEntry] = js.undefined
    
    /**
      * The delta between TTFB and when the browser starts loading the LCP
      * resource (if there is one, otherwise 0). See [Optimize
      * LCP](https://web.dev/optimize-lcp/) for details.
      */
    var resourceLoadDelay: Double
    
    /**
      * The total time it takes to load the LCP resource itself (if there is one,
      * otherwise 0). See [Optimize LCP](https://web.dev/optimize-lcp/) for
      * details.
      */
    var resourceLoadTime: Double
    
    /**
      * The time from when the user initiates loading the page until when the
      * browser receives the first byte of the response (a.k.a. TTFB). See
      * [Optimize LCP](https://web.dev/optimize-lcp/) for details.
      */
    var timeToFirstByte: Double
    
    /**
      * The URL (if applicable) of the LCP image resource. If the LCP element
      * is a text node, this value will not be set.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object LCPAttribution {
    
    inline def apply(
      elementRenderDelay: Double,
      resourceLoadDelay: Double,
      resourceLoadTime: Double,
      timeToFirstByte: Double
    ): LCPAttribution = {
      val __obj = js.Dynamic.literal(elementRenderDelay = elementRenderDelay.asInstanceOf[js.Any], resourceLoadDelay = resourceLoadDelay.asInstanceOf[js.Any], resourceLoadTime = resourceLoadTime.asInstanceOf[js.Any], timeToFirstByte = timeToFirstByte.asInstanceOf[js.Any])
      __obj.asInstanceOf[LCPAttribution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LCPAttribution] (val x: Self) extends AnyVal {
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementRenderDelay(value: Double): Self = StObject.set(x, "elementRenderDelay", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setLcpEntry(value: LargestContentfulPaint): Self = StObject.set(x, "lcpEntry", value.asInstanceOf[js.Any])
      
      inline def setLcpEntryUndefined: Self = StObject.set(x, "lcpEntry", js.undefined)
      
      inline def setLcpResourceEntry(value: PerformanceResourceTiming): Self = StObject.set(x, "lcpResourceEntry", value.asInstanceOf[js.Any])
      
      inline def setLcpResourceEntryUndefined: Self = StObject.set(x, "lcpResourceEntry", js.undefined)
      
      inline def setNavigationEntry(value: PerformanceNavigationTiming | NavigationTimingPolyfillEntry): Self = StObject.set(x, "navigationEntry", value.asInstanceOf[js.Any])
      
      inline def setNavigationEntryUndefined: Self = StObject.set(x, "navigationEntry", js.undefined)
      
      inline def setResourceLoadDelay(value: Double): Self = StObject.set(x, "resourceLoadDelay", value.asInstanceOf[js.Any])
      
      inline def setResourceLoadTime(value: Double): Self = StObject.set(x, "resourceLoadTime", value.asInstanceOf[js.Any])
      
      inline def setTimeToFirstByte(value: Double): Self = StObject.set(x, "timeToFirstByte", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait LCPMetric
    extends StObject
       with Metric {
    
    @JSName("entries")
    var entries_LCPMetric: js.Array[LargestContentfulPaint]
    
    @JSName("name")
    var name_LCPMetric: LCP
  }
  object LCPMetric {
    
    inline def apply(
      delta: Double,
      entries: js.Array[LargestContentfulPaint],
      id: String,
      navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender,
      rating: good | `needs-improvement` | poor,
      value: Double
    ): LCPMetric = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = "LCP", navigationType = navigationType.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LCPMetric]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LCPMetric] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: js.Array[LargestContentfulPaint]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: LargestContentfulPaint*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setName(value: LCP): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait LCPMetricWithAttribution
    extends StObject
       with LCPMetric {
    
    var attribution: LCPAttribution
  }
  object LCPMetricWithAttribution {
    
    inline def apply(
      attribution: LCPAttribution,
      delta: Double,
      entries: js.Array[LargestContentfulPaint],
      id: String,
      navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender,
      rating: good | `needs-improvement` | poor,
      value: Double
    ): LCPMetricWithAttribution = {
      val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = "LCP", navigationType = navigationType.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LCPMetricWithAttribution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LCPMetricWithAttribution] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: LCPAttribution): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LCPReportCallback extends ReportCallback {
    
    def apply(metric: LCPMetric): Unit = js.native
  }
  
  @js.native
  trait LCPReportCallbackWithAttribution extends LCPReportCallback {
    
    def apply(metric: LCPMetricWithAttribution): Unit = js.native
  }
}
