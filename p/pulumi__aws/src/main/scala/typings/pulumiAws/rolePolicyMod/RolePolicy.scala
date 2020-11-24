package typings.pulumiAws.rolePolicyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam/rolePolicy", "RolePolicy")
@js.native
class RolePolicy protected () extends CustomResource {
  /**
    * Create a RolePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RolePolicyArgs) = this()
  def this(name: String, args: RolePolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the role policy. If omitted, this provider will
    * assign a random, unique name.
    */
  val name: Output_[String] = js.native
  
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The policy document. This is a JSON formatted string.
    */
  val policy: Output_[String] = js.native
  
  /**
    * The IAM role to attach to the policy.
    */
  val role: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/iam/rolePolicy", "RolePolicy")
@js.native
object RolePolicy extends js.Object {
  
  /**
    * Get an existing RolePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RolePolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RolePolicy = js.native
  def get(name: String, id: Input[ID], state: RolePolicyState): RolePolicy = js.native
  def get(name: String, id: Input[ID], state: RolePolicyState, opts: CustomResourceOptions): RolePolicy = js.native
  
  /**
    * Returns true if the given object is an instance of RolePolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/rolePolicy.RolePolicy */ Boolean = js.native
}
