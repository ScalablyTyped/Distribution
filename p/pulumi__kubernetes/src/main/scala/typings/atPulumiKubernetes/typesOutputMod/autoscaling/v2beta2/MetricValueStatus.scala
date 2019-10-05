package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta2

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
  val averageUtilization: Double
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  val averageValue: String
  /**
    * value is the current value of the metric (as a quantity).
    */
  val value: String
}

object MetricValueStatus {
  @scala.inline
  def apply(averageUtilization: Double, averageValue: String, value: String): MetricValueStatus = {
    val __obj = js.Dynamic.literal(averageUtilization = averageUtilization, averageValue = averageValue, value = value)
  
    __obj.asInstanceOf[MetricValueStatus]
  }
}

