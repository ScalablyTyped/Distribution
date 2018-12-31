package typings
package atPulumiAwsLib.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations", "Organization")
@js.native
class Organization protected ()
  extends atPulumiAwsLib.organizationsOrganizationMod.Organization {
  /**
    * Create a Organization resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.organizationsOrganizationMod.OrganizationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.organizationsOrganizationMod.OrganizationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/organizations", "Organization")
@js.native
object Organization extends js.Object {
  /**
    * Get an existing Organization resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.organizationsOrganizationMod.Organization = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.organizationsOrganizationMod.OrganizationState
  ): atPulumiAwsLib.organizationsOrganizationMod.Organization = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.organizationsOrganizationMod.OrganizationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.organizationsOrganizationMod.Organization = js.native
}

