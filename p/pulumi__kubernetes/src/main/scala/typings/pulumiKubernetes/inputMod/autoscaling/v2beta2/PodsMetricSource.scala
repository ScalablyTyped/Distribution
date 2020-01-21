package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale
  * target (for example, transactions-processed-per-second). The values will be averaged together
  * before being compared to the target value.
  */
trait PodsMetricSource extends js.Object {
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier]
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget]
}

object PodsMetricSource {
  @scala.inline
  def apply(metric: Input[MetricIdentifier], target: Input[MetricTarget]): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodsMetricSource]
  }
}

