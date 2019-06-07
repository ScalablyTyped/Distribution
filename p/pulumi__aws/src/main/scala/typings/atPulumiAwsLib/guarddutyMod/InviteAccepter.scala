package typings
package atPulumiAwsLib.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty", "InviteAccepter")
@js.native
class InviteAccepter protected ()
  extends atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepter {
  /**
    * Create a InviteAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepterArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.guarddutyInviteAccepterMod.InviteAccepterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/guardduty", "InviteAccepter")
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
  /**
    * Returns true if the given object is an instance of InviteAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/inviteAccepter.InviteAccepter */ scala.Boolean = js.native
}

