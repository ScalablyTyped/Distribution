package typings
package atPulumiAwsLib.applicationloadbalancingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroupAttachment")
@js.native
class TargetGroupAttachment protected ()
  extends atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment {
  /**
    * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/applicationloadbalancing", "TargetGroupAttachment")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentState
  ): atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod.TargetGroupAttachment = js.native
}

