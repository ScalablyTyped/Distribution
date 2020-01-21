package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerSpec describes the desired functionality of the
  * HorizontalPodAutoscaler.
  */
trait HorizontalPodAutoscalerSpec extends js.Object {
  /**
    * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale
    * up. It cannot be less that minReplicas.
    */
  var maxReplicas: Input[Double]
  /**
    * metrics contains the specifications for which to use to calculate the desired replica count
    * (the maximum replica count across all metrics will be used).  The desired replica count is
    * calculated multiplying the ratio between the target value and the current value by the
    * current number of pods.  Ergo, metrics used must decrease as the pod count is increased,
    * and vice-versa.  See the individual metric source types for more information about how each
    * type of metric must respond.
    */
  var metrics: js.UndefOr[Input[js.Array[Input[MetricSpec]]]] = js.undefined
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale
    * down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate
    * HPAScaleToZero is enabled and at least one Object or External metric is configured.
    * Scaling is active as long as at least one metric value is available.
    */
  var minReplicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * scaleTargetRef points to the target resource to scale, and is used to the pods for which
    * metrics should be collected, as well as to actually change the replica count.
    */
  var scaleTargetRef: Input[CrossVersionObjectReference]
}

object HorizontalPodAutoscalerSpec {
  @scala.inline
  def apply(
    maxReplicas: Input[Double],
    scaleTargetRef: Input[CrossVersionObjectReference],
    metrics: Input[js.Array[Input[MetricSpec]]] = null,
    minReplicas: Input[Double] = null
  ): HorizontalPodAutoscalerSpec = {
    val __obj = js.Dynamic.literal(maxReplicas = maxReplicas.asInstanceOf[js.Any], scaleTargetRef = scaleTargetRef.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (minReplicas != null) __obj.updateDynamic("minReplicas")(minReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
  }
}

