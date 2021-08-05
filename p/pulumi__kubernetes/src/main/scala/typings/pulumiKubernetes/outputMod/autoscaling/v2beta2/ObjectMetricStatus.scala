package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricStatus extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: MetricValueStatus
  
  var describedObject: CrossVersionObjectReference
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifier
}
object ObjectMetricStatus {
  
  inline def apply(current: MetricValueStatus, describedObject: CrossVersionObjectReference, metric: MetricIdentifier): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
  
  extension [Self <: ObjectMetricStatus](x: Self) {
    
    inline def setCurrent(value: MetricValueStatus): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDescribedObject(value: CrossVersionObjectReference): Self = StObject.set(x, "describedObject", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: MetricIdentifier): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
