package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

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

