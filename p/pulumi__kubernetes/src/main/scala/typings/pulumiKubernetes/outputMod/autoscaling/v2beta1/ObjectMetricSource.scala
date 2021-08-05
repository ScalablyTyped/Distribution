package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSource extends StObject {
  
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: String
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: String
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  var selector: LabelSelector
  
  /**
    * target is the described Kubernetes object.
    */
  var target: CrossVersionObjectReference
  
  /**
    * targetValue is the target value of the metric (as a quantity).
    */
  var targetValue: String
}
object ObjectMetricSource {
  
  inline def apply(
    averageValue: String,
    metricName: String,
    selector: LabelSelector,
    target: CrossVersionObjectReference,
    targetValue: String
  ): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(averageValue = averageValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
  
  extension [Self <: ObjectMetricSource](x: Self) {
    
    inline def setAverageValue(value: String): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: CrossVersionObjectReference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetValue(value: String): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
  }
}
