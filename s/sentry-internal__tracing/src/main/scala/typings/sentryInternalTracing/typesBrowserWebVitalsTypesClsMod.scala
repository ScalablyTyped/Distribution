package typings.sentryInternalTracing

import typings.sentryInternalTracing.sentryInternalTracingStrings.CLS
import typings.sentryInternalTracing.sentryInternalTracingStrings.`back-forward-cache`
import typings.sentryInternalTracing.sentryInternalTracingStrings.`back-forward`
import typings.sentryInternalTracing.sentryInternalTracingStrings.`needs-improvement`
import typings.sentryInternalTracing.sentryInternalTracingStrings.good
import typings.sentryInternalTracing.sentryInternalTracingStrings.navigate
import typings.sentryInternalTracing.sentryInternalTracingStrings.poor
import typings.sentryInternalTracing.sentryInternalTracingStrings.prerender
import typings.sentryInternalTracing.sentryInternalTracingStrings.reload
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.LoadState
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.Metric
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesBaseMod.ReportCallback
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.LayoutShift
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.LayoutShiftAttribution
import typings.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsTypesClsMod {
  
  trait CLSAttribution extends StObject {
    
    /**
      * The `LayoutShiftEntry` representing the single largest layout shift
      * contributing to the page's CLS score. (Useful when you need more than just
      * `largestShiftTarget`, `largestShiftTime`, and `largestShiftValue`).
      */
    var largestShiftEntry: js.UndefOr[LayoutShift] = js.undefined
    
    /**
      * The first element source (in document order) among the `sources` list
      * of the `largestShiftEntry` object. (Also useful when you need more than
      * just `largestShiftTarget`, `largestShiftTime`, and `largestShiftValue`).
      */
    var largestShiftSource: js.UndefOr[LayoutShiftAttribution] = js.undefined
    
    /**
      * A selector identifying the first element (in document order) that
      * shifted when the single largest layout shift contributing to the page's
      * CLS score occurred.
      */
    var largestShiftTarget: js.UndefOr[String] = js.undefined
    
    /**
      * The time when the single largest layout shift contributing to the page's
      * CLS score occurred.
      */
    var largestShiftTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
    
    /**
      * The layout shift score of the single largest layout shift contributing to
      * the page's CLS score.
      */
    var largestShiftValue: js.UndefOr[Double] = js.undefined
    
    /**
      * The loading state of the document at the time when the largest layout
      * shift contribution to the page's CLS score occurred (see `LoadState`
      * for details).
      */
    var loadState: js.UndefOr[LoadState] = js.undefined
  }
  object CLSAttribution {
    
    inline def apply(): CLSAttribution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CLSAttribution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CLSAttribution] (val x: Self) extends AnyVal {
      
      inline def setLargestShiftEntry(value: LayoutShift): Self = StObject.set(x, "largestShiftEntry", value.asInstanceOf[js.Any])
      
      inline def setLargestShiftEntryUndefined: Self = StObject.set(x, "largestShiftEntry", js.undefined)
      
      inline def setLargestShiftSource(value: LayoutShiftAttribution): Self = StObject.set(x, "largestShiftSource", value.asInstanceOf[js.Any])
      
      inline def setLargestShiftSourceUndefined: Self = StObject.set(x, "largestShiftSource", js.undefined)
      
      inline def setLargestShiftTarget(value: String): Self = StObject.set(x, "largestShiftTarget", value.asInstanceOf[js.Any])
      
      inline def setLargestShiftTargetUndefined: Self = StObject.set(x, "largestShiftTarget", js.undefined)
      
      inline def setLargestShiftTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "largestShiftTime", value.asInstanceOf[js.Any])
      
      inline def setLargestShiftTimeUndefined: Self = StObject.set(x, "largestShiftTime", js.undefined)
      
      inline def setLargestShiftValue(value: Double): Self = StObject.set(x, "largestShiftValue", value.asInstanceOf[js.Any])
      
      inline def setLargestShiftValueUndefined: Self = StObject.set(x, "largestShiftValue", js.undefined)
      
      inline def setLoadState(value: LoadState): Self = StObject.set(x, "loadState", value.asInstanceOf[js.Any])
      
      inline def setLoadStateUndefined: Self = StObject.set(x, "loadState", js.undefined)
    }
  }
  
  trait CLSMetric
    extends StObject
       with Metric {
    
    @JSName("entries")
    var entries_CLSMetric: js.Array[LayoutShift]
    
    @JSName("name")
    var name_CLSMetric: CLS
  }
  object CLSMetric {
    
    inline def apply(
      delta: Double,
      entries: js.Array[LayoutShift],
      id: String,
      navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender,
      rating: good | `needs-improvement` | poor,
      value: Double
    ): CLSMetric = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = "CLS", navigationType = navigationType.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLSMetric]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CLSMetric] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: js.Array[LayoutShift]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: LayoutShift*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setName(value: CLS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CLSMetricWithAttribution
    extends StObject
       with CLSMetric {
    
    var attribution: CLSAttribution
  }
  object CLSMetricWithAttribution {
    
    inline def apply(
      attribution: CLSAttribution,
      delta: Double,
      entries: js.Array[LayoutShift],
      id: String,
      navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender,
      rating: good | `needs-improvement` | poor,
      value: Double
    ): CLSMetricWithAttribution = {
      val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = "CLS", navigationType = navigationType.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLSMetricWithAttribution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CLSMetricWithAttribution] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: CLSAttribution): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CLSReportCallback extends ReportCallback {
    
    def apply(metric: CLSMetric): Unit = js.native
  }
  
  @js.native
  trait CLSReportCallbackWithAttribution extends CLSReportCallback {
    
    def apply(metric: CLSMetricWithAttribution): Unit = js.native
  }
}
