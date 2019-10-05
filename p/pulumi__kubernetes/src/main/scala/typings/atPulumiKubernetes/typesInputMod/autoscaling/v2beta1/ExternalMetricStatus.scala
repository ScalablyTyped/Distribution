package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typings.atPulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any
  * Kubernetes object.
  */
trait ExternalMetricStatus extends js.Object {
  /**
    * currentAverageValue is the current value of metric averaged over autoscaled pods.
    */
  var currentAverageValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * currentValue is the current value of the metric (as a quantity)
    */
  var currentValue: Input[String]
  /**
    * metricName is the name of a metric used for autoscaling in metric system.
    */
  var metricName: Input[String]
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
}

object ExternalMetricStatus {
  @scala.inline
  def apply(
    currentValue: Input[String],
    metricName: Input[String],
    currentAverageValue: Input[String] = null,
    metricSelector: Input[LabelSelector] = null
  ): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    if (currentAverageValue != null) __obj.updateDynamic("currentAverageValue")(currentAverageValue.asInstanceOf[js.Any])
    if (metricSelector != null) __obj.updateDynamic("metricSelector")(metricSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatus]
  }
}

