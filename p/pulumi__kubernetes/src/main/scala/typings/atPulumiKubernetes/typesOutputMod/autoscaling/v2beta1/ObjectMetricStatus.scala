package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import typings.atPulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
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
  val averageValue: String
  /**
    * currentValue is the current value of the metric (as a quantity).
    */
  val currentValue: String
  /**
    * metricName is the name of the metric in question.
    */
  val metricName: String
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set in the ObjectMetricSource, it is passed as an additional parameter to the
    * metrics server for more specific metrics scoping. When unset, just the metricName will be
    * used to gather metrics.
    */
  val selector: LabelSelector
  /**
    * target is the described Kubernetes object.
    */
  val target: CrossVersionObjectReference
}

object ObjectMetricStatus {
  @scala.inline
  def apply(
    averageValue: String,
    currentValue: String,
    metricName: String,
    selector: LabelSelector,
    target: CrossVersionObjectReference
  ): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(averageValue = averageValue.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectMetricStatus]
  }
}

