package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
  * example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSource extends js.Object {
  val describedObject: CrossVersionObjectReference
  /**
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier
  /**
    * target specifies the target value for the given metric
    */
  val target: MetricTarget
}

object ObjectMetricSource {
  @scala.inline
  def apply(describedObject: CrossVersionObjectReference, metric: MetricIdentifier, target: MetricTarget): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
}

