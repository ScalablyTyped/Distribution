package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricValueStatus holds the current value for a metric
  */
trait MetricValueStatus extends js.Object {
  /**
    * currentAverageUtilization is the current value of the average of the resource metric across
    * all relevant pods, represented as a percentage of the requested value of the resource for
    * the pods.
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.undefined
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * value is the current value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}

object MetricValueStatus {
  @scala.inline
  def apply(
    averageUtilization: Input[Double] = null,
    averageValue: Input[String] = null,
    value: Input[String] = null
  ): MetricValueStatus = {
    val __obj = js.Dynamic.literal()
    if (averageUtilization != null) __obj.updateDynamic("averageUtilization")(averageUtilization.asInstanceOf[js.Any])
    if (averageValue != null) __obj.updateDynamic("averageValue")(averageValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValueStatus]
  }
}

