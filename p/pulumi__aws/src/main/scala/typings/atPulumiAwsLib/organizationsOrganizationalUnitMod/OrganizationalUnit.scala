package typings
package atPulumiAwsLib.organizationsOrganizationalUnitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit")
@js.native
class OrganizationalUnit protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a OrganizationalUnit resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: OrganizationalUnitArgs) = this()
  def this(name: java.lang.String, args: OrganizationalUnitArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
    */
  val accounts: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_ArnEmail]] = js.native
  /**
    * ARN of the organizational unit
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name for the organizational unit
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * ID of the parent organizational unit, which may be the root
    */
  val parentId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.organizationsOrganizationalUnitMod.OrganizationalUnitState
  ): atPulumiAwsLib.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.organizationsOrganizationalUnitMod.OrganizationalUnitState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.organizationsOrganizationalUnitMod.OrganizationalUnit = js.native
}

