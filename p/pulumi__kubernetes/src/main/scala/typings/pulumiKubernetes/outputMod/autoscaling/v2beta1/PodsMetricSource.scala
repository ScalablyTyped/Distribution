package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
@js.native
trait PodsMetricSource extends js.Object {
  /**
    * metricName is the name of the metric in question
    */
  var metricName: String = js.native
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  var selector: LabelSelector = js.native
  /**
    * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var targetAverageValue: String = js.native
}

object PodsMetricSource {
  @scala.inline
  def apply(metricName: String, selector: LabelSelector, targetAverageValue: String): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricSource]
  }
  @scala.inline
  implicit class PodsMetricSourceOps[Self <: PodsMetricSource] (val x: Self) extends AnyVal {
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
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: LabelSelector): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetAverageValue(value: String): Self = this.set("targetAverageValue", value.asInstanceOf[js.Any])
  }
  
}

