package typings.atPulumiAws.ec2VolumeAttachmentMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/volumeAttachment", "VolumeAttachment")
@js.native
class VolumeAttachment protected () extends CustomResource {
  /**
    * Create a VolumeAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VolumeAttachmentArgs) = this()
  def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
  /**
    * The device name to expose to the instance (for
    * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances][1] and [Device Naming on Windows Instances][2] for more information.
    */
  val deviceName: Output[String] = js.native
  /**
    * Set to `true` if you want to force the
    * volume to detach. Useful if previous attempts failed, but use this option only
    * as a last resort, as this can result in **data loss**. See
    * [Detaching an Amazon EBS Volume from an Instance][3] for more information.
    */
  val forceDetach: Output[js.UndefOr[Boolean]] = js.native
  /**
    * ID of the Instance to attach to
    */
  val instanceId: Output[String] = js.native
  val skipDestroy: Output[js.UndefOr[Boolean]] = js.native
  /**
    * ID of the Volume to be attached
    */
  val volumeId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/volumeAttachment", "VolumeAttachment")
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
  def get(name: String, id: Input[ID]): VolumeAttachment = js.native
  def get(name: String, id: Input[ID], state: VolumeAttachmentState): VolumeAttachment = js.native
  def get(name: String, id: Input[ID], state: VolumeAttachmentState, opts: CustomResourceOptions): VolumeAttachment = js.native
  /**
    * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/volumeAttachment.VolumeAttachment */ Boolean = js.native
}

