package typings.atPulumiKubernetes.typesOutputMod.autoscalingNs.v1Ns

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
  val maxReplicas: Double
  /**
    * lower limit for the number of pods that can be set by the autoscaler, default 1.
    */
  val minReplicas: Double
  /**
    * reference to scaled resource; horizontal pod autoscaler will learn the current resource
    * consumption and will set the desired number of pods by using its Scale subresource.
    */
  val scaleTargetRef: CrossVersionObjectReference
  /**
    * target average CPU utilization (represented as a percentage of requested CPU) over all the
    * pods; if not specified the default autoscaling policy will be used.
    */
  val targetCPUUtilizationPercentage: Double
}

object HorizontalPodAutoscalerSpec {
  @scala.inline
  def apply(
    maxReplicas: Double,
    minReplicas: Double,
    scaleTargetRef: CrossVersionObjectReference,
    targetCPUUtilizationPercentage: Double
  ): HorizontalPodAutoscalerSpec = {
    val __obj = js.Dynamic.literal(maxReplicas = maxReplicas, minReplicas = minReplicas, scaleTargetRef = scaleTargetRef, targetCPUUtilizationPercentage = targetCPUUtilizationPercentage)
  
    __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
  }
}

