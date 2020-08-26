package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
  */
@js.native
trait PodsMetricStatus extends js.Object {
  /**
    * currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var currentAverageValue: String = js.native
  /**
    * metricName is the name of the metric in question
    */
  var metricName: String = js.native
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  var selector: LabelSelector = js.native
}

object PodsMetricStatus {
  @scala.inline
  def apply(currentAverageValue: String, metricName: String, selector: LabelSelector): PodsMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricStatus]
  }
  @scala.inline
  implicit class PodsMetricStatusOps[Self <: PodsMetricStatus] (val x: Self) extends AnyVal {
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
    def setCurrentAverageValue(value: String): Self = this.set("currentAverageValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: LabelSelector): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
  
}

