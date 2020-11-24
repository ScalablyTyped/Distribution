package typings.pulumiKubernetes.outputMod.autoscaling.v1

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
  var currentCPUUtilizationPercentage: Double = js.native
  
  /**
    * current number of replicas of pods managed by this autoscaler.
    */
  var currentReplicas: Double = js.native
  
  /**
    * desired number of replicas of pods managed by this autoscaler.
    */
  var desiredReplicas: Double = js.native
  
  /**
    * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
    */
  var lastScaleTime: String = js.native
  
  /**
    * most recent generation observed by this autoscaler.
    */
  var observedGeneration: Double = js.native
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
    def setCurrentCPUUtilizationPercentage(value: Double): Self = this.set("currentCPUUtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentReplicas(value: Double): Self = this.set("currentReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredReplicas(value: Double): Self = this.set("desiredReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastScaleTime(value: String): Self = this.set("lastScaleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
  }
}
