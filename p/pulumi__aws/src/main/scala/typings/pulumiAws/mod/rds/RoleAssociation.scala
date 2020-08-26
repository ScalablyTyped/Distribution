package typings.pulumiAws.mod.rds

import typings.pulumiAws.roleAssociationMod.RoleAssociationArgs
import typings.pulumiAws.roleAssociationMod.RoleAssociationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.RoleAssociation")
@js.native
class RoleAssociation protected ()
  extends typings.pulumiAws.rdsMod.RoleAssociation {
  /**
    * Create a RoleAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RoleAssociationArgs) = this()
  def this(name: String, args: RoleAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "rds.RoleAssociation")
@js.native
object RoleAssociation extends js.Object {
  /**
    * Get an existing RoleAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.roleAssociationMod.RoleAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.roleAssociationMod.RoleAssociation = js.native
  def get(name: String, id: Input[ID], state: RoleAssociationState): typings.pulumiAws.roleAssociationMod.RoleAssociation = js.native
  def get(name: String, id: Input[ID], state: RoleAssociationState, opts: CustomResourceOptions): typings.pulumiAws.roleAssociationMod.RoleAssociation = js.native
  /**
    * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean = js.native
}

