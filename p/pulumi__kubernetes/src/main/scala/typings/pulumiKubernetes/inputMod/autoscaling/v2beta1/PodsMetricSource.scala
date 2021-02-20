package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
@js.native
trait PodsMetricSource extends StObject {
  
  /**
    * metricName is the name of the metric in question
    */
  var metricName: Input[String] = js.native
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  
  /**
    * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var targetAverageValue: Input[String] = js.native
}
object PodsMetricSource {
  
  @scala.inline
  def apply(metricName: Input[String], targetAverageValue: Input[String]): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricSource]
  }
  
  @scala.inline
  implicit class PodsMetricSourceMutableBuilder[Self <: PodsMetricSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setTargetAverageValue(value: Input[String]): Self = StObject.set(x, "targetAverageValue", value.asInstanceOf[js.Any])
  }
}
