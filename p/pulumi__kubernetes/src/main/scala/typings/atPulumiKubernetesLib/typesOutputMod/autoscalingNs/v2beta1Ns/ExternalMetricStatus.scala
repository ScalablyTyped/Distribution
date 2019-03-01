package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

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
  val currentAverageValue: java.lang.String
  /**
    * currentValue is the current value of the metric (as a quantity)
    */
  val currentValue: java.lang.String
  /**
    * metricName is the name of a metric used for autoscaling in metric system.
    */
  val metricName: java.lang.String
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  val metricSelector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
}

object ExternalMetricStatus {
  @scala.inline
  def apply(
    currentAverageValue: java.lang.String,
    currentValue: java.lang.String,
    metricName: java.lang.String,
    metricSelector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  ): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentAverageValue")(currentAverageValue)
    __obj.updateDynamic("currentValue")(currentValue)
    __obj.updateDynamic("metricName")(metricName)
    __obj.updateDynamic("metricSelector")(metricSelector)
    __obj.asInstanceOf[ExternalMetricStatus]
  }
}

