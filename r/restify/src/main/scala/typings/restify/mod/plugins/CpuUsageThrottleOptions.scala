package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuUsageThrottleOptions extends StObject {
  
  var halfLife: js.UndefOr[Double] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
}
object CpuUsageThrottleOptions {
  
  inline def apply(): CpuUsageThrottleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuUsageThrottleOptions]
  }
  
  extension [Self <: CpuUsageThrottleOptions](x: Self) {
    
    inline def setHalfLife(value: Double): Self = StObject.set(x, "halfLife", value.asInstanceOf[js.Any])
    
    inline def setHalfLifeUndefined: Self = StObject.set(x, "halfLife", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
  }
}
