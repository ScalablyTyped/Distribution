package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSource extends StObject {
  
  var describedObject: CrossVersionObjectReference
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifier
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTarget
}
object ObjectMetricSource {
  
  inline def apply(describedObject: CrossVersionObjectReference, metric: MetricIdentifier, target: MetricTarget): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
  
  extension [Self <: ObjectMetricSource](x: Self) {
    
    inline def setDescribedObject(value: CrossVersionObjectReference): Self = StObject.set(x, "describedObject", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: MetricIdentifier): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: MetricTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
