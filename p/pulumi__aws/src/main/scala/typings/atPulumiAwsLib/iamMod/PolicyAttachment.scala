package typings
package atPulumiAwsLib.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "PolicyAttachment")
@js.native
class PolicyAttachment protected ()
  extends atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachment {
  /**
    * Create a PolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachmentArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.iamPolicyAttachmentMod.PolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iam", "PolicyAttachment")
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

