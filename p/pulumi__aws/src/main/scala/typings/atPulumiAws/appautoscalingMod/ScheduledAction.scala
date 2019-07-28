package typings.atPulumiAws.appautoscalingMod

import typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledActionArgs
import typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledActionState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appautoscaling", "ScheduledAction")
@js.native
class ScheduledAction protected ()
  extends typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledAction {
  /**
    * Create a ScheduledAction resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ScheduledActionArgs) = this()
  def this(name: String, args: ScheduledActionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/appautoscaling", "ScheduledAction")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledAction = js.native
  def get(name: String, id: Input[ID], state: ScheduledActionState): typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledAction = js.native
  def get(name: String, id: Input[ID], state: ScheduledActionState, opts: CustomResourceOptions): typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledAction = js.native
  /**
    * Returns true if the given object is an instance of ScheduledAction.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/scheduledAction.ScheduledAction */ Boolean = js.native
}

