package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecycleHookMod {
  
  @JSImport("@pulumi/aws/autoscaling/lifecycleHook", "LifecycleHook")
  @js.native
  class LifecycleHook protected () extends CustomResource {
    /**
      * Create a LifecycleHook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecycleHookArgs) = this()
    def this(name: String, args: LifecycleHookArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the Auto Scaling group to which you want to assign the lifecycle hook
      */
    val autoscalingGroupName: Output_[String] = js.native
    
    /**
      * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
      */
    val defaultResult: Output_[String] = js.native
    
    /**
      * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
      */
    val heartbeatTimeout: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
      */
    val lifecycleTransition: Output_[String] = js.native
    
    /**
      * The name of the lifecycle hook.
      */
    val name: Output_[String] = js.native
    
    /**
      * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
      */
    val notificationMetadata: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
      */
    val notificationTargetArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
      */
    val roleArn: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object LifecycleHook {
    
    @JSImport("@pulumi/aws/autoscaling/lifecycleHook", "LifecycleHook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): LifecycleHook = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LifecycleHook]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LifecycleHook = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LifecycleHook]
    @scala.inline
    def get(name: String, id: Input[ID], state: LifecycleHookState): LifecycleHook = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LifecycleHook]
    @scala.inline
    def get(name: String, id: Input[ID], state: LifecycleHookState, opts: CustomResourceOptions): LifecycleHook = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LifecycleHook]
    
    /**
      * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean]
  }
  
  trait LifecycleHookArgs extends StObject {
    
    /**
      * The name of the Auto Scaling group to which you want to assign the lifecycle hook
      */
    val autoscalingGroupName: Input[String]
    
    /**
      * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
      */
    val defaultResult: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
      */
    val heartbeatTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
      */
    val lifecycleTransition: Input[String]
    
    /**
      * The name of the lifecycle hook.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
      */
    val notificationMetadata: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
      */
    val notificationTargetArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object LifecycleHookArgs {
    
    @scala.inline
    def apply(autoscalingGroupName: Input[String], lifecycleTransition: Input[String]): LifecycleHookArgs = {
      val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any], lifecycleTransition = lifecycleTransition.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecycleHookArgs]
    }
    
    @scala.inline
    implicit class LifecycleHookArgsMutableBuilder[Self <: LifecycleHookArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoscalingGroupName(value: Input[String]): Self = StObject.set(x, "autoscalingGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultResult(value: Input[String]): Self = StObject.set(x, "defaultResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultResultUndefined: Self = StObject.set(x, "defaultResult", js.undefined)
      
      @scala.inline
      def setHeartbeatTimeout(value: Input[Double]): Self = StObject.set(x, "heartbeatTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "heartbeatTimeout", js.undefined)
      
      @scala.inline
      def setLifecycleTransition(value: Input[String]): Self = StObject.set(x, "lifecycleTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotificationMetadata(value: Input[String]): Self = StObject.set(x, "notificationMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationMetadataUndefined: Self = StObject.set(x, "notificationMetadata", js.undefined)
      
      @scala.inline
      def setNotificationTargetArn(value: Input[String]): Self = StObject.set(x, "notificationTargetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTargetArnUndefined: Self = StObject.set(x, "notificationTargetArn", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
  
  trait LifecycleHookState extends StObject {
    
    /**
      * The name of the Auto Scaling group to which you want to assign the lifecycle hook
      */
    val autoscalingGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
      */
    val defaultResult: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
      */
    val heartbeatTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
      */
    val lifecycleTransition: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the lifecycle hook.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
      */
    val notificationMetadata: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
      */
    val notificationTargetArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object LifecycleHookState {
    
    @scala.inline
    def apply(): LifecycleHookState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LifecycleHookState]
    }
    
    @scala.inline
    implicit class LifecycleHookStateMutableBuilder[Self <: LifecycleHookState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoscalingGroupName(value: Input[String]): Self = StObject.set(x, "autoscalingGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingGroupNameUndefined: Self = StObject.set(x, "autoscalingGroupName", js.undefined)
      
      @scala.inline
      def setDefaultResult(value: Input[String]): Self = StObject.set(x, "defaultResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultResultUndefined: Self = StObject.set(x, "defaultResult", js.undefined)
      
      @scala.inline
      def setHeartbeatTimeout(value: Input[Double]): Self = StObject.set(x, "heartbeatTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "heartbeatTimeout", js.undefined)
      
      @scala.inline
      def setLifecycleTransition(value: Input[String]): Self = StObject.set(x, "lifecycleTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleTransitionUndefined: Self = StObject.set(x, "lifecycleTransition", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotificationMetadata(value: Input[String]): Self = StObject.set(x, "notificationMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationMetadataUndefined: Self = StObject.set(x, "notificationMetadata", js.undefined)
      
      @scala.inline
      def setNotificationTargetArn(value: Input[String]): Self = StObject.set(x, "notificationTargetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTargetArnUndefined: Self = StObject.set(x, "notificationTargetArn", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
}
