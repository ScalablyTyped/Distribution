package typings.atPulumiKubernetes.typesOutputMod.autoscalingNs.v2beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as
  * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
  * or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top
  * of those available to normal per-pod metrics using the "pods" source.
  */
trait ResourceMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  val current: MetricValueStatus
  /**
    * Name is the name of the resource in question.
    */
  val name: String
}

object ResourceMetricStatus {
  @scala.inline
  def apply(current: MetricValueStatus, name: String): ResourceMetricStatus = {
    val __obj = js.Dynamic.literal(current = current, name = name)
  
    __obj.asInstanceOf[ResourceMetricStatus]
  }
}

