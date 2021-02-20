package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeeDistribution extends StObject {
  
  var max: String = js.native
  
  var min: String = js.native
  
  var mode: String = js.native
  
  var p10: String = js.native
  
  var p20: String = js.native
  
  var p30: String = js.native
  
  var p40: String = js.native
  
  var p50: String = js.native
  
  var p60: String = js.native
  
  var p70: String = js.native
  
  var p80: String = js.native
  
  var p90: String = js.native
  
  var p95: String = js.native
  
  var p99: String = js.native
}
object FeeDistribution {
  
  @scala.inline
  def apply(
    max: String,
    min: String,
    mode: String,
    p10: String,
    p20: String,
    p30: String,
    p40: String,
    p50: String,
    p60: String,
    p70: String,
    p80: String,
    p90: String,
    p95: String,
    p99: String
  ): FeeDistribution = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], p10 = p10.asInstanceOf[js.Any], p20 = p20.asInstanceOf[js.Any], p30 = p30.asInstanceOf[js.Any], p40 = p40.asInstanceOf[js.Any], p50 = p50.asInstanceOf[js.Any], p60 = p60.asInstanceOf[js.Any], p70 = p70.asInstanceOf[js.Any], p80 = p80.asInstanceOf[js.Any], p90 = p90.asInstanceOf[js.Any], p95 = p95.asInstanceOf[js.Any], p99 = p99.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeDistribution]
  }
  
  @scala.inline
  implicit class FeeDistributionMutableBuilder[Self <: FeeDistribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP10(value: String): Self = StObject.set(x, "p10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP20(value: String): Self = StObject.set(x, "p20", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP30(value: String): Self = StObject.set(x, "p30", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP40(value: String): Self = StObject.set(x, "p40", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP50(value: String): Self = StObject.set(x, "p50", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP60(value: String): Self = StObject.set(x, "p60", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP70(value: String): Self = StObject.set(x, "p70", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP80(value: String): Self = StObject.set(x, "p80", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP90(value: String): Self = StObject.set(x, "p90", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP95(value: String): Self = StObject.set(x, "p95", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP99(value: String): Self = StObject.set(x, "p99", value.asInstanceOf[js.Any])
  }
}
