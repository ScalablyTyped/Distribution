package typings
package atPulumiAwsLib.iamUserPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/userPolicyAttachment", "UserPolicyAttachment")
@js.native
class UserPolicyAttachment protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: UserPolicyAttachmentArgs) = this()
  def this(name: java.lang.String, args: UserPolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * The user the policy should be applied to
    */
  val user: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.iamUserMod.User] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/userPolicyAttachment", "UserPolicyAttachment")
@js.native
object UserPolicyAttachment extends js.Object {
  /**
    * Get an existing UserPolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentState
  ): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iamUserPolicyAttachmentMod.UserPolicyAttachment = js.native
  /**
    * Returns true if the given object is an instance of UserPolicyAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userPolicyAttachment.UserPolicyAttachment */ scala.Boolean = js.native
}

