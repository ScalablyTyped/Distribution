package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
  */
trait HorizontalPodAutoscalerSpec extends StObject {
  
  /**
    * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
    */
  var maxReplicas: Double
  
  /**
    * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.
    */
  var metrics: js.Array[MetricSpec]
  
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
    */
  var minReplicas: Double
  
  /**
    * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
    */
  var scaleTargetRef: CrossVersionObjectReference
}
object HorizontalPodAutoscalerSpec {
  
  @scala.inline
  def apply(
    maxReplicas: Double,
    metrics: js.Array[MetricSpec],
    minReplicas: Double,
    scaleTargetRef: CrossVersionObjectReference
  ): HorizontalPodAutoscalerSpec = {
    val __obj = js.Dynamic.literal(maxReplicas = maxReplicas.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], minReplicas = minReplicas.asInstanceOf[js.Any], scaleTargetRef = scaleTargetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
  }
  
  @scala.inline
  implicit class HorizontalPodAutoscalerSpecMutableBuilder[Self <: HorizontalPodAutoscalerSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxReplicas(value: Double): Self = StObject.set(x, "maxReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: js.Array[MetricSpec]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsVarargs(value: MetricSpec*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setMinReplicas(value: Double): Self = StObject.set(x, "minReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleTargetRef(value: CrossVersionObjectReference): Self = StObject.set(x, "scaleTargetRef", value.asInstanceOf[js.Any])
  }
}
