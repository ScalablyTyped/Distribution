package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current
  * scale target (for example, transactions-processed-per-second).
  */
trait PodsMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus]
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier]
}

object PodsMetricStatus {
  @scala.inline
  def apply(current: Input[MetricValueStatus], metric: Input[MetricIdentifier]): PodsMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodsMetricStatus]
  }
}

