package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
  */
trait HorizontalPodAutoscalerStatus extends StObject {
  
  /**
    * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
    */
  var conditions: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]]
  
  /**
    * currentMetrics is the last read state of the metrics used by this autoscaler.
    */
  var currentMetrics: js.UndefOr[Input[js.Array[Input[MetricStatus]]]] = js.undefined
  
  /**
    * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
    */
  var currentReplicas: Input[Double]
  
  /**
    * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
    */
  var desiredReplicas: Input[Double]
  
  /**
    * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
    */
  var lastScaleTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * observedGeneration is the most recent generation observed by this autoscaler.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
}
object HorizontalPodAutoscalerStatus {
  
  inline def apply(
    conditions: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]],
    currentReplicas: Input[Double],
    desiredReplicas: Input[Double]
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
  
  extension [Self <: HorizontalPodAutoscalerStatus](x: Self) {
    
    inline def setConditions(value: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: Input[HorizontalPodAutoscalerCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setCurrentMetrics(value: Input[js.Array[Input[MetricStatus]]]): Self = StObject.set(x, "currentMetrics", value.asInstanceOf[js.Any])
    
    inline def setCurrentMetricsUndefined: Self = StObject.set(x, "currentMetrics", js.undefined)
    
    inline def setCurrentMetricsVarargs(value: Input[MetricStatus]*): Self = StObject.set(x, "currentMetrics", js.Array(value :_*))
    
    inline def setCurrentReplicas(value: Input[Double]): Self = StObject.set(x, "currentReplicas", value.asInstanceOf[js.Any])
    
    inline def setDesiredReplicas(value: Input[Double]): Self = StObject.set(x, "desiredReplicas", value.asInstanceOf[js.Any])
    
    inline def setLastScaleTime(value: Input[String]): Self = StObject.set(x, "lastScaleTime", value.asInstanceOf[js.Any])
    
    inline def setLastScaleTimeUndefined: Self = StObject.set(x, "lastScaleTime", js.undefined)
    
    inline def setObservedGeneration(value: Input[Double]): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
  }
}
