package typings.pulumiAws.elasticloadbalancingAttachmentMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/attachment", "Attachment")
@js.native
class Attachment protected () extends CustomResource {
  /**
    * Create a Attachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  /** @deprecated aws.elasticloadbalancing.Attachment has been deprecated in favor of aws.elb.Attachment */
  def this(name: String, args: AttachmentArgs) = this()
  def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the ELB.
    */
  val elb: Output_[String] = js.native
  /**
    * Instance ID to place in the ELB pool.
    */
  val instance: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/attachment", "Attachment")
@js.native
object Attachment extends js.Object {
  /**
    * Get an existing Attachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Attachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Attachment = js.native
  def get(name: String, id: Input[ID], state: AttachmentState): Attachment = js.native
  def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): Attachment = js.native
  /**
    * Returns true if the given object is an instance of Attachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/attachment.Attachment */ Boolean = js.native
}

