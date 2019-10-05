package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any
  * Kubernetes object.
  */
trait ExternalMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  val current: MetricValueStatus
  /**
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier
}

object ExternalMetricStatus {
  @scala.inline
  def apply(current: MetricValueStatus, metric: MetricIdentifier): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(current = current, metric = metric)
  
    __obj.asInstanceOf[ExternalMetricStatus]
  }
}

