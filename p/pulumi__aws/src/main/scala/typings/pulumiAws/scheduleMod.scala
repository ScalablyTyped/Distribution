package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduleMod {
  
  @JSImport("@pulumi/aws/autoscaling/schedule", "Schedule")
  @js.native
  class Schedule protected () extends CustomResource {
    /**
      * Create a Schedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduleArgs) = this()
    def this(name: String, args: ScheduleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN assigned by AWS to the autoscaling schedule.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
      */
    val autoscalingGroupName: Output_[String] = js.native
    
    /**
      * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
      */
    val desiredCapacity: Output_[Double] = js.native
    
    /**
      * The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
      * If you try to schedule your action in the past, Auto Scaling returns an error message.
      */
    val endTime: Output_[String] = js.native
    
    /**
      * The maximum size for the Auto Scaling group. Default 0.
      * Set to -1 if you don't want to change the maximum size at the scheduled time.
      */
    val maxSize: Output_[Double] = js.native
    
    /**
      * The minimum size for the Auto Scaling group. Default 0.
      * Set to -1 if you don't want to change the minimum size at the scheduled time.
      */
    val minSize: Output_[Double] = js.native
    
    /**
      * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
      */
    val recurrence: Output_[String] = js.native
    
    /**
      * The name of this scaling action.
      */
    val scheduledActionName: Output_[String] = js.native
    
    /**
      * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
      * If you try to schedule your action in the past, Auto Scaling returns an error message.
      */
    val startTime: Output_[String] = js.native
  }
  /* static members */
  object Schedule {
    
    @JSImport("@pulumi/aws/autoscaling/schedule", "Schedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Schedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Schedule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Schedule]
    inline def get(name: String, id: Input[ID], state: ScheduleState): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Schedule]
    inline def get(name: String, id: Input[ID], state: ScheduleState, opts: CustomResourceOptions): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Schedule]
    
    /**
      * Returns true if the given object is an instance of Schedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/schedule.Schedule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/autoscaling/schedule.Schedule */ Boolean]
  }
  
  trait ScheduleArgs extends StObject {
    
    /**
      * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
      */
    val autoscalingGroupName: Input[String]
    
    /**
      * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
      */
    val desiredCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
      * If you try to schedule your action in the past, Auto Scaling returns an error message.
      */
    val endTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum size for the Auto Scaling group. Default 0.
      * Set to -1 if you don't want to change the maximum size at the scheduled time.
      */
    val maxSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The minimum size for the Auto Scaling group. Default 0.
      * Set to -1 if you don't want to change the minimum size at the scheduled time.
      */
    val minSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
      */
    val recurrence: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of this scaling action.
      */
    val scheduledActionName: Input[String]
    
    /**
      * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
      * If you try to schedule your action in the past, Auto Scaling returns an error message.
      */
    val startTime: js.UndefOr[Input[String]] = js.undefined
  }
  object ScheduleArgs {
    
    inline def apply(autoscalingGroupName: Input[String], scheduledActionName: Input[String]): ScheduleArgs = {
      val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any], scheduledActionName = scheduledActionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduleArgs]
    }
    
    extension [Self <: ScheduleArgs](x: Self) {
      
      inline def setAutoscalingGroupName(value: Input[String]): Self = StObject.set(x, "autoscalingGroupName", value.asInstanceOf[js.Any])
      
      inline def setDesiredCapacity(value: Input[Double]): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
      
      inline def setDesiredCapacityUndefined: Self = StObject.set(x, "desiredCapacity", js.undefined)
      
      inline def setEndTime(value: Input[String]): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setMaxSize(value: Input[Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinSize(value: Input[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setRecurrence(value: Input[String]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
      
      inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
      
      inline def setScheduledActionName(value: Input[String]): Self = StObject.set(x, "scheduledActionName", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Input[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  trait ScheduleState extends StObject {
    
    /**
      * The ARN assigned by AWS to the autoscaling schedule.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
      */
    val autoscalingGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
      */
    val desiredCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
      * If you try to schedule your action in the past, Auto Scaling returns an error message.
      */
    val endTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum size for the Auto Scaling group. Default 0.
      * Set to -1 if you don't want to change the maximum size at the scheduled time.
      */
    val maxSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The minimum size for the Auto Scaling group. Default 0.
      * Set to -1 if you don't want to change the minimum size at the scheduled time.
      */
    val minSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
      */
    val recurrence: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of this scaling action.
      */
    val scheduledActionName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
      * If you try to schedule your action in the past, Auto Scaling returns an error message.
      */
    val startTime: js.UndefOr[Input[String]] = js.undefined
  }
  object ScheduleState {
    
    inline def apply(): ScheduleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScheduleState]
    }
    
    extension [Self <: ScheduleState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAutoscalingGroupName(value: Input[String]): Self = StObject.set(x, "autoscalingGroupName", value.asInstanceOf[js.Any])
      
      inline def setAutoscalingGroupNameUndefined: Self = StObject.set(x, "autoscalingGroupName", js.undefined)
      
      inline def setDesiredCapacity(value: Input[Double]): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
      
      inline def setDesiredCapacityUndefined: Self = StObject.set(x, "desiredCapacity", js.undefined)
      
      inline def setEndTime(value: Input[String]): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setMaxSize(value: Input[Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinSize(value: Input[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setRecurrence(value: Input[String]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
      
      inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
      
      inline def setScheduledActionName(value: Input[String]): Self = StObject.set(x, "scheduledActionName", value.asInstanceOf[js.Any])
      
      inline def setScheduledActionNameUndefined: Self = StObject.set(x, "scheduledActionName", js.undefined)
      
      inline def setStartTime(value: Input[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
}
