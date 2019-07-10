package typings
package atPulumiAwsLib.sesIdentityPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/identityPolicy", "IdentityPolicy")
@js.native
class IdentityPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a IdentityPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: IdentityPolicyArgs) = this()
  def this(name: java.lang.String, args: IdentityPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Name or Amazon Resource Name (ARN) of the SES Identity.
    */
  val identity: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the policy.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val policy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sesIdentityPolicyMod.IdentityPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesIdentityPolicyMod.IdentityPolicyState
  ): atPulumiAwsLib.sesIdentityPolicyMod.IdentityPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesIdentityPolicyMod.IdentityPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sesIdentityPolicyMod.IdentityPolicy = js.native
  /**
    * Returns true if the given object is an instance of IdentityPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ scala.Boolean = js.native
}

