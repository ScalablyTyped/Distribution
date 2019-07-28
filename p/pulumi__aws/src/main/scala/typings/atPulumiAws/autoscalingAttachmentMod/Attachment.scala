package typings.atPulumiAws.autoscalingAttachmentMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling/attachment", "Attachment")
@js.native
class Attachment protected () extends CustomResource {
  /**
    * Create a Attachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AttachmentArgs) = this()
  def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of an ALB Target Group.
    */
  val albTargetGroupArn: Output[js.UndefOr[String]] = js.native
  /**
    * Name of ASG to associate with the ELB.
    */
  val autoscalingGroupName: Output[String] = js.native
  /**
    * The name of the ELB.
    */
  val elb: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/autoscaling/attachment", "Attachment")
@js.native
object Attachment extends js.Object {
  /**
    * Get an existing Attachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Attachment = js.native
  def get(name: String, id: Input[ID], state: AttachmentState): Attachment = js.native
  def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): Attachment = js.native
  /**
    * Returns true if the given object is an instance of Attachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/attachment.Attachment */ Boolean = js.native
}

