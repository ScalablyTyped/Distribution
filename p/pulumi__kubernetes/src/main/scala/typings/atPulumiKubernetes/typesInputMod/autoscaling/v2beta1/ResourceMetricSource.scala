package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typings.atPulumiPulumi.outputMod.Input
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
  var name: Input[String]
  /**
    * targetAverageUtilization is the target value of the average of the resource metric across
    * all relevant pods, represented as a percentage of the requested value of the resource for
    * the pods.
    */
  var targetAverageUtilization: js.UndefOr[Input[Double]] = js.undefined
  /**
    * targetAverageValue is the target value of the average of the resource metric across all
    * relevant pods, as a raw value (instead of as a percentage of the request), similar to the
    * "pods" metric source type.
    */
  var targetAverageValue: js.UndefOr[Input[String]] = js.undefined
}

object ResourceMetricSource {
  @scala.inline
  def apply(
    name: Input[String],
    targetAverageUtilization: Input[Double] = null,
    targetAverageValue: Input[String] = null
  ): ResourceMetricSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (targetAverageUtilization != null) __obj.updateDynamic("targetAverageUtilization")(targetAverageUtilization.asInstanceOf[js.Any])
    if (targetAverageValue != null) __obj.updateDynamic("targetAverageValue")(targetAverageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricSource]
  }
}

