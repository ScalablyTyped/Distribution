package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
  * example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSource extends js.Object {
  var describedObject: Input[CrossVersionObjectReference]
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier]
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget]
}

object ObjectMetricSource {
  @scala.inline
  def apply(
    describedObject: Input[CrossVersionObjectReference],
    metric: Input[MetricIdentifier],
    target: Input[MetricTarget]
  ): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectMetricSource]
  }
}

