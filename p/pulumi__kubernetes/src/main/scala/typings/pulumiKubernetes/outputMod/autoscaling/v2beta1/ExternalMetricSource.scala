package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
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
  val metricName: String
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  val metricSelector: LabelSelector
  /**
    * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually
    * exclusive with TargetValue.
    */
  val targetAverageValue: String
  /**
    * targetValue is the target value of the metric (as a quantity). Mutually exclusive with
    * TargetAverageValue.
    */
  val targetValue: String
}

object ExternalMetricSource {
  @scala.inline
  def apply(metricName: String, metricSelector: LabelSelector, targetAverageValue: String, targetValue: String): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricSelector = metricSelector.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSource]
  }
}

