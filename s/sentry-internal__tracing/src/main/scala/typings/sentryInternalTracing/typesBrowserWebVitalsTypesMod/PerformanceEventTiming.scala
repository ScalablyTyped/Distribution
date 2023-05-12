package typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod

import typings.std.DOMHighResTimeStamp
import typings.std.Element
import typings.std.PerformanceEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEventTiming
  extends StObject
     with PerformanceEntry {
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  var processingEnd: DOMHighResTimeStamp
  
  var processingStart: DOMHighResTimeStamp
  
  var target: js.UndefOr[Element] = js.undefined
}
object PerformanceEventTiming {
  
  inline def apply(
    duration: DOMHighResTimeStamp,
    entryType: String,
    name: String,
    processingEnd: DOMHighResTimeStamp,
    processingStart: DOMHighResTimeStamp,
    startTime: DOMHighResTimeStamp,
    toJSON: () => Any
  ): PerformanceEventTiming = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processingEnd = processingEnd.asInstanceOf[js.Any], processingStart = processingStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PerformanceEventTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceEventTiming] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setProcessingEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "processingEnd", value.asInstanceOf[js.Any])
    
    inline def setProcessingStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "processingStart", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
