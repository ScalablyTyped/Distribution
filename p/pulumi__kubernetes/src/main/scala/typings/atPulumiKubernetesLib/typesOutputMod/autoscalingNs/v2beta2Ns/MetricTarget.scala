package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

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
  val averageUtilization: scala.Double
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  val averageValue: java.lang.String
  /**
    * type represents whether the metric type is Utilization, Value, or AverageValue
    */
  val `type`: java.lang.String
  /**
    * value is the target value of the metric (as a quantity).
    */
  val value: java.lang.String
}

object MetricTarget {
  @scala.inline
  def apply(
    averageUtilization: scala.Double,
    averageValue: java.lang.String,
    `type`: java.lang.String,
    value: java.lang.String
  ): MetricTarget = {
    val __obj = js.Dynamic.literal(averageUtilization = averageUtilization, averageValue = averageValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MetricTarget]
  }
}

