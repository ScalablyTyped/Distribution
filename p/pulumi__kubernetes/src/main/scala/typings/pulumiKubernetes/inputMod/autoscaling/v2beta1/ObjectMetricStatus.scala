package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
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
    * averageValue is the current value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * currentValue is the current value of the metric (as a quantity).
    */
  var currentValue: Input[String]
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String]
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set in the ObjectMetricSource, it is passed as an additional parameter to the
    * metrics server for more specific metrics scoping. When unset, just the metricName will be
    * used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * target is the described Kubernetes object.
    */
  var target: Input[CrossVersionObjectReference]
}

object ObjectMetricStatus {
  @scala.inline
  def apply(
    currentValue: Input[String],
    metricName: Input[String],
    target: Input[CrossVersionObjectReference],
    averageValue: Input[String] = null,
    selector: Input[LabelSelector] = null
  ): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (averageValue != null) __obj.updateDynamic("averageValue")(averageValue.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
}

