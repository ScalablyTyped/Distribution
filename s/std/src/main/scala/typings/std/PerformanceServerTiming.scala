package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming) */
trait PerformanceServerTiming extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/description) */
  /* standard dom */
  val description: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/duration) */
  /* standard dom */
  val duration: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/name) */
  /* standard dom */
  val name: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/toJSON) */
  /* standard dom */
  def toJSON(): Any
}
object PerformanceServerTiming {
  
  inline def apply(
    description: java.lang.String,
    duration: DOMHighResTimeStamp,
    name: java.lang.String,
    toJSON: () => Any
  ): PerformanceServerTiming = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PerformanceServerTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceServerTiming] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: DOMHighResTimeStamp): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
