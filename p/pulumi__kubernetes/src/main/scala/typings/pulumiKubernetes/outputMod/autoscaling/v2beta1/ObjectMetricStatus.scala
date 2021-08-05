package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricStatus extends StObject {
  
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: String
  
  /**
    * currentValue is the current value of the metric (as a quantity).
    */
  var currentValue: String
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: String
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  var selector: LabelSelector
  
  /**
    * target is the described Kubernetes object.
    */
  var target: CrossVersionObjectReference
}
object ObjectMetricStatus {
  
  inline def apply(
    averageValue: String,
    currentValue: String,
    metricName: String,
    selector: LabelSelector,
    target: CrossVersionObjectReference
  ): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(averageValue = averageValue.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
  
  extension [Self <: ObjectMetricStatus](x: Self) {
    
    inline def setAverageValue(value: String): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    inline def setCurrentValue(value: String): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: CrossVersionObjectReference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
