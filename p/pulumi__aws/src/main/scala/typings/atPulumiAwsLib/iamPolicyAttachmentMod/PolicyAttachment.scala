package typings
package atPulumiAwsLib.iamPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/policyAttachment", "PolicyAttachment")
@js.native
class PolicyAttachment protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a PolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PolicyAttachmentArgs) = this()
  def this(name: java.lang.String, args: PolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The group(s) the policy should be applied to
    */
  val groups: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.iamGroupMod.Group]]] = js.native
  /**
    * The name of the attachment. This cannot be an empty string.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * The role(s) the policy should be applied to
    */
  val roles: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.iamRoleMod.Role]]] = js.native
  /**
    * The user(s) the policy should be applied to
    */
  val users: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.iamUserMod.User]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/policyAttachment", "PolicyAttachment")
@js.native
object PolicyAttachment extends js.Object {
  /**
    * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachmentState
  ): atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachment = js.native
}

