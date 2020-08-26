package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
  */
@js.native
trait PodsMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus] = js.native
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier] = js.native
}

object PodsMetricStatus {
  @scala.inline
  def apply(current: Input[MetricValueStatus], metric: Input[MetricIdentifier]): PodsMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
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
    def setCurrent(value: Input[MetricValueStatus]): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetric(value: Input[MetricIdentifier]): Self = this.set("metric", value.asInstanceOf[js.Any])
  }
  
}

