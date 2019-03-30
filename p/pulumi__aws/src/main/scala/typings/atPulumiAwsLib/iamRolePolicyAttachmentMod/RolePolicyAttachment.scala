package typings
package atPulumiAwsLib.iamRolePolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/rolePolicyAttachment", "RolePolicyAttachment")
@js.native
class RolePolicyAttachment protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a RolePolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RolePolicyAttachmentArgs) = this()
  def this(name: java.lang.String, args: RolePolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * The role the policy should be applied to
    */
  val role: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/rolePolicyAttachment", "RolePolicyAttachment")
@js.native
object RolePolicyAttachment extends js.Object {
  /**
    * Get an existing RolePolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachmentState
  ): atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamRolePolicyAttachmentMod.RolePolicyAttachment = js.native
}

