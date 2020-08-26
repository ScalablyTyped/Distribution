package typings.pulumiAws.organizationalUnitMod

import typings.pulumiAws.outputMod.organizations.OrganizationalUnitAccount
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit")
@js.native
class OrganizationalUnit protected () extends CustomResource {
  /**
    * Create a OrganizationalUnit resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OrganizationalUnitArgs) = this()
  def this(name: String, args: OrganizationalUnitArgs, opts: CustomResourceOptions) = this()
  /**
    * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
    */
  val accounts: Output_[js.Array[OrganizationalUnitAccount]] = js.native
  /**
    * ARN of the organizational unit
    */
  val arn: Output_[String] = js.native
  /**
    * The name for the organizational unit
    */
  val name: Output_[String] = js.native
  /**
    * ID of the parent organizational unit, which may be the root
    */
  val parentId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit")
@js.native
object OrganizationalUnit extends js.Object {
  /**
    * Get an existing OrganizationalUnit resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): OrganizationalUnit = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OrganizationalUnit = js.native
  def get(name: String, id: Input[ID], state: OrganizationalUnitState): OrganizationalUnit = js.native
  def get(name: String, id: Input[ID], state: OrganizationalUnitState, opts: CustomResourceOptions): OrganizationalUnit = js.native
  /**
    * Returns true if the given object is an instance of OrganizationalUnit.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organizationalUnit.OrganizationalUnit */ Boolean = js.native
}

