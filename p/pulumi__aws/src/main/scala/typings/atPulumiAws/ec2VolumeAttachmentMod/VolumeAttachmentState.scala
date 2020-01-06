package typings.atPulumiAws.ec2VolumeAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeAttachmentState extends js.Object {
  /**
    * The device name to expose to the instance (for
    * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances][1] and [Device Naming on Windows Instances][2] for more information.
    */
  val deviceName: js.UndefOr[Input[String]] = js.native
  /**
    * Set to `true` if you want to force the
    * volume to detach. Useful if previous attempts failed, but use this option only
    * as a last resort, as this can result in **data loss**. See
    * [Detaching an Amazon EBS Volume from an Instance][3] for more information.
    */
  val forceDetach: js.UndefOr[Input[Boolean]] = js.native
  /**
    * ID of the Instance to attach to
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  /**
    * Set this to true if you do not wish
    * to detach the volume from the instance to which it is attached at destroy
    * time, and instead just remove the attachment from this provider state. This is
    * useful when destroying an instance which has volumes created by some other
    * means attached.
    */
  val skipDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * ID of the Volume to be attached
    */
  val volumeId: js.UndefOr[Input[String]] = js.native
}

object VolumeAttachmentState {
  @scala.inline
  def apply(
    deviceName: Input[String] = null,
    forceDetach: Input[Boolean] = null,
    instanceId: Input[String] = null,
    skipDestroy: Input[Boolean] = null,
    volumeId: Input[String] = null
  ): VolumeAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (forceDetach != null) __obj.updateDynamic("forceDetach")(forceDetach.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (skipDestroy != null) __obj.updateDynamic("skipDestroy")(skipDestroy.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentState]
  }
}

