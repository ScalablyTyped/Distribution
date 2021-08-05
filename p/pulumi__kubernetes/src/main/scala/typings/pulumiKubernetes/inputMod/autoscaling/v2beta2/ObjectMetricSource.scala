package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSource extends StObject {
  
  var describedObject: Input[CrossVersionObjectReference]
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier]
  
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget]
}
object ObjectMetricSource {
  
  inline def apply(
    describedObject: Input[CrossVersionObjectReference],
    metric: Input[MetricIdentifier],
    target: Input[MetricTarget]
  ): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
  
  extension [Self <: ObjectMetricSource](x: Self) {
    
    inline def setDescribedObject(value: Input[CrossVersionObjectReference]): Self = StObject.set(x, "describedObject", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: Input[MetricIdentifier]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Input[MetricTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
