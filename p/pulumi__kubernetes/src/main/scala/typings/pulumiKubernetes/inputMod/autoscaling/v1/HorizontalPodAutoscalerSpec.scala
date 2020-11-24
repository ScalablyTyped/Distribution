package typings.pulumiKubernetes.inputMod.autoscaling.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specification of a horizontal pod autoscaler.
  */
@js.native
trait HorizontalPodAutoscalerSpec extends js.Object {
  
  /**
    * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
    */
  var maxReplicas: Input[Double] = js.native
  
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
    */
  var minReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
    */
  var scaleTargetRef: Input[CrossVersionObjectReference] = js.native
  
  /**
    * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
    */
  var targetCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.native
}
object HorizontalPodAutoscalerSpec {
  
  @scala.inline
  def apply(maxReplicas: Input[Double], scaleTargetRef: Input[CrossVersionObjectReference]): HorizontalPodAutoscalerSpec = {
    val __obj = js.Dynamic.literal(maxReplicas = maxReplicas.asInstanceOf[js.Any], scaleTargetRef = scaleTargetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
  }
  
  @scala.inline
  implicit class HorizontalPodAutoscalerSpecOps[Self <: HorizontalPodAutoscalerSpec] (val x: Self) extends AnyVal {
    
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
    def setMaxReplicas(value: Input[Double]): Self = this.set("maxReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleTargetRef(value: Input[CrossVersionObjectReference]): Self = this.set("scaleTargetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinReplicas(value: Input[Double]): Self = this.set("minReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinReplicas: Self = this.set("minReplicas", js.undefined)
    
    @scala.inline
    def setTargetCPUUtilizationPercentage(value: Input[Double]): Self = this.set("targetCPUUtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCPUUtilizationPercentage: Self = this.set("targetCPUUtilizationPercentage", js.undefined)
  }
}
