package typings.signalfx.mod

import typings.signalfx.anon.Rate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  var bigNumber: js.UndefOr[Boolean] = js.undefined
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[String | Double] = js.undefined
  
  var immediate: js.UndefOr[Boolean] = js.undefined
  
  /** required for explain */
  var incidentId: js.UndefOr[String] = js.undefined
  
  var maxDelay: js.UndefOr[Double] = js.undefined
  
  /** required for execute */
  var program: js.UndefOr[String] = js.undefined
  
  var range: js.UndefOr[Double] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[String | Double] = js.undefined
  
  var stop: js.UndefOr[String | Double] = js.undefined
  
  var throttleOptions: js.UndefOr[Rate] = js.undefined
}
object RequestOptions {
  
  inline def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setBigNumber(value: Boolean): Self = StObject.set(x, "bigNumber", value.asInstanceOf[js.Any])
    
    inline def setBigNumberUndefined: Self = StObject.set(x, "bigNumber", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setEnd(value: String | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setIncidentId(value: String): Self = StObject.set(x, "incidentId", value.asInstanceOf[js.Any])
    
    inline def setIncidentIdUndefined: Self = StObject.set(x, "incidentId", js.undefined)
    
    inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
    
    inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
    
    inline def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setStart(value: String | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: String | Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setThrottleOptions(value: Rate): Self = StObject.set(x, "throttleOptions", value.asInstanceOf[js.Any])
    
    inline def setThrottleOptionsUndefined: Self = StObject.set(x, "throttleOptions", js.undefined)
  }
}
