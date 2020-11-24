package typings.pulumiAws.inputMod.autoscalingplans

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanScalingInstruction extends js.Object {
  
  /**
    * The customized load metric to use for predictive scaling. You must specify either `customizedLoadMetricSpecification` or `predefinedLoadMetricSpecification` when configuring predictive scaling.
    * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedLoadMetricSpecification.html).
    */
  var customizedLoadMetricSpecification: js.UndefOr[Input[ScalingPlanScalingInstructionCustomizedLoadMetricSpecification]] = js.native
  
  /**
    * Boolean controlling whether dynamic scaling by AWS Auto Scaling is disabled. Defaults to `false`.
    */
  var disableDynamicScaling: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting for `predictiveScalingMaxCapacityBehavior`.
    */
  var maxCapacity: Input[Double] = js.native
  
  /**
    * The minimum capacity of the resource.
    */
  var minCapacity: Input[Double] = js.native
  
  /**
    * The predefined load metric to use for predictive scaling. You must specify either `predefinedLoadMetricSpecification` or `customizedLoadMetricSpecification` when configuring predictive scaling.
    * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedLoadMetricSpecification.html).
    */
  var predefinedLoadMetricSpecification: js.UndefOr[Input[ScalingPlanScalingInstructionPredefinedLoadMetricSpecification]] = js.native
  
  /**
    * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity specified for the resource.
    * Valid values: `SetForecastCapacityToMaxCapacity`, `SetMaxCapacityAboveForecastCapacity`, `SetMaxCapacityToForecastCapacity`.
    */
  var predictiveScalingMaxCapacityBehavior: js.UndefOr[Input[String]] = js.native
  
  /**
    * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
    */
  var predictiveScalingMaxCapacityBuffer: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The predictive scaling mode. Valid values: `ForecastAndScale`, `ForecastOnly`.
    */
  var predictiveScalingMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the resource. This string consists of the resource type and unique identifier.
    */
  var resourceId: Input[String] = js.native
  
  /**
    * The scalable dimension associated with the resource. Valid values: `autoscaling:autoScalingGroup:DesiredCapacity`, `dynamodb:index:ReadCapacityUnits`, `dynamodb:index:WriteCapacityUnits`, `dynamodb:table:ReadCapacityUnits`, `dynamodb:table:WriteCapacityUnits`, `ecs:service:DesiredCount`, `ec2:spot-fleet-request:TargetCapacity`, `rds:cluster:ReadReplicaCount`.
    */
  var scalableDimension: Input[String] = js.native
  
  /**
    * Controls whether a resource's externally created scaling policies are kept or replaced. Valid values: `KeepExternalPolicies`, `ReplaceExternalPolicies`. Defaults to `KeepExternalPolicies`.
    */
  var scalingPolicyUpdateBehavior: js.UndefOr[Input[String]] = js.native
  
  /**
    * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out.
    */
  var scheduledActionBufferTime: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The namespace of the AWS service. Valid values: `autoscaling`, `dynamodb`, `ecs`, `ec2`, `rds`.
    */
  var serviceNamespace: Input[String] = js.native
  
  /**
    * The structure that defines new target tracking configurations. Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.
    * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_TargetTrackingConfiguration.html).
    */
  var targetTrackingConfigurations: Input[js.Array[Input[ScalingPlanScalingInstructionTargetTrackingConfiguration]]] = js.native
}
object ScalingPlanScalingInstruction {
  
  @scala.inline
  def apply(
    maxCapacity: Input[Double],
    minCapacity: Input[Double],
    resourceId: Input[String],
    scalableDimension: Input[String],
    serviceNamespace: Input[String],
    targetTrackingConfigurations: Input[js.Array[Input[ScalingPlanScalingInstructionTargetTrackingConfiguration]]]
  ): ScalingPlanScalingInstruction = {
    val __obj = js.Dynamic.literal(maxCapacity = maxCapacity.asInstanceOf[js.Any], minCapacity = minCapacity.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any], targetTrackingConfigurations = targetTrackingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanScalingInstruction]
  }
  
  @scala.inline
  implicit class ScalingPlanScalingInstructionOps[Self <: ScalingPlanScalingInstruction] (val x: Self) extends AnyVal {
    
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
    def setMaxCapacity(value: Input[Double]): Self = this.set("maxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCapacity(value: Input[Double]): Self = this.set("minCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableDimension(value: Input[String]): Self = this.set("scalableDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespace(value: Input[String]): Self = this.set("serviceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTrackingConfigurationsVarargs(value: Input[ScalingPlanScalingInstructionTargetTrackingConfiguration]*): Self = this.set("targetTrackingConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setTargetTrackingConfigurations(value: Input[js.Array[Input[ScalingPlanScalingInstructionTargetTrackingConfiguration]]]): Self = this.set("targetTrackingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizedLoadMetricSpecification(value: Input[ScalingPlanScalingInstructionCustomizedLoadMetricSpecification]): Self = this.set("customizedLoadMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomizedLoadMetricSpecification: Self = this.set("customizedLoadMetricSpecification", js.undefined)
    
    @scala.inline
    def setDisableDynamicScaling(value: Input[Boolean]): Self = this.set("disableDynamicScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDynamicScaling: Self = this.set("disableDynamicScaling", js.undefined)
    
    @scala.inline
    def setPredefinedLoadMetricSpecification(value: Input[ScalingPlanScalingInstructionPredefinedLoadMetricSpecification]): Self = this.set("predefinedLoadMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedLoadMetricSpecification: Self = this.set("predefinedLoadMetricSpecification", js.undefined)
    
    @scala.inline
    def setPredictiveScalingMaxCapacityBehavior(value: Input[String]): Self = this.set("predictiveScalingMaxCapacityBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictiveScalingMaxCapacityBehavior: Self = this.set("predictiveScalingMaxCapacityBehavior", js.undefined)
    
    @scala.inline
    def setPredictiveScalingMaxCapacityBuffer(value: Input[Double]): Self = this.set("predictiveScalingMaxCapacityBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictiveScalingMaxCapacityBuffer: Self = this.set("predictiveScalingMaxCapacityBuffer", js.undefined)
    
    @scala.inline
    def setPredictiveScalingMode(value: Input[String]): Self = this.set("predictiveScalingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictiveScalingMode: Self = this.set("predictiveScalingMode", js.undefined)
    
    @scala.inline
    def setScalingPolicyUpdateBehavior(value: Input[String]): Self = this.set("scalingPolicyUpdateBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingPolicyUpdateBehavior: Self = this.set("scalingPolicyUpdateBehavior", js.undefined)
    
    @scala.inline
    def setScheduledActionBufferTime(value: Input[Double]): Self = this.set("scheduledActionBufferTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActionBufferTime: Self = this.set("scheduledActionBufferTime", js.undefined)
  }
}
