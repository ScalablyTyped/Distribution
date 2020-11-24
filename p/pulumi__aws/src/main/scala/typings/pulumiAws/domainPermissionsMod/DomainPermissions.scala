package typings.pulumiAws.domainPermissionsMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions")
@js.native
class DomainPermissions protected () extends CustomResource {
  /**
    * Create a DomainPermissions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainPermissionsArgs) = this()
  def this(name: String, args: DomainPermissionsArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the domain on which to set the resource policy.
    */
  val domain: Output_[String] = js.native
  
  /**
    * The account number of the AWS account that owns the domain.
    */
  val domainOwner: Output_[String] = js.native
  
  /**
    * A JSON policy string to be set as the access control resource policy on the provided domain.
    */
  val policyDocument: Output_[String] = js.native
  
  /**
    * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
    */
  val policyRevision: Output_[String] = js.native
  
  /**
    * The ARN of the resource associated with the resource policy.
    */
  val resourceArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions")
@js.native
object DomainPermissions extends js.Object {
  
  /**
    * Get an existing DomainPermissions resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DomainPermissions = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DomainPermissions = js.native
  def get(name: String, id: Input[ID], state: DomainPermissionsState): DomainPermissions = js.native
  def get(name: String, id: Input[ID], state: DomainPermissionsState, opts: CustomResourceOptions): DomainPermissions = js.native
  
  /**
    * Returns true if the given object is an instance of DomainPermissions.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domainPermissions.DomainPermissions */ Boolean = js.native
}
