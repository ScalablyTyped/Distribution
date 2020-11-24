package typings.pulumiAws.policyMod

import typings.pulumiAws.inputMod.appautoscaling.PolicyStepScalingPolicyConfiguration
import typings.pulumiAws.inputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyState extends js.Object {
  
  /**
    * The ARN assigned by AWS to the scaling policy.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the policy. Must be between 1 and 255 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
    */
  val policyType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: js.UndefOr[Input[String]] = js.native
  
  /**
    * Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
    */
  val stepScalingPolicyConfiguration: js.UndefOr[Input[PolicyStepScalingPolicyConfiguration]] = js.native
  
  /**
    * A target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
    */
  val targetTrackingScalingPolicyConfiguration: js.UndefOr[Input[PolicyTargetTrackingScalingPolicyConfiguration]] = js.native
}
object PolicyState {
  
  @scala.inline
  def apply(): PolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyState]
  }
  
  @scala.inline
  implicit class PolicyStateOps[Self <: PolicyState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPolicyType(value: Input[String]): Self = this.set("policyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyType: Self = this.set("policyType", js.undefined)
    
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setScalableDimension(value: Input[String]): Self = this.set("scalableDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalableDimension: Self = this.set("scalableDimension", js.undefined)
    
    @scala.inline
    def setServiceNamespace(value: Input[String]): Self = this.set("serviceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNamespace: Self = this.set("serviceNamespace", js.undefined)
    
    @scala.inline
    def setStepScalingPolicyConfiguration(value: Input[PolicyStepScalingPolicyConfiguration]): Self = this.set("stepScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepScalingPolicyConfiguration: Self = this.set("stepScalingPolicyConfiguration", js.undefined)
    
    @scala.inline
    def setTargetTrackingScalingPolicyConfiguration(value: Input[PolicyTargetTrackingScalingPolicyConfiguration]): Self = this.set("targetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTrackingScalingPolicyConfiguration: Self = this.set("targetTrackingScalingPolicyConfiguration", js.undefined)
  }
}
