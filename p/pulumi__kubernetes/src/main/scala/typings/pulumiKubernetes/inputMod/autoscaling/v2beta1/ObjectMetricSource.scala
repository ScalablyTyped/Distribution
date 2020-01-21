package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
  * example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSource extends js.Object {
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String]
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * target is the described Kubernetes object.
    */
  var target: Input[CrossVersionObjectReference]
  /**
    * targetValue is the target value of the metric (as a quantity).
    */
  var targetValue: Input[String]
}

object ObjectMetricSource {
  @scala.inline
  def apply(
    metricName: Input[String],
    target: Input[CrossVersionObjectReference],
    targetValue: Input[String],
    averageValue: Input[String] = null,
    selector: Input[LabelSelector] = null
  ): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any])
    if (averageValue != null) __obj.updateDynamic("averageValue")(averageValue.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
}

