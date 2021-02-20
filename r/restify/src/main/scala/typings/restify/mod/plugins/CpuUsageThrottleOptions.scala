package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuUsageThrottleOptions extends StObject {
  
  var halfLife: js.UndefOr[Double] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
}
object CpuUsageThrottleOptions {
  
  @scala.inline
  def apply(): CpuUsageThrottleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuUsageThrottleOptions]
  }
  
  @scala.inline
  implicit class CpuUsageThrottleOptionsMutableBuilder[Self <: CpuUsageThrottleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHalfLife(value: Double): Self = StObject.set(x, "halfLife", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfLifeUndefined: Self = StObject.set(x, "halfLife", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
  }
}
