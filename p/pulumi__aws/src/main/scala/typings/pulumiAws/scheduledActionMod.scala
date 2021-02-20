package typings.pulumiAws

import typings.pulumiAws.outputMod.appautoscaling.ScheduledActionScalableTargetAction
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduledActionMod {
  
  @JSImport("@pulumi/aws/appautoscaling/scheduledAction", "ScheduledAction")
  @js.native
  class ScheduledAction protected () extends CustomResource {
    /**
      * Create a ScheduledAction resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduledActionArgs) = this()
    def this(name: String, args: ScheduledActionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the scheduled action.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The date and time for the scheduled action to end. Specify the following format: 2006-01-02T15:04:05Z
      */
    val endTime: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the scheduled action.
      */
    val name: Output_[String] = js.native
    
    /**
      * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
      */
    val scalableDimension: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The new minimum and maximum capacity. You can set both values or just one. See below
      */
    val scalableTargetAction: Output_[js.UndefOr[ScheduledActionScalableTargetAction]] = js.native
    
    /**
      * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). In UTC. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
      */
    val schedule: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
      */
    val serviceNamespace: Output_[String] = js.native
    
    /**
      * The date and time for the scheduled action to start. Specify the following format: 2006-01-02T15:04:05Z
      */
    val startTime: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object ScheduledAction {
    
    /**
      * Get an existing ScheduledAction resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/appautoscaling/scheduledAction", "ScheduledAction.get")
    @js.native
    def get(name: String, id: Input[ID]): ScheduledAction = js.native
    @JSImport("@pulumi/aws/appautoscaling/scheduledAction", "ScheduledAction.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ScheduledAction = js.native
    @JSImport("@pulumi/aws/appautoscaling/scheduledAction", "ScheduledAction.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState): ScheduledAction = js.native
    @JSImport("@pulumi/aws/appautoscaling/scheduledAction", "ScheduledAction.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState, opts: CustomResourceOptions): ScheduledAction = js.native
    
    /**
      * Returns true if the given object is an instance of ScheduledAction.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/appautoscaling/scheduledAction", "ScheduledAction.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/scheduledAction.ScheduledAction */ Boolean = js.native
  }
  
  @js.native
  trait ScheduledActionArgs extends StObject {
    
    /**
      * The date and time for the scheduled action to end. Specify the following format: 2006-01-02T15:04:05Z
      */
    val endTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the scheduled action.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
      */
    val resourceId: Input[String] = js.native
    
    /**
      * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
      */
    val scalableDimension: js.UndefOr[Input[String]] = js.native
    
    /**
      * The new minimum and maximum capacity. You can set both values or just one. See below
      */
    val scalableTargetAction: js.UndefOr[
        Input[typings.pulumiAws.inputMod.appautoscaling.ScheduledActionScalableTargetAction]
      ] = js.native
    
    /**
      * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). In UTC. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
      */
    val schedule: js.UndefOr[Input[String]] = js.native
    
    /**
      * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
      */
    val serviceNamespace: Input[String] = js.native
    
    /**
      * The date and time for the scheduled action to start. Specify the following format: 2006-01-02T15:04:05Z
      */
    val startTime: js.UndefOr[Input[String]] = js.native
  }
  object ScheduledActionArgs {
    
    @scala.inline
    def apply(resourceId: Input[String], serviceNamespace: Input[String]): ScheduledActionArgs = {
      val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduledActionArgs]
    }
    
    @scala.inline
    implicit class ScheduledActionArgsMutableBuilder[Self <: ScheduledActionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Input[String]): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableDimension(value: Input[String]): Self = StObject.set(x, "scalableDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableDimensionUndefined: Self = StObject.set(x, "scalableDimension", js.undefined)
      
      @scala.inline
      def setScalableTargetAction(value: Input[typings.pulumiAws.inputMod.appautoscaling.ScheduledActionScalableTargetAction]): Self = StObject.set(x, "scalableTargetAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableTargetActionUndefined: Self = StObject.set(x, "scalableTargetAction", js.undefined)
      
      @scala.inline
      def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setServiceNamespace(value: Input[String]): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Input[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  @js.native
  trait ScheduledActionState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the scheduled action.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The date and time for the scheduled action to end. Specify the following format: 2006-01-02T15:04:05Z
      */
    val endTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the scheduled action.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
      */
    val resourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
      */
    val scalableDimension: js.UndefOr[Input[String]] = js.native
    
    /**
      * The new minimum and maximum capacity. You can set both values or just one. See below
      */
    val scalableTargetAction: js.UndefOr[
        Input[typings.pulumiAws.inputMod.appautoscaling.ScheduledActionScalableTargetAction]
      ] = js.native
    
    /**
      * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). In UTC. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
      */
    val schedule: js.UndefOr[Input[String]] = js.native
    
    /**
      * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
      */
    val serviceNamespace: js.UndefOr[Input[String]] = js.native
    
    /**
      * The date and time for the scheduled action to start. Specify the following format: 2006-01-02T15:04:05Z
      */
    val startTime: js.UndefOr[Input[String]] = js.native
  }
  object ScheduledActionState {
    
    @scala.inline
    def apply(): ScheduledActionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScheduledActionState]
    }
    
    @scala.inline
    implicit class ScheduledActionStateMutableBuilder[Self <: ScheduledActionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEndTime(value: Input[String]): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setScalableDimension(value: Input[String]): Self = StObject.set(x, "scalableDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableDimensionUndefined: Self = StObject.set(x, "scalableDimension", js.undefined)
      
      @scala.inline
      def setScalableTargetAction(value: Input[typings.pulumiAws.inputMod.appautoscaling.ScheduledActionScalableTargetAction]): Self = StObject.set(x, "scalableTargetAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableTargetActionUndefined: Self = StObject.set(x, "scalableTargetAction", js.undefined)
      
      @scala.inline
      def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setServiceNamespace(value: Input[String]): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNamespaceUndefined: Self = StObject.set(x, "serviceNamespace", js.undefined)
      
      @scala.inline
      def setStartTime(value: Input[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
}
