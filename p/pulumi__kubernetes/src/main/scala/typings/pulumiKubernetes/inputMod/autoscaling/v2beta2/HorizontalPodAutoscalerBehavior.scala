package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
  */
trait HorizontalPodAutoscalerBehavior extends StObject {
  
  /**
    * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
    */
  var scaleDown: js.UndefOr[Input[HPAScalingRules]] = js.undefined
  
  /**
    * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
    *   * increase no more than 4 pods per 60 seconds
    *   * double the number of pods per 60 seconds
    * No stabilization is used.
    */
  var scaleUp: js.UndefOr[Input[HPAScalingRules]] = js.undefined
}
object HorizontalPodAutoscalerBehavior {
  
  @scala.inline
  def apply(): HorizontalPodAutoscalerBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalPodAutoscalerBehavior]
  }
  
  @scala.inline
  implicit class HorizontalPodAutoscalerBehaviorMutableBuilder[Self <: HorizontalPodAutoscalerBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleDown(value: Input[HPAScalingRules]): Self = StObject.set(x, "scaleDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDownUndefined: Self = StObject.set(x, "scaleDown", js.undefined)
    
    @scala.inline
    def setScaleUp(value: Input[HPAScalingRules]): Self = StObject.set(x, "scaleUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUpUndefined: Self = StObject.set(x, "scaleUp", js.undefined)
  }
}
