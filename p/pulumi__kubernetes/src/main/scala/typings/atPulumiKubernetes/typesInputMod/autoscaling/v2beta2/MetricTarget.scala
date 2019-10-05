package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricTarget defines the target value, average value, or average utilization of a specific
  * metric
  */
trait MetricTarget extends js.Object {
  /**
    * averageUtilization is the target value of the average of the resource metric across all
    * relevant pods, represented as a percentage of the requested value of the resource for the
    * pods. Currently only valid for Resource metric source type
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.undefined
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * type represents whether the metric type is Utilization, Value, or AverageValue
    */
  var `type`: Input[String]
  /**
    * value is the target value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}

object MetricTarget {
  @scala.inline
  def apply(
    `type`: Input[String],
    averageUtilization: Input[Double] = null,
    averageValue: Input[String] = null,
    value: Input[String] = null
  ): MetricTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (averageUtilization != null) __obj.updateDynamic("averageUtilization")(averageUtilization.asInstanceOf[js.Any])
    if (averageValue != null) __obj.updateDynamic("averageValue")(averageValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTarget]
  }
}

