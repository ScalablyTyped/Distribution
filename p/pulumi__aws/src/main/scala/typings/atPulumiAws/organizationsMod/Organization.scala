package typings.atPulumiAws.organizationsMod

import typings.atPulumiAws.organizationsOrganizationMod.OrganizationArgs
import typings.atPulumiAws.organizationsOrganizationMod.OrganizationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations", "Organization")
@js.native
class Organization protected ()
  extends typings.atPulumiAws.organizationsOrganizationMod.Organization {
  /**
    * Create a Organization resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: OrganizationArgs) = this()
  def this(name: String, args: OrganizationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.organizationsOrganizationMod.Organization = js.native
  def get(name: String, id: Input[ID], state: OrganizationState): typings.atPulumiAws.organizationsOrganizationMod.Organization = js.native
  def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): typings.atPulumiAws.organizationsOrganizationMod.Organization = js.native
  /**
    * Returns true if the given object is an instance of Organization.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organization.Organization */ Boolean = js.native
}

