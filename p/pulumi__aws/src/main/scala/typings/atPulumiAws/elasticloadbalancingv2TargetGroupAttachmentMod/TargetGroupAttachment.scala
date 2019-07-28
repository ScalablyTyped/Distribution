package typings.atPulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment", "TargetGroupAttachment")
@js.native
class TargetGroupAttachment protected () extends CustomResource {
  /**
    * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TargetGroupAttachmentArgs) = this()
  def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
  /**
    * The Availability Zone where the IP address of the target is to be registered.
    */
  val availabilityZone: Output[js.UndefOr[String]] = js.native
  /**
    * The port on which targets receive traffic.
    */
  val port: Output[js.UndefOr[Double]] = js.native
  /**
    * The ARN of the target group with which to register targets
    */
  val targetGroupArn: Output[String] = js.native
  /**
    * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
    */
  val targetId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment", "TargetGroupAttachment")
@js.native
object TargetGroupAttachment extends js.Object {
  /**
    * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): TargetGroupAttachment = js.native
  def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): TargetGroupAttachment = js.native
  def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): TargetGroupAttachment = js.native
  /**
    * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
}

