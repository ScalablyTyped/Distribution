package typings.atPulumiAws.autoscalingMod

import typings.atPulumiAws.autoscalingScheduleMod.ScheduleArgs
import typings.atPulumiAws.autoscalingScheduleMod.ScheduleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling", "Schedule")
@js.native
class Schedule protected ()
  extends typings.atPulumiAws.autoscalingScheduleMod.Schedule {
  /**
    * Create a Schedule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ScheduleArgs) = this()
  def this(name: String, args: ScheduleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/autoscaling", "Schedule")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.autoscalingScheduleMod.Schedule = js.native
  def get(name: String, id: Input[ID], state: ScheduleState): typings.atPulumiAws.autoscalingScheduleMod.Schedule = js.native
  def get(name: String, id: Input[ID], state: ScheduleState, opts: CustomResourceOptions): typings.atPulumiAws.autoscalingScheduleMod.Schedule = js.native
  /**
    * Returns true if the given object is an instance of Schedule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/schedule.Schedule */ Boolean = js.native
}

