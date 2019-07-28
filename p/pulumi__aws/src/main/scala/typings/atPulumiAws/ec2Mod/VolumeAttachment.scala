package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2VolumeAttachmentMod.VolumeAttachmentArgs
import typings.atPulumiAws.ec2VolumeAttachmentMod.VolumeAttachmentState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "VolumeAttachment")
@js.native
class VolumeAttachment protected ()
  extends typings.atPulumiAws.ec2VolumeAttachmentMod.VolumeAttachment {
  /**
    * Create a VolumeAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VolumeAttachmentArgs) = this()
  def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "VolumeAttachment")
@js.native
object VolumeAttachment extends js.Object {
  /**
    * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2VolumeAttachmentMod.VolumeAttachment = js.native
  def get(name: String, id: Input[ID], state: VolumeAttachmentState): typings.atPulumiAws.ec2VolumeAttachmentMod.VolumeAttachment = js.native
  def get(name: String, id: Input[ID], state: VolumeAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.ec2VolumeAttachmentMod.VolumeAttachment = js.native
  /**
    * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/volumeAttachment.VolumeAttachment */ Boolean = js.native
}

