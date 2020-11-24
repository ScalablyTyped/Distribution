package typings.pulumiAws.identityPolicyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ses/identityPolicy", "IdentityPolicy")
@js.native
class IdentityPolicy protected () extends CustomResource {
  /**
    * Create a IdentityPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IdentityPolicyArgs) = this()
  def this(name: String, args: IdentityPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Name or Amazon Resource Name (ARN) of the SES Identity.
    */
  val identity: Output_[String] = js.native
  
  /**
    * Name of the policy.
    */
  val name: Output_[String] = js.native
  
  /**
    * JSON string of the policy.
    */
  val policy: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ses/identityPolicy", "IdentityPolicy")
@js.native
object IdentityPolicy extends js.Object {
  
  /**
    * Get an existing IdentityPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): IdentityPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IdentityPolicy = js.native
  def get(name: String, id: Input[ID], state: IdentityPolicyState): IdentityPolicy = js.native
  def get(name: String, id: Input[ID], state: IdentityPolicyState, opts: CustomResourceOptions): IdentityPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of IdentityPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean = js.native
}
