package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricValueStatus holds the current value for a metric
  */
trait MetricValueStatus extends StObject {
  
  /**
    * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
    */
  var averageUtilization: Double
  
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: String
  
  /**
    * value is the current value of the metric (as a quantity).
    */
  var value: String
}
object MetricValueStatus {
  
  inline def apply(averageUtilization: Double, averageValue: String, value: String): MetricValueStatus = {
    val __obj = js.Dynamic.literal(averageUtilization = averageUtilization.asInstanceOf[js.Any], averageValue = averageValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValueStatus]
  }
  
  extension [Self <: MetricValueStatus](x: Self) {
    
    inline def setAverageUtilization(value: Double): Self = StObject.set(x, "averageUtilization", value.asInstanceOf[js.Any])
    
    inline def setAverageValue(value: String): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
