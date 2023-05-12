package typings.sentryInternalTracing

import typings.std.DOMHighResTimeStamp
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserWebVitalsTypesPolyfillsMod {
  
  type FirstInputPolyfillCallback = js.Function1[/* entry */ FirstInputPolyfillEntry, Unit]
  
  /* Inlined std.Omit<@sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/types.<global>.PerformanceEventTiming, 'processingEnd'> */
  trait FirstInputPolyfillEntry extends StObject {
    
    var duration: DOMHighResTimeStamp
    
    var entryType: String
    
    var interactionId: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var startTime: DOMHighResTimeStamp
    
    var target: js.UndefOr[Node | Null] = js.undefined
    
    def toJSON(): Any
    @JSName("toJSON")
    var toJSON_Original: js.Function0[Any]
  }
  object FirstInputPolyfillEntry {
    
    inline def apply(
      duration: DOMHighResTimeStamp,
      entryType: String,
      name: String,
      startTime: DOMHighResTimeStamp,
      toJSON: () => Any
    ): FirstInputPolyfillEntry = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[FirstInputPolyfillEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirstInputPolyfillEntry] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: DOMHighResTimeStamp): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEntryType(value: String): Self = StObject.set(x, "entryType", value.asInstanceOf[js.Any])
      
      inline def setInteractionId(value: Double): Self = StObject.set(x, "interactionId", value.asInstanceOf[js.Any])
      
      inline def setInteractionIdUndefined: Self = StObject.set(x, "interactionId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Omit<@sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/types.<global>.PerformanceNavigationTiming, 'initiatorType' | 'nextHopProtocol' | 'redirectCount' | 'transferSize' | 'encodedBodySize' | 'decodedBodySize' | 'type'> & {  type :@sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/types.<global>.PerformanceNavigationTiming['type']} */
  trait NavigationTimingPolyfillEntry extends StObject {
    
    var activationStart: js.UndefOr[Double] = js.undefined
    
    var `type`: /* import warning: importer.ImportType#apply Failed type conversion: @sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/types.<global>.PerformanceNavigationTiming['type'] */ js.Any
  }
  object NavigationTimingPolyfillEntry {
    
    inline def apply(
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: @sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/types.<global>.PerformanceNavigationTiming['type'] */ js.Any
    ): NavigationTimingPolyfillEntry = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationTimingPolyfillEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationTimingPolyfillEntry] (val x: Self) extends AnyVal {
      
      inline def setActivationStart(value: Double): Self = StObject.set(x, "activationStart", value.asInstanceOf[js.Any])
      
      inline def setActivationStartUndefined: Self = StObject.set(x, "activationStart", js.undefined)
      
      inline def setType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/types.<global>.PerformanceNavigationTiming['type'] */ js.Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
