package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceMarkOptions extends StObject {
  
  /* standard dom */
  var detail: js.UndefOr[Any] = js.undefined
  
  /* standard dom */
  var startTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
}
object PerformanceMarkOptions {
  
  inline def apply(): PerformanceMarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMarkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceMarkOptions] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setStartTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
