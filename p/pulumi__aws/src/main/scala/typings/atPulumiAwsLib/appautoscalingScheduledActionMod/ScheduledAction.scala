package typings
package atPulumiAwsLib.appautoscalingScheduledActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appautoscaling/scheduledAction", "ScheduledAction")
@js.native
class ScheduledAction protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ScheduledAction resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ScheduledActionArgs) = this()
  def this(name: java.lang.String, args: ScheduledActionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the scheduled action.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The date and time for the scheduled action to end. Specify the following format: 2006-01-02T15:04:05Z
    */
  val endTime: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the scheduled action.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
    */
  val resourceId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
    */
  val scalableDimension: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The new minimum and maximum capacity. You can set both values or just one. See below
    */
  val scalableTargetAction: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_MaxCapacity]] = js.native
  /**
    * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). In UTC. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
    */
  val schedule: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
    */
  val serviceNamespace: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The date and time for the scheduled action to start. Specify the following format: 2006-01-02T15:04:05Z
    */
  val startTime: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appautoscaling/scheduledAction", "ScheduledAction")
@js.native
object ScheduledAction extends js.Object {
  /**
    * Get an existing ScheduledAction resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appautoscalingScheduledActionMod.ScheduledAction = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appautoscalingScheduledActionMod.ScheduledActionState
  ): atPulumiAwsLib.appautoscalingScheduledActionMod.ScheduledAction = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appautoscalingScheduledActionMod.ScheduledActionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appautoscalingScheduledActionMod.ScheduledAction = js.native
}

