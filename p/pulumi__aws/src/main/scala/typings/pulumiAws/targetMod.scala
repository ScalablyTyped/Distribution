package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetMod {
  
  @JSImport("@pulumi/aws/appautoscaling/target", "Target")
  @js.native
  class Target protected () extends CustomResource {
    /**
      * Create a Target resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetArgs) = this()
    def this(name: String, args: TargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The max capacity of the scalable target.
      */
    val maxCapacity: Output_[Double] = js.native
    
    /**
      * The min capacity of the scalable target.
      */
    val minCapacity: Output_[Double] = js.native
    
    /**
      * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val scalableDimension: Output_[String] = js.native
    
    /**
      * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val serviceNamespace: Output_[String] = js.native
  }
  /* static members */
  object Target {
    
    @JSImport("@pulumi/aws/appautoscaling/target", "Target")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Target resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Target = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Target]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Target = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Target]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetState): Target = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Target]
    @scala.inline
    def get(name: String, id: Input[ID], state: TargetState, opts: CustomResourceOptions): Target = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Target]
    
    /**
      * Returns true if the given object is an instance of Target.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/target.Target */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appautoscaling/target.Target */ Boolean]
  }
  
  trait TargetArgs extends StObject {
    
    /**
      * The max capacity of the scalable target.
      */
    val maxCapacity: Input[Double]
    
    /**
      * The min capacity of the scalable target.
      */
    val minCapacity: Input[Double]
    
    /**
      * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val resourceId: Input[String]
    
    /**
      * The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val scalableDimension: Input[String]
    
    /**
      * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val serviceNamespace: Input[String]
  }
  object TargetArgs {
    
    @scala.inline
    def apply(
      maxCapacity: Input[Double],
      minCapacity: Input[Double],
      resourceId: Input[String],
      scalableDimension: Input[String],
      serviceNamespace: Input[String]
    ): TargetArgs = {
      val __obj = js.Dynamic.literal(maxCapacity = maxCapacity.asInstanceOf[js.Any], minCapacity = minCapacity.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetArgs]
    }
    
    @scala.inline
    implicit class TargetArgsMutableBuilder[Self <: TargetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCapacity(value: Input[Double]): Self = StObject.set(x, "minCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setScalableDimension(value: Input[String]): Self = StObject.set(x, "scalableDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNamespace(value: Input[String]): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetState extends StObject {
    
    /**
      * The max capacity of the scalable target.
      */
    val maxCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The min capacity of the scalable target.
      */
    val minCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val resourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val scalableDimension: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
      */
    val serviceNamespace: js.UndefOr[Input[String]] = js.undefined
  }
  object TargetState {
    
    @scala.inline
    def apply(): TargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetState]
    }
    
    @scala.inline
    implicit class TargetStateMutableBuilder[Self <: TargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      @scala.inline
      def setMinCapacity(value: Input[Double]): Self = StObject.set(x, "minCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCapacityUndefined: Self = StObject.set(x, "minCapacity", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setScalableDimension(value: Input[String]): Self = StObject.set(x, "scalableDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableDimensionUndefined: Self = StObject.set(x, "scalableDimension", js.undefined)
      
      @scala.inline
      def setServiceNamespace(value: Input[String]): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNamespaceUndefined: Self = StObject.set(x, "serviceNamespace", js.undefined)
    }
  }
}
