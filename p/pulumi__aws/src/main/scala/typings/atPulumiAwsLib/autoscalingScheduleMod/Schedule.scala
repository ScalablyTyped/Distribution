package typings
package atPulumiAwsLib.autoscalingScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling/schedule", "Schedule")
@js.native
class Schedule protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Schedule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ScheduleArgs) = this()
  def this(name: java.lang.String, args: ScheduleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN assigned by AWS to the autoscaling schedule.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  val autoscalingGroupName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
    */
  val desiredCapacity: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val endTime: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The maximum size for the Auto Scaling group. Default 0.
    * Set to -1 if you don't want to change the maximum size at the scheduled time.
    */
  val maxSize: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The minimum size for the Auto Scaling group. Default 0.
    * Set to -1 if you don't want to change the minimum size at the scheduled time.
    */
  val minSize: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
    */
  val recurrence: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of this scaling action.
    */
  val scheduledActionName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val startTime: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/autoscaling/schedule", "Schedule")
@js.native
object Schedule extends js.Object {
  /**
    * Get an existing Schedule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingScheduleMod.Schedule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.autoscalingScheduleMod.ScheduleState
  ): atPulumiAwsLib.autoscalingScheduleMod.Schedule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.autoscalingScheduleMod.ScheduleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.autoscalingScheduleMod.Schedule = js.native
}

