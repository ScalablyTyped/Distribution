package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
@js.native
trait PodsMetricSource extends js.Object {
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier] = js.native
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget] = js.native
}

object PodsMetricSource {
  @scala.inline
  def apply(metric: Input[MetricIdentifier], target: Input[MetricTarget]): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
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
    def setMetric(value: Input[MetricIdentifier]): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Input[MetricTarget]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

