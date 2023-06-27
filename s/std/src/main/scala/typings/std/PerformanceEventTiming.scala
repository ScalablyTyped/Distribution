package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming) */
trait PerformanceEventTiming
  extends StObject
     with PerformanceEntry {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/cancelable) */
  /* standard dom */
  val cancelable: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/processingEnd) */
  /* standard dom */
  val processingEnd: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/processingStart) */
  /* standard dom */
  val processingStart: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/target) */
  /* standard dom */
  val target: Node | Null
}
object PerformanceEventTiming {
  
  inline def apply(
    cancelable: scala.Boolean,
    duration: DOMHighResTimeStamp,
    entryType: java.lang.String,
    name: java.lang.String,
    processingEnd: DOMHighResTimeStamp,
    processingStart: DOMHighResTimeStamp,
    startTime: DOMHighResTimeStamp,
    toJSON: () => Any
  ): PerformanceEventTiming = {
    val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processingEnd = processingEnd.asInstanceOf[js.Any], processingStart = processingStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), target = null)
    __obj.asInstanceOf[PerformanceEventTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceEventTiming] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: scala.Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setProcessingEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "processingEnd", value.asInstanceOf[js.Any])
    
    inline def setProcessingStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "processingStart", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
