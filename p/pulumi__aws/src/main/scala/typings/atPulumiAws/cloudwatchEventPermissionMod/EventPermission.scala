package typings.atPulumiAws.cloudwatchEventPermissionMod

import typings.atPulumiAws.typesOutputMod.cloudwatch.EventPermissionCondition
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/eventPermission", "EventPermission")
@js.native
class EventPermission protected () extends CustomResource {
  /**
    * Create a EventPermission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventPermissionArgs) = this()
  def this(name: String, args: EventPermissionArgs, opts: CustomResourceOptions) = this()
  /**
    * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
    */
  val action: Output[js.UndefOr[String]] = js.native
  /**
    * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
    */
  val condition: Output[js.UndefOr[EventPermissionCondition]] = js.native
  /**
    * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
    */
  val principal: Output[String] = js.native
  /**
    * An identifier string for the external account that you are granting permissions to.
    */
  val statementId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/eventPermission", "EventPermission")
@js.native
object EventPermission extends js.Object {
  /**
    * Get an existing EventPermission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): EventPermission = js.native
  def get(name: String, id: Input[ID], state: EventPermissionState): EventPermission = js.native
  def get(name: String, id: Input[ID], state: EventPermissionState, opts: CustomResourceOptions): EventPermission = js.native
  /**
    * Returns true if the given object is an instance of EventPermission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventPermission.EventPermission */ Boolean = js.native
}

