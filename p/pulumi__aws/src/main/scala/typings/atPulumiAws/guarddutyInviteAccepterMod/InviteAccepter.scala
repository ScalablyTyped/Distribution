package typings.atPulumiAws.guarddutyInviteAccepterMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter")
@js.native
class InviteAccepter protected () extends CustomResource {
  /**
    * Create a InviteAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InviteAccepterArgs) = this()
  def this(name: String, args: InviteAccepterArgs, opts: CustomResourceOptions) = this()
  /**
    * The detector ID of the member GuardDuty account.
    */
  val detectorId: Output[String] = js.native
  /**
    * AWS account ID for master account.
    */
  val masterAccountId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter")
@js.native
object InviteAccepter extends js.Object {
  /**
    * Get an existing InviteAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): InviteAccepter = js.native
  def get(name: String, id: Input[ID], state: InviteAccepterState): InviteAccepter = js.native
  def get(name: String, id: Input[ID], state: InviteAccepterState, opts: CustomResourceOptions): InviteAccepter = js.native
  /**
    * Returns true if the given object is an instance of InviteAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/inviteAccepter.InviteAccepter */ Boolean = js.native
}

