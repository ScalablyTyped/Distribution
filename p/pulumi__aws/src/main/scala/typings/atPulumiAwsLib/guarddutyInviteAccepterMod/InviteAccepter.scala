package typings
package atPulumiAwsLib.guarddutyInviteAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter")
@js.native
class InviteAccepter protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a InviteAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: InviteAccepterArgs) = this()
  def this(name: java.lang.String, args: InviteAccepterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The detector ID of the member GuardDuty account.
    */
  val detectorId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * AWS account ID for master account.
    */
  val masterAccountId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepterState
  ): atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepter = js.native
}

