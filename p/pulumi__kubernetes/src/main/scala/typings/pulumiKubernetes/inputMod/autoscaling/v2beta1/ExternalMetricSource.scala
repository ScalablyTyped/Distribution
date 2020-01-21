package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes
  * object (for example length of queue in cloud messaging service, or QPS from loadbalancer
  * running outside of cluster). Exactly one "target" type should be set.
  */
trait ExternalMetricSource extends js.Object {
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String]
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually
    * exclusive with TargetValue.
    */
  var targetAverageValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * targetValue is the target value of the metric (as a quantity). Mutually exclusive with
    * TargetAverageValue.
    */
  var targetValue: js.UndefOr[Input[String]] = js.undefined
}

object ExternalMetricSource {
  @scala.inline
  def apply(
    metricName: Input[String],
    metricSelector: Input[LabelSelector] = null,
    targetAverageValue: Input[String] = null,
    targetValue: Input[String] = null
  ): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    if (metricSelector != null) __obj.updateDynamic("metricSelector")(metricSelector.asInstanceOf[js.Any])
    if (targetAverageValue != null) __obj.updateDynamic("targetAverageValue")(targetAverageValue.asInstanceOf[js.Any])
    if (targetValue != null) __obj.updateDynamic("targetValue")(targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSource]
  }
}

