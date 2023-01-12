package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTimestamp extends StObject {
  
  /* standard dom */
  var contextTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var performanceTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
}
object AudioTimestamp {
  
  inline def apply(): AudioTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioTimestamp] (val x: Self) extends AnyVal {
    
    inline def setContextTime(value: Double): Self = StObject.set(x, "contextTime", value.asInstanceOf[js.Any])
    
    inline def setContextTimeUndefined: Self = StObject.set(x, "contextTime", js.undefined)
    
    inline def setPerformanceTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "performanceTime", value.asInstanceOf[js.Any])
    
    inline def setPerformanceTimeUndefined: Self = StObject.set(x, "performanceTime", js.undefined)
  }
}
