package typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod

import typings.sentryInternalTracing.sentryInternalTracingStrings.navigation
import typings.sentryInternalTracing.sentryInternalTracingStrings.paint
import typings.sentryInternalTracing.sentryInternalTracingStrings.resource
import typings.std.DOMHighResTimeStamp
import typings.std.DOMRectReadOnly
import typings.std.Element
import typings.std.Node
import typings.std.PerformanceEntry
import typings.std.PerformanceResourceTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait Document extends StObject {
    
    var prerendering: js.UndefOr[Boolean] = js.undefined
  }
  object Document {
    
    inline def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      inline def setPrerendering(value: Boolean): Self = StObject.set(x, "prerendering", value.asInstanceOf[js.Any])
      
      inline def setPrerenderingUndefined: Self = StObject.set(x, "prerendering", js.undefined)
    }
  }
  
  trait LargestContentfulPaint
    extends StObject
       with PerformanceEntry {
    
    var element: js.UndefOr[Element] = js.undefined
    
    var id: String
    
    var loadTime: DOMHighResTimeStamp
    
    var renderTime: DOMHighResTimeStamp
    
    var size: Double
    
    var url: String
  }
  object LargestContentfulPaint {
    
    inline def apply(
      duration: DOMHighResTimeStamp,
      entryType: String,
      id: String,
      loadTime: DOMHighResTimeStamp,
      name: String,
      renderTime: DOMHighResTimeStamp,
      size: Double,
      startTime: DOMHighResTimeStamp,
      toJSON: () => Any,
      url: String
    ): LargestContentfulPaint = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadTime = loadTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderTime = renderTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LargestContentfulPaint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LargestContentfulPaint] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLoadTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "loadTime", value.asInstanceOf[js.Any])
      
      inline def setRenderTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "renderTime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutShift
    extends StObject
       with PerformanceEntry {
    
    var hadRecentInput: Boolean
    
    var sources: js.Array[LayoutShiftAttribution]
    
    var value: Double
  }
  object LayoutShift {
    
    inline def apply(
      duration: DOMHighResTimeStamp,
      entryType: String,
      hadRecentInput: Boolean,
      name: String,
      sources: js.Array[LayoutShiftAttribution],
      startTime: DOMHighResTimeStamp,
      toJSON: () => Any,
      value: Double
    ): LayoutShift = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], hadRecentInput = hadRecentInput.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutShift]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutShift] (val x: Self) extends AnyVal {
      
      inline def setHadRecentInput(value: Boolean): Self = StObject.set(x, "hadRecentInput", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[LayoutShiftAttribution]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: LayoutShiftAttribution*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutShiftAttribution extends StObject {
    
    var currentRect: DOMRectReadOnly
    
    var node: js.UndefOr[Node] = js.undefined
    
    var previousRect: DOMRectReadOnly
  }
  object LayoutShiftAttribution {
    
    inline def apply(currentRect: DOMRectReadOnly, previousRect: DOMRectReadOnly): LayoutShiftAttribution = {
      val __obj = js.Dynamic.literal(currentRect = currentRect.asInstanceOf[js.Any], previousRect = previousRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutShiftAttribution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutShiftAttribution] (val x: Self) extends AnyVal {
      
      inline def setCurrentRect(value: DOMRectReadOnly): Self = StObject.set(x, "currentRect", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPreviousRect(value: DOMRectReadOnly): Self = StObject.set(x, "previousRect", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Performance extends StObject {
    
    @JSName("getEntriesByType")
    def getEntriesByType_navigation(`type`: navigation): js.Array[PerformanceNavigationTiming] = js.native
    @JSName("getEntriesByType")
    def getEntriesByType_paint(`type`: paint): js.Array[PerformancePaintTiming] = js.native
    @JSName("getEntriesByType")
    def getEntriesByType_resource(`type`: resource): js.Array[PerformanceResourceTiming] = js.native
  }
  
  trait PerformanceEventTiming
    extends StObject
       with PerformanceEntry {
    
    var interactionId: js.UndefOr[Double] = js.undefined
    
    val target: Node | Null
  }
  object PerformanceEventTiming {
    
    inline def apply(
      duration: DOMHighResTimeStamp,
      entryType: String,
      name: String,
      startTime: DOMHighResTimeStamp,
      toJSON: () => Any
    ): typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceEventTiming = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), target = null)
      __obj.asInstanceOf[typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceEventTiming]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod.global.PerformanceEventTiming] (val x: Self) extends AnyVal {
      
      inline def setInteractionId(value: Double): Self = StObject.set(x, "interactionId", value.asInstanceOf[js.Any])
      
      inline def setInteractionIdUndefined: Self = StObject.set(x, "interactionId", js.undefined)
      
      inline def setTarget(value: Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
    }
  }
  
  trait PerformanceNavigationTiming extends StObject {
    
    var activationStart: js.UndefOr[Double] = js.undefined
  }
  object PerformanceNavigationTiming {
    
    inline def apply(): PerformanceNavigationTiming = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerformanceNavigationTiming]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerformanceNavigationTiming] (val x: Self) extends AnyVal {
      
      inline def setActivationStart(value: Double): Self = StObject.set(x, "activationStart", value.asInstanceOf[js.Any])
      
      inline def setActivationStartUndefined: Self = StObject.set(x, "activationStart", js.undefined)
    }
  }
  
  trait PerformanceObserverInit extends StObject {
    
    var durationThreshold: js.UndefOr[Double] = js.undefined
  }
  object PerformanceObserverInit {
    
    inline def apply(): PerformanceObserverInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerformanceObserverInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerformanceObserverInit] (val x: Self) extends AnyVal {
      
      inline def setDurationThreshold(value: Double): Self = StObject.set(x, "durationThreshold", value.asInstanceOf[js.Any])
      
      inline def setDurationThresholdUndefined: Self = StObject.set(x, "durationThreshold", js.undefined)
    }
  }
  
  trait Window extends StObject {
    
    var __WEB_VITALS_POLYFILL__ : Boolean
    
    var webVitals: WebVitalsGlobal
  }
  object Window {
    
    inline def apply(__WEB_VITALS_POLYFILL__ : Boolean, webVitals: WebVitalsGlobal): Window = {
      val __obj = js.Dynamic.literal(__WEB_VITALS_POLYFILL__ = __WEB_VITALS_POLYFILL__.asInstanceOf[js.Any], webVitals = webVitals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      inline def setWebVitals(value: WebVitalsGlobal): Self = StObject.set(x, "webVitals", value.asInstanceOf[js.Any])
      
      inline def set__WEB_VITALS_POLYFILL__(value: Boolean): Self = StObject.set(x, "__WEB_VITALS_POLYFILL__", value.asInstanceOf[js.Any])
    }
  }
}
