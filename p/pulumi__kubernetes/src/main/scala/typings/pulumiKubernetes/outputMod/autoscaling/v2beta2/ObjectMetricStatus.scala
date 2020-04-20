package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
  * (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  val current: MetricValueStatus
  val describedObject: CrossVersionObjectReference
  /**
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier
}

object ObjectMetricStatus {
  @scala.inline
  def apply(current: MetricValueStatus, describedObject: CrossVersionObjectReference, metric: MetricIdentifier): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
}

