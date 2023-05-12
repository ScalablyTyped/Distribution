package typings.sentryInternalTracing

import org.scalablytyped.runtime.StringDictionary
import typings.sentryInternalTracing.sentryInternalTracingStrings.CLS
import typings.sentryInternalTracing.sentryInternalTracingStrings.FCP
import typings.sentryInternalTracing.sentryInternalTracingStrings.FID
import typings.sentryInternalTracing.sentryInternalTracingStrings.INP
import typings.sentryInternalTracing.sentryInternalTracingStrings.LCP
import typings.sentryInternalTracing.sentryInternalTracingStrings.TTFB
import typings.sentryInternalTracing.sentryInternalTracingStrings.`back-forward-cache`
import typings.sentryInternalTracing.sentryInternalTracingStrings.`back-forward`
import typings.sentryInternalTracing.sentryInternalTracingStrings.`needs-improvement`
import typings.sentryInternalTracing.sentryInternalTracingStrings.good
import typings.sentryInternalTracing.sentryInternalTracingStrings.navigate
import typings.sentryInternalTracing.sentryInternalTracingStrings.poor
import typings.sentryInternalTracing.sentryInternalTracingStrings.prerender
import typings.sentryInternalTracing.sentryInternalTracingStrings.reload
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.LayoutShift
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesPolyfillsMod.FirstInputPolyfillEntry
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesPolyfillsMod.NavigationTimingPolyfillEntry
import typings.std.PerformanceEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsTypesBaseMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryInternalTracing.sentryInternalTracingStrings.loading
    - typings.sentryInternalTracing.sentryInternalTracingStrings.`dom-interactive`
    - typings.sentryInternalTracing.sentryInternalTracingStrings.`dom-content-loaded`
    - typings.sentryInternalTracing.sentryInternalTracingStrings.complete
  */
  trait LoadState extends StObject
  object LoadState {
    
    inline def complete: typings.sentryInternalTracing.sentryInternalTracingStrings.complete = "complete".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.complete]
    
    inline def `dom-content-loaded`: typings.sentryInternalTracing.sentryInternalTracingStrings.`dom-content-loaded` = "dom-content-loaded".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.`dom-content-loaded`]
    
    inline def `dom-interactive`: typings.sentryInternalTracing.sentryInternalTracingStrings.`dom-interactive` = "dom-interactive".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.`dom-interactive`]
    
    inline def loading: typings.sentryInternalTracing.sentryInternalTracingStrings.loading = "loading".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.loading]
  }
  
  trait Metric extends StObject {
    
    /**
      * The delta between the current value and the last-reported value.
      * On the first report, `delta` and `value` will always be the same.
      */
    var delta: Double
    
    /**
      * Any performance entries relevant to the metric value calculation.
      * The array may also be empty if the metric value was not based on any
      * entries (e.g. a CLS value of 0 given no layout shifts).
      */
    var entries: js.Array[
        PerformanceEntry | LayoutShift | FirstInputPolyfillEntry | NavigationTimingPolyfillEntry
      ]
    
    /**
      * A unique ID representing this particular metric instance. This ID can
      * be used by an analytics tool to dedupe multiple values sent for the same
      * metric instance, or to group multiple deltas together and calculate a
      * total. It can also be used to differentiate multiple different metric
      * instances sent from the same page, which can happen if the page is
      * restored from the back/forward cache (in that case new metrics object
      * get created).
      */
    var id: String
    
    /**
      * The name of the metric (in acronym form).
      */
    var name: CLS | FCP | FID | INP | LCP | TTFB
    
    /**
      * The type of navigation
      *
      * Navigation Timing API (or `undefined` if the browser doesn't
      * support that API). For pages that are restored from the bfcache, this
      * value will be 'back-forward-cache'.
      */
    var navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender
    
    /**
      * The rating as to whether the metric value is within the "good",
      * "needs improvement", or "poor" thresholds of the metric.
      */
    var rating: good | `needs-improvement` | poor
    
    /**
      * The current value of the metric.
      */
    var value: Double
  }
  object Metric {
    
    inline def apply(
      delta: Double,
      entries: js.Array[
          PerformanceEntry | LayoutShift | FirstInputPolyfillEntry | NavigationTimingPolyfillEntry
        ],
      id: String,
      name: CLS | FCP | FID | INP | LCP | TTFB,
      navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender,
      rating: good | `needs-improvement` | poor,
      value: Double
    ): Metric = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metric]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setEntries(
        value: js.Array[
              PerformanceEntry | LayoutShift | FirstInputPolyfillEntry | NavigationTimingPolyfillEntry
            ]
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: (PerformanceEntry | LayoutShift | FirstInputPolyfillEntry | NavigationTimingPolyfillEntry)*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: CLS | FCP | FID | INP | LCP | TTFB): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNavigationType(value: navigate | reload | `back-forward` | `back-forward-cache` | prerender): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
      
      inline def setRating(value: good | `needs-improvement` | poor): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetricWithAttribution
    extends StObject
       with Metric {
    
    /**
      * An object containing potentially-helpful debugging information that
      * can be sent along with the metric value for the current page visit in
      * order to help identify issues happening to real-users in the field.
      */
    var attribution: StringDictionary[Any]
  }
  object MetricWithAttribution {
    
    inline def apply(
      attribution: StringDictionary[Any],
      delta: Double,
      entries: js.Array[
          PerformanceEntry | LayoutShift | FirstInputPolyfillEntry | NavigationTimingPolyfillEntry
        ],
      id: String,
      name: CLS | FCP | FID | INP | LCP | TTFB,
      navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender,
      rating: good | `needs-improvement` | poor,
      value: Double
    ): MetricWithAttribution = {
      val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricWithAttribution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetricWithAttribution] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: StringDictionary[Any]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    }
  }
  
  type ReportCallback = js.Function1[/* metric */ Metric, Unit]
  
  trait ReportOpts extends StObject {
    
    var durationThreshold: js.UndefOr[Double] = js.undefined
    
    var reportAllChanges: js.UndefOr[Boolean] = js.undefined
  }
  object ReportOpts {
    
    inline def apply(): ReportOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportOpts] (val x: Self) extends AnyVal {
      
      inline def setDurationThreshold(value: Double): Self = StObject.set(x, "durationThreshold", value.asInstanceOf[js.Any])
      
      inline def setDurationThresholdUndefined: Self = StObject.set(x, "durationThreshold", js.undefined)
      
      inline def setReportAllChanges(value: Boolean): Self = StObject.set(x, "reportAllChanges", value.asInstanceOf[js.Any])
      
      inline def setReportAllChangesUndefined: Self = StObject.set(x, "reportAllChanges", js.undefined)
    }
  }
  
  type StopListening = js.Function0[Unit]
}
