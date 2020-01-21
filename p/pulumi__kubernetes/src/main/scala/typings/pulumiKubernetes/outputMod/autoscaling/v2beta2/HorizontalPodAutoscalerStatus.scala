package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

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
  val currentReplicas: Double
  /**
    * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as
    * last calculated by the autoscaler.
    */
  val desiredReplicas: Double
  /**
    * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used
    * by the autoscaler to control how often the number of pods is changed.
    */
  val lastScaleTime: String
  /**
    * observedGeneration is the most recent generation observed by this autoscaler.
    */
  val observedGeneration: Double
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    conditions: js.Array[HorizontalPodAutoscalerCondition],
    currentMetrics: js.Array[MetricStatus],
    currentReplicas: Double,
    desiredReplicas: Double,
    lastScaleTime: String,
    observedGeneration: Double
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], currentMetrics = currentMetrics.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any], lastScaleTime = lastScaleTime.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
}

