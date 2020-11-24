package typings.pulumiKubernetes.inputMod.autoscaling.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * current status of a horizontal pod autoscaler
  */
@js.native
trait HorizontalPodAutoscalerStatus extends js.Object {
  
  /**
    * current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
    */
  var currentCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.native
  
  /**
    * current number of replicas of pods managed by this autoscaler.
    */
  var currentReplicas: Input[Double] = js.native
  
  /**
    * desired number of replicas of pods managed by this autoscaler.
    */
  var desiredReplicas: Input[Double] = js.native
  
  /**
    * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
    */
  var lastScaleTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * most recent generation observed by this autoscaler.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
}
object HorizontalPodAutoscalerStatus {
  
  @scala.inline
  def apply(currentReplicas: Input[Double], desiredReplicas: Input[Double]): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
  
  @scala.inline
  implicit class HorizontalPodAutoscalerStatusOps[Self <: HorizontalPodAutoscalerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentReplicas(value: Input[Double]): Self = this.set("currentReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredReplicas(value: Input[Double]): Self = this.set("desiredReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentCPUUtilizationPercentage(value: Input[Double]): Self = this.set("currentCPUUtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentCPUUtilizationPercentage: Self = this.set("currentCPUUtilizationPercentage", js.undefined)
    
    @scala.inline
    def setLastScaleTime(value: Input[String]): Self = this.set("lastScaleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastScaleTime: Self = this.set("lastScaleTime", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Input[Double]): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
  }
}
