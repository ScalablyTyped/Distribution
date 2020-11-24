package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
@js.native
trait ObjectMetricStatus extends js.Object {
  
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: String = js.native
  
  /**
    * currentValue is the current value of the metric (as a quantity).
    */
  var currentValue: String = js.native
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: String = js.native
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  var selector: LabelSelector = js.native
  
  /**
    * target is the described Kubernetes object.
    */
  var target: CrossVersionObjectReference = js.native
}
object ObjectMetricStatus {
  
  @scala.inline
  def apply(
    averageValue: String,
    currentValue: String,
    metricName: String,
    selector: LabelSelector,
    target: CrossVersionObjectReference
  ): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(averageValue = averageValue.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
  
  @scala.inline
  implicit class ObjectMetricStatusOps[Self <: ObjectMetricStatus] (val x: Self) extends AnyVal {
    
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
    def setAverageValue(value: String): Self = this.set("averageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentValue(value: String): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: LabelSelector): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: CrossVersionObjectReference): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
