package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
  */
@js.native
trait HorizontalPodAutoscalerSpec extends js.Object {
  
  /**
    * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
    */
  var maxReplicas: Input[Double] = js.native
  
  /**
    * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.
    */
  var metrics: js.UndefOr[Input[js.Array[Input[MetricSpec]]]] = js.native
  
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
    */
  var minReplicas: js.UndefOr[Input[Double]] = js.native
  
  /**
    * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
    */
  var scaleTargetRef: Input[CrossVersionObjectReference] = js.native
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
    def setMetricsVarargs(value: Input[MetricSpec]*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: Input[js.Array[Input[MetricSpec]]]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setMinReplicas(value: Input[Double]): Self = this.set("minReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinReplicas: Self = this.set("minReplicas", js.undefined)
  }
}
