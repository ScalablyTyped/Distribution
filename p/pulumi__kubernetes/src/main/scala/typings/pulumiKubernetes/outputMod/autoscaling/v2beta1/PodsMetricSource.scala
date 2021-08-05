package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
trait PodsMetricSource extends StObject {
  
  /**
    * metricName is the name of the metric in question
    */
  var metricName: String
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  var selector: LabelSelector
  
  /**
    * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var targetAverageValue: String
}
object PodsMetricSource {
  
  inline def apply(metricName: String, selector: LabelSelector, targetAverageValue: String): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricSource]
  }
  
  extension [Self <: PodsMetricSource](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTargetAverageValue(value: String): Self = StObject.set(x, "targetAverageValue", value.asInstanceOf[js.Any])
  }
}
