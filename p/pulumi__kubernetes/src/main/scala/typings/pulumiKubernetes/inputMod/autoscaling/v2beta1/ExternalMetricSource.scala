package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one "target" type should be set.
  */
@js.native
trait ExternalMetricSource extends StObject {
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String] = js.native
  
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: js.UndefOr[Input[LabelSelector]] = js.native
  
  /**
    * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
    */
  var targetAverageValue: js.UndefOr[Input[String]] = js.native
  
  /**
    * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
    */
  var targetValue: js.UndefOr[Input[String]] = js.native
}
object ExternalMetricSource {
  
  @scala.inline
  def apply(metricName: Input[String]): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSource]
  }
  
  @scala.inline
  implicit class ExternalMetricSourceMutableBuilder[Self <: ExternalMetricSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricSelector(value: Input[LabelSelector]): Self = StObject.set(x, "metricSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricSelectorUndefined: Self = StObject.set(x, "metricSelector", js.undefined)
    
    @scala.inline
    def setTargetAverageValue(value: Input[String]): Self = StObject.set(x, "targetAverageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAverageValueUndefined: Self = StObject.set(x, "targetAverageValue", js.undefined)
    
    @scala.inline
    def setTargetValue(value: Input[String]): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueUndefined: Self = StObject.set(x, "targetValue", js.undefined)
  }
}
