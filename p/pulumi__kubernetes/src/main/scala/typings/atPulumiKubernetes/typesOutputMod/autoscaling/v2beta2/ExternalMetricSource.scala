package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes
  * object (for example length of queue in cloud messaging service, or QPS from loadbalancer
  * running outside of cluster).
  */
trait ExternalMetricSource extends js.Object {
  /**
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier
  /**
    * target specifies the target value for the given metric
    */
  val target: MetricTarget
}

object ExternalMetricSource {
  @scala.inline
  def apply(metric: MetricIdentifier, target: MetricTarget): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric, target = target)
  
    __obj.asInstanceOf[ExternalMetricSource]
  }
}

