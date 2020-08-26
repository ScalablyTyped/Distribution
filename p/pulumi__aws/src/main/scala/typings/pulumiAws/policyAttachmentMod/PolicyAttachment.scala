package typings.pulumiAws.policyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/policyAttachment", "PolicyAttachment")
@js.native
class PolicyAttachment protected () extends CustomResource {
  /**
    * Create a PolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PolicyAttachmentArgs) = this()
  def this(name: String, args: PolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  /**
    * The group(s) the policy should be applied to
    */
  val groups: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The name of the attachment. This cannot be an empty string.
    */
  val name: Output_[String] = js.native
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Output_[ARN] = js.native
  /**
    * The role(s) the policy should be applied to
    */
  val roles: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The user(s) the policy should be applied to
    */
  val users: Output_[js.UndefOr[js.Array[String]]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: PolicyAttachmentState): PolicyAttachment = js.native
  def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): PolicyAttachment = js.native
  /**
    * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policyAttachment.PolicyAttachment */ Boolean = js.native
}

