package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
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
  var conditions: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]]
  /**
    * currentMetrics is the last read state of the metrics used by this autoscaler.
    */
  var currentMetrics: js.UndefOr[Input[js.Array[Input[MetricStatus]]]] = js.undefined
  /**
    * currentReplicas is current number of replicas of pods managed by this autoscaler, as last
    * seen by the autoscaler.
    */
  var currentReplicas: Input[Double]
  /**
    * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as
    * last calculated by the autoscaler.
    */
  var desiredReplicas: Input[Double]
  /**
    * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used
    * by the autoscaler to control how often the number of pods is changed.
    */
  var lastScaleTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * observedGeneration is the most recent generation observed by this autoscaler.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    conditions: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]],
    currentReplicas: Input[Double],
    desiredReplicas: Input[Double],
    currentMetrics: Input[js.Array[Input[MetricStatus]]] = null,
    lastScaleTime: Input[String] = null,
    observedGeneration: Input[Double] = null
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any])
    if (currentMetrics != null) __obj.updateDynamic("currentMetrics")(currentMetrics.asInstanceOf[js.Any])
    if (lastScaleTime != null) __obj.updateDynamic("lastScaleTime")(lastScaleTime.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
}

