package typings.pulumiKubernetes.inputMod.autoscaling.v1

import typings.pulumiPulumi.outputMod.Input
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
  var currentCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.undefined
  /**
    * current number of replicas of pods managed by this autoscaler.
    */
  var currentReplicas: Input[Double]
  /**
    * desired number of replicas of pods managed by this autoscaler.
    */
  var desiredReplicas: Input[Double]
  /**
    * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to
    * control how often the number of pods is changed.
    */
  var lastScaleTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * most recent generation observed by this autoscaler.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    currentReplicas: Input[Double],
    desiredReplicas: Input[Double],
    currentCPUUtilizationPercentage: Input[Double] = null,
    lastScaleTime: Input[String] = null,
    observedGeneration: Input[Double] = null
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any])
    if (currentCPUUtilizationPercentage != null) __obj.updateDynamic("currentCPUUtilizationPercentage")(currentCPUUtilizationPercentage.asInstanceOf[js.Any])
    if (lastScaleTime != null) __obj.updateDynamic("lastScaleTime")(lastScaleTime.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
}

