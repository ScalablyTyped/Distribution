package typings.sentryInternalTracing

import typings.sentryInternalTracing.sentryInternalTracingStrings.FID
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
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceEventTiming
import typings.sentryInternalTracing.typesBrowserWebVitalsTypesPolyfillsMod.FirstInputPolyfillEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsTypesFidMod {
  
  trait FIDAttribution extends StObject {
    
    /**
      * The `PerformanceEventTiming` entry corresponding to FID (or the
      * polyfill entry in browsers that don't support Event Timing).
      */
    var eventEntry: PerformanceEventTiming | FirstInputPolyfillEntry
    
    /**
      * A selector identifying the element that the user interacted with. This
      * element will be the `target` of the `event` dispatched.
      */
    var eventTarget: String
    
    /**
      * The time when the user interacted. This time will match the `timeStamp`
      * value of the `event` dispatched.
      */
    var eventTime: Double
    
    /**
      * The `type` of the `event` dispatched from the user interaction.
      */
    var eventType: String
    
    /**
      * The loading state of the document at the time when the first interaction
      * occurred (see `LoadState` for details). If the first interaction occurred
      * while the document was loading and executing script (e.g. usually in the
      * `dom-interactive` phase) it can result in long input delays.
      */
    var loadState: LoadState
  }
  object FIDAttribution {
    
    inline def apply(
      eventEntry: PerformanceEventTiming | FirstInputPolyfillEntry,
      eventTarget: String,
      eventTime: Double,
      eventType: String,
      loadState: LoadState
    ): FIDAttribution = {
      val __obj = js.Dynamic.literal(eventEntry = eventEntry.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], loadState = loadState.asInstanceOf[js.Any])
      __obj.asInstanceOf[FIDAttribution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FIDAttribution] (val x: Self) extends AnyVal {
      
      inline def setEventEntry(value: PerformanceEventTiming | FirstInputPolyfillEntry): Self = StObject.set(x, "eventEntry", value.asInstanceOf[js.Any])
      
      inline def setEventTarget(value: String): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
      
      inline def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setLoadState(value: LoadState): Self = StObject.set(x, "loadState", value.asInstanceOf[js.Any])
    }
  }
  
  trait FIDMetric
    extends StObject
       with Metric {
    
    @JSName("entries")
    var entries_FIDMetric: js.Array[PerformanceEventTiming | FirstInputPolyfillEntry]
    
    @JSName("name")
    var name_FIDMetric: FID
  }
  object FIDMetric {
    
    inline def apply(
      delta: Double,
      entries: js.Array[PerformanceEventTiming | FirstInputPolyfillEntry],
      id: String,
      navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender,
      rating: good | `needs-improvement` | poor,
      value: Double
    ): FIDMetric = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = "FID", navigationType = navigationType.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FIDMetric]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FIDMetric] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: js.Array[PerformanceEventTiming | FirstInputPolyfillEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: (PerformanceEventTiming | FirstInputPolyfillEntry)*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setName(value: FID): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FIDMetricWithAttribution
    extends StObject
       with FIDMetric {
    
    var attribution: FIDAttribution
  }
  object FIDMetricWithAttribution {
    
    inline def apply(
      attribution: FIDAttribution,
      delta: Double,
      entries: js.Array[PerformanceEventTiming | FirstInputPolyfillEntry],
      id: String,
      navigationType: navigate | reload | `back-forward` | `back-forward-cache` | prerender,
      rating: good | `needs-improvement` | poor,
      value: Double
    ): FIDMetricWithAttribution = {
      val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = "FID", navigationType = navigationType.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FIDMetricWithAttribution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FIDMetricWithAttribution] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: FIDAttribution): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FIDReportCallback extends ReportCallback {
    
    def apply(metric: FIDMetric): Unit = js.native
  }
  
  @js.native
  trait FIDReportCallbackWithAttribution extends FIDReportCallback {
    
    def apply(metric: FIDMetricWithAttribution): Unit = js.native
  }
}
