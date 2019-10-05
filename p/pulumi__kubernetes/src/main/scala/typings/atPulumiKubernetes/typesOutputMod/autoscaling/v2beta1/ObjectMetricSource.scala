package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import typings.atPulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
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
  val averageValue: String
  /**
    * metricName is the name of the metric in question.
    */
  val metricName: String
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  val selector: LabelSelector
  /**
    * target is the described Kubernetes object.
    */
  val target: CrossVersionObjectReference
  /**
    * targetValue is the target value of the metric (as a quantity).
    */
  val targetValue: String
}

object ObjectMetricSource {
  @scala.inline
  def apply(
    averageValue: String,
    metricName: String,
    selector: LabelSelector,
    target: CrossVersionObjectReference,
    targetValue: String
  ): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(averageValue = averageValue, metricName = metricName, selector = selector, target = target, targetValue = targetValue)
  
    __obj.asInstanceOf[ObjectMetricSource]
  }
}

