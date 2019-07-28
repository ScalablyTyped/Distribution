package typings.atPulumiAws.elasticloadbalancingv2Mod

import typings.atPulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typings.atPulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachmentState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancingv2", "TargetGroupAttachment")
@js.native
class TargetGroupAttachment protected ()
  extends typings.atPulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment {
  /**
    * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TargetGroupAttachmentArgs) = this()
  def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancingv2", "TargetGroupAttachment")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
  def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typings.atPulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
  def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.elasticloadbalancingv2TargetGroupAttachmentMod.TargetGroupAttachment = js.native
  /**
    * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
}

