package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
  * (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus]
  var describedObject: Input[CrossVersionObjectReference]
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier]
}

object ObjectMetricStatus {
  @scala.inline
  def apply(
    current: Input[MetricValueStatus],
    describedObject: Input[CrossVersionObjectReference],
    metric: Input[MetricIdentifier]
  ): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
}

