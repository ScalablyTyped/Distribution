package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalMetric extends StObject {
  
  var dimensions: js.UndefOr[js.Object] = js.undefined
  
  var metric: String
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var value: Double
}
object SignalMetric {
  
  inline def apply(metric: String, value: Double): SignalMetric = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalMetric]
  }
  
  extension [Self <: SignalMetric](x: Self) {
    
    inline def setDimensions(value: js.Object): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
