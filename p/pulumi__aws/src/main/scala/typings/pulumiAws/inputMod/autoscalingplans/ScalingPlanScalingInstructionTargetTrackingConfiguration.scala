package typings.pulumiAws.inputMod.autoscalingplans

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanScalingInstructionTargetTrackingConfiguration extends js.Object {
  
  /**
    * A customized metric. You can specify either `customizedScalingMetricSpecification` or `predefinedScalingMetricSpecification`.
    * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedScalingMetricSpecification.html).
    */
  var customizedScalingMetricSpecification: js.UndefOr[
    Input[
      ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification
    ]
  ] = js.native
  
  /**
    * Boolean indicating whether scale in by the target tracking scaling policy is disabled. Defaults to `false`.
    */
  var disableScaleIn: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
    * This value is used only if the resource is an Auto Scaling group.
    */
  var estimatedInstanceWarmup: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A predefined metric. You can specify either `predefinedScalingMetricSpecification` or `customizedScalingMetricSpecification`.
    * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html).
    */
  var predefinedScalingMetricSpecification: js.UndefOr[
    Input[
      ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification
    ]
  ] = js.native
  
  /**
    * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
    * This value is not used if the scalable resource is an Auto Scaling group.
    */
  var scaleInCooldown: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start.
    * This value is not used if the scalable resource is an Auto Scaling group.
    */
  var scaleOutCooldown: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The target value for the metric.
    */
  var targetValue: Input[Double] = js.native
}
object ScalingPlanScalingInstructionTargetTrackingConfiguration {
  
  @scala.inline
  def apply(targetValue: Input[Double]): ScalingPlanScalingInstructionTargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanScalingInstructionTargetTrackingConfiguration]
  }
  
  @scala.inline
  implicit class ScalingPlanScalingInstructionTargetTrackingConfigurationOps[Self <: ScalingPlanScalingInstructionTargetTrackingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTargetValue(value: Input[Double]): Self = this.set("targetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizedScalingMetricSpecification(
      value: Input[
          ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification
        ]
    ): Self = this.set("customizedScalingMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomizedScalingMetricSpecification: Self = this.set("customizedScalingMetricSpecification", js.undefined)
    
    @scala.inline
    def setDisableScaleIn(value: Input[Boolean]): Self = this.set("disableScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScaleIn: Self = this.set("disableScaleIn", js.undefined)
    
    @scala.inline
    def setEstimatedInstanceWarmup(value: Input[Double]): Self = this.set("estimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedInstanceWarmup: Self = this.set("estimatedInstanceWarmup", js.undefined)
    
    @scala.inline
    def setPredefinedScalingMetricSpecification(
      value: Input[
          ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification
        ]
    ): Self = this.set("predefinedScalingMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedScalingMetricSpecification: Self = this.set("predefinedScalingMetricSpecification", js.undefined)
    
    @scala.inline
    def setScaleInCooldown(value: Input[Double]): Self = this.set("scaleInCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleInCooldown: Self = this.set("scaleInCooldown", js.undefined)
    
    @scala.inline
    def setScaleOutCooldown(value: Input[Double]): Self = this.set("scaleOutCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleOutCooldown: Self = this.set("scaleOutCooldown", js.undefined)
  }
}
