package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
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
  var metric: Input[MetricIdentifier]
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget]
}

object ExternalMetricSource {
  @scala.inline
  def apply(metric: Input[MetricIdentifier], target: Input[MetricTarget]): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExternalMetricSource]
  }
}

