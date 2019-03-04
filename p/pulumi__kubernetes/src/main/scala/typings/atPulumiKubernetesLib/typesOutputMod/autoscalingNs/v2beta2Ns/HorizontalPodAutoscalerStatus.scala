package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
  */
trait HorizontalPodAutoscalerStatus extends js.Object {
  /**
    * conditions is the set of conditions required for this autoscaler to scale its target, and
    * indicates whether or not those conditions are met.
    */
  val conditions: js.Array[HorizontalPodAutoscalerCondition]
  /**
    * currentMetrics is the last read state of the metrics used by this autoscaler.
    */
  val currentMetrics: js.Array[MetricStatus]
  /**
    * currentReplicas is current number of replicas of pods managed by this autoscaler, as last
    * seen by the autoscaler.
    */
  val currentReplicas: scala.Double
  /**
    * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as
    * last calculated by the autoscaler.
    */
  val desiredReplicas: scala.Double
  /**
    * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used
    * by the autoscaler to control how often the number of pods is changed.
    */
  val lastScaleTime: java.lang.String
  /**
    * observedGeneration is the most recent generation observed by this autoscaler.
    */
  val observedGeneration: scala.Double
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    conditions: js.Array[HorizontalPodAutoscalerCondition],
    currentMetrics: js.Array[MetricStatus],
    currentReplicas: scala.Double,
    desiredReplicas: scala.Double,
    lastScaleTime: java.lang.String,
    observedGeneration: scala.Double
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions, currentMetrics = currentMetrics, currentReplicas = currentReplicas, desiredReplicas = desiredReplicas, lastScaleTime = lastScaleTime, observedGeneration = observedGeneration)
  
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
}

