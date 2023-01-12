package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceMeasureOptions extends StObject {
  
  /* standard dom */
  var detail: js.UndefOr[Any] = js.undefined
  
  /* standard dom */
  var duration: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  /* standard dom */
  var end: js.UndefOr[java.lang.String | DOMHighResTimeStamp] = js.undefined
  
  /* standard dom */
  var start: js.UndefOr[java.lang.String | DOMHighResTimeStamp] = js.undefined
}
object PerformanceMeasureOptions {
  
  inline def apply(): PerformanceMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMeasureOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceMeasureOptions] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDuration(value: DOMHighResTimeStamp): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnd(value: java.lang.String | DOMHighResTimeStamp): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: java.lang.String | DOMHighResTimeStamp): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
