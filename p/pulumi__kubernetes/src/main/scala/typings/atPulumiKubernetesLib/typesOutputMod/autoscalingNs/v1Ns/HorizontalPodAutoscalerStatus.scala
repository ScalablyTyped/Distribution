package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns

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
  val currentCPUUtilizationPercentage: scala.Double
  /**
    * current number of replicas of pods managed by this autoscaler.
    */
  val currentReplicas: scala.Double
  /**
    * desired number of replicas of pods managed by this autoscaler.
    */
  val desiredReplicas: scala.Double
  /**
    * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to
    * control how often the number of pods is changed.
    */
  val lastScaleTime: java.lang.String
  /**
    * most recent generation observed by this autoscaler.
    */
  val observedGeneration: scala.Double
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    currentCPUUtilizationPercentage: scala.Double,
    currentReplicas: scala.Double,
    desiredReplicas: scala.Double,
    lastScaleTime: java.lang.String,
    observedGeneration: scala.Double
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(currentCPUUtilizationPercentage = currentCPUUtilizationPercentage, currentReplicas = currentReplicas, desiredReplicas = desiredReplicas, lastScaleTime = lastScaleTime, observedGeneration = observedGeneration)
  
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
}

