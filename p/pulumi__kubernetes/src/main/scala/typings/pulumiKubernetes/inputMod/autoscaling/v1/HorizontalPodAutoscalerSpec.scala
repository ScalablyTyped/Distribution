package typings.pulumiKubernetes.inputMod.autoscaling.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specification of a horizontal pod autoscaler.
  */
trait HorizontalPodAutoscalerSpec extends js.Object {
  /**
    * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller
    * than MinReplicas.
    */
  var maxReplicas: Input[Double]
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale
    * down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate
    * HPAScaleToZero is enabled and at least one Object or External metric is configured.
    * Scaling is active as long as at least one metric value is available.
    */
  var minReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * reference to scaled resource; horizontal pod autoscaler will learn the current resource
    * consumption and will set the desired number of pods by using its Scale subresource.
    */
  var scaleTargetRef: Input[CrossVersionObjectReference]
  /**
    * target average CPU utilization (represented as a percentage of requested CPU) over all the
    * pods; if not specified the default autoscaling policy will be used.
    */
  var targetCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.undefined
}

object HorizontalPodAutoscalerSpec {
  @scala.inline
  def apply(
    maxReplicas: Input[Double],
    scaleTargetRef: Input[CrossVersionObjectReference],
    minReplicas: Input[Double] = null,
    targetCPUUtilizationPercentage: Input[Double] = null
  ): HorizontalPodAutoscalerSpec = {
    val __obj = js.Dynamic.literal(maxReplicas = maxReplicas.asInstanceOf[js.Any], scaleTargetRef = scaleTargetRef.asInstanceOf[js.Any])
    if (minReplicas != null) __obj.updateDynamic("minReplicas")(minReplicas.asInstanceOf[js.Any])
    if (targetCPUUtilizationPercentage != null) __obj.updateDynamic("targetCPUUtilizationPercentage")(targetCPUUtilizationPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
  }
}

