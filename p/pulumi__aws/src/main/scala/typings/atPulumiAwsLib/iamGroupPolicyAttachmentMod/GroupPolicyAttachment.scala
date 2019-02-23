package typings
package atPulumiAwsLib.iamGroupPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/groupPolicyAttachment", "GroupPolicyAttachment")
@js.native
class GroupPolicyAttachment protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a GroupPolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: GroupPolicyAttachmentArgs) = this()
  def this(name: java.lang.String, args: GroupPolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The group the policy should be applied to
    */
  val group: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.iamGroupMod.Group] = js.native
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/groupPolicyAttachment", "GroupPolicyAttachment")
@js.native
object GroupPolicyAttachment extends js.Object {
  /**
    * Get an existing GroupPolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachmentState
  ): atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamGroupPolicyAttachmentMod.GroupPolicyAttachment = js.native
}

