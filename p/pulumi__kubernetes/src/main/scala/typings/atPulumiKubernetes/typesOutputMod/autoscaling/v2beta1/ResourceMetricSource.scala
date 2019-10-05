package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as
  * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
  * or memory).  The values will be averaged together before being compared to the target.  Such
  * metrics are built in to Kubernetes, and have special scaling options on top of those
  * available to normal per-pod metrics using the "pods" source.  Only one "target" type should
  * be set.
  */
trait ResourceMetricSource extends js.Object {
  /**
    * name is the name of the resource in question.
    */
  val name: String
  /**
    * targetAverageUtilization is the target value of the average of the resource metric across
    * all relevant pods, represented as a percentage of the requested value of the resource for
    * the pods.
    */
  val targetAverageUtilization: Double
  /**
    * targetAverageValue is the target value of the average of the resource metric across all
    * relevant pods, as a raw value (instead of as a percentage of the request), similar to the
    * "pods" metric source type.
    */
  val targetAverageValue: String
}

object ResourceMetricSource {
  @scala.inline
  def apply(name: String, targetAverageUtilization: Double, targetAverageValue: String): ResourceMetricSource = {
    val __obj = js.Dynamic.literal(name = name, targetAverageUtilization = targetAverageUtilization, targetAverageValue = targetAverageValue)
  
    __obj.asInstanceOf[ResourceMetricSource]
  }
}

