package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
  */
@js.native
trait ExternalMetricStatus extends js.Object {
  
  /**
    * currentAverageValue is the current value of metric averaged over autoscaled pods.
    */
  var currentAverageValue: js.UndefOr[Input[String]] = js.native
  
  /**
    * currentValue is the current value of the metric (as a quantity)
    */
  var currentValue: Input[String] = js.native
  
  /**
    * metricName is the name of a metric used for autoscaling in metric system.
    */
  var metricName: Input[String] = js.native
  
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: js.UndefOr[Input[LabelSelector]] = js.native
}
object ExternalMetricStatus {
  
  @scala.inline
  def apply(currentValue: Input[String], metricName: Input[String]): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatus]
  }
  
  @scala.inline
  implicit class ExternalMetricStatusOps[Self <: ExternalMetricStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentValue(value: Input[String]): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentAverageValue(value: Input[String]): Self = this.set("currentAverageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentAverageValue: Self = this.set("currentAverageValue", js.undefined)
    
    @scala.inline
    def setMetricSelector(value: Input[LabelSelector]): Self = this.set("metricSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricSelector: Self = this.set("metricSelector", js.undefined)
  }
}
