package typings.pulumiAws

import typings.pulumiAws.outputMod.appautoscaling.PolicyStepScalingPolicyConfiguration
import typings.pulumiAws.outputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyMod {
  
  @JSImport("@pulumi/aws/appautoscaling/policy", "Policy")
  @js.native
  class Policy protected () extends CustomResource {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN assigned by AWS to the scaling policy.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the policy. Must be between 1 and 255 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * The policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
      */
    val policyType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val scalableDimension: Output_[String] = js.native
    
    /**
      * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val serviceNamespace: Output_[String] = js.native
    
    /**
      * Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
      */
    val stepScalingPolicyConfiguration: Output_[js.UndefOr[PolicyStepScalingPolicyConfiguration]] = js.native
    
    /**
      * A target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
      */
    val targetTrackingScalingPolicyConfiguration: Output_[js.UndefOr[PolicyTargetTrackingScalingPolicyConfiguration]] = js.native
  }
  /* static members */
  object Policy {
    
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/appautoscaling/policy", "Policy.get")
    @js.native
    def get(name: String, id: Input[ID]): Policy = js.native
    @JSImport("@pulumi/aws/appautoscaling/policy", "Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Policy = js.native
    @JSImport("@pulumi/aws/appautoscaling/policy", "Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState): Policy = js.native
    @JSImport("@pulumi/aws/appautoscaling/policy", "Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): Policy = js.native
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/appautoscaling/policy", "Policy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/policy.Policy */ Boolean = js.native
  }
  
  @js.native
  trait PolicyArgs extends StObject {
    
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
    val resourceId: Input[String] = js.native
    
    /**
      * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val scalableDimension: Input[String] = js.native
    
    /**
      * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val serviceNamespace: Input[String] = js.native
    
    /**
      * Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
      */
    val stepScalingPolicyConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.appautoscaling.PolicyStepScalingPolicyConfiguration]
      ] = js.native
    
    /**
      * A target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
      */
    val targetTrackingScalingPolicyConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
        ]
      ] = js.native
  }
  object PolicyArgs {
    
    @scala.inline
    def apply(resourceId: Input[String], scalableDimension: Input[String], serviceNamespace: Input[String]): PolicyArgs = {
      val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyArgs]
    }
    
    @scala.inline
    implicit class PolicyArgsMutableBuilder[Self <: PolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicyType(value: Input[String]): Self = StObject.set(x, "policyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypeUndefined: Self = StObject.set(x, "policyType", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableDimension(value: Input[String]): Self = StObject.set(x, "scalableDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNamespace(value: Input[String]): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepScalingPolicyConfiguration(value: Input[typings.pulumiAws.inputMod.appautoscaling.PolicyStepScalingPolicyConfiguration]): Self = StObject.set(x, "stepScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepScalingPolicyConfigurationUndefined: Self = StObject.set(x, "stepScalingPolicyConfiguration", js.undefined)
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
            ]
      ): Self = StObject.set(x, "targetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "targetTrackingScalingPolicyConfiguration", js.undefined)
    }
  }
  
  @js.native
  trait PolicyState extends StObject {
    
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
    val stepScalingPolicyConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.appautoscaling.PolicyStepScalingPolicyConfiguration]
      ] = js.native
    
    /**
      * A target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
      */
    val targetTrackingScalingPolicyConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
        ]
      ] = js.native
  }
  object PolicyState {
    
    @scala.inline
    def apply(): PolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyState]
    }
    
    @scala.inline
    implicit class PolicyStateMutableBuilder[Self <: PolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicyType(value: Input[String]): Self = StObject.set(x, "policyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypeUndefined: Self = StObject.set(x, "policyType", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setScalableDimension(value: Input[String]): Self = StObject.set(x, "scalableDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableDimensionUndefined: Self = StObject.set(x, "scalableDimension", js.undefined)
      
      @scala.inline
      def setServiceNamespace(value: Input[String]): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNamespaceUndefined: Self = StObject.set(x, "serviceNamespace", js.undefined)
      
      @scala.inline
      def setStepScalingPolicyConfiguration(value: Input[typings.pulumiAws.inputMod.appautoscaling.PolicyStepScalingPolicyConfiguration]): Self = StObject.set(x, "stepScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepScalingPolicyConfigurationUndefined: Self = StObject.set(x, "stepScalingPolicyConfiguration", js.undefined)
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
            ]
      ): Self = StObject.set(x, "targetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "targetTrackingScalingPolicyConfiguration", js.undefined)
    }
  }
}
