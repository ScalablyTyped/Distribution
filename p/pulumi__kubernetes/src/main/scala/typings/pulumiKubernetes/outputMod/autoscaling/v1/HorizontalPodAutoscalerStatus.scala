package typings.pulumiKubernetes.outputMod.autoscaling.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * current status of a horizontal pod autoscaler
  */
trait HorizontalPodAutoscalerStatus extends js.Object {
  /**
    * current average CPU utilization over all pods, represented as a percentage of requested
    * CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
    */
  val currentCPUUtilizationPercentage: Double
  /**
    * current number of replicas of pods managed by this autoscaler.
    */
  val currentReplicas: Double
  /**
    * desired number of replicas of pods managed by this autoscaler.
    */
  val desiredReplicas: Double
  /**
    * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to
    * control how often the number of pods is changed.
    */
  val lastScaleTime: String
  /**
    * most recent generation observed by this autoscaler.
    */
  val observedGeneration: Double
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    currentCPUUtilizationPercentage: Double,
    currentReplicas: Double,
    desiredReplicas: Double,
    lastScaleTime: String,
    observedGeneration: Double
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(currentCPUUtilizationPercentage = currentCPUUtilizationPercentage.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any], lastScaleTime = lastScaleTime.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
}

