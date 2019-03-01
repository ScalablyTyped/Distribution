package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

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
  val maxReplicas: scala.Double
  /**
    * metrics contains the specifications for which to use to calculate the desired replica count
    * (the maximum replica count across all metrics will be used).  The desired replica count is
    * calculated multiplying the ratio between the target value and the current value by the
    * current number of pods.  Ergo, metrics used must decrease as the pod count is increased,
    * and vice-versa.  See the individual metric source types for more information about how each
    * type of metric must respond. If not set, the default metric will be set to 80% average CPU
    * utilization.
    */
  val metrics: js.Array[MetricSpec]
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale
    * down. It defaults to 1 pod.
    */
  val minReplicas: scala.Double
  /**
    * scaleTargetRef points to the target resource to scale, and is used to the pods for which
    * metrics should be collected, as well as to actually change the replica count.
    */
  val scaleTargetRef: CrossVersionObjectReference
}

object HorizontalPodAutoscalerSpec {
  @scala.inline
  def apply(
    maxReplicas: scala.Double,
    metrics: js.Array[MetricSpec],
    minReplicas: scala.Double,
    scaleTargetRef: CrossVersionObjectReference
  ): HorizontalPodAutoscalerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxReplicas")(maxReplicas)
    __obj.updateDynamic("metrics")(metrics)
    __obj.updateDynamic("minReplicas")(minReplicas)
    __obj.updateDynamic("scaleTargetRef")(scaleTargetRef)
    __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
  }
}

