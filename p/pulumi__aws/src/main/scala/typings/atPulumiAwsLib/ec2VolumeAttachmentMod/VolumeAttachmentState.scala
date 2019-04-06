package typings
package atPulumiAwsLib.ec2VolumeAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAttachmentState extends js.Object {
  /**
    * The device name to expose to the instance (for
    * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances][1] and [Device Naming on Windows Instances][2] for more information.
    */
  val deviceName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Set to `true` if you want to force the
    * volume to detach. Useful if previous attempts failed, but use this option only
    * as a last resort, as this can result in **data loss**. See
    * [Detaching an Amazon EBS Volume from an Instance][3] for more information.
    */
  val forceDetach: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * ID of the Instance to attach to
    */
  val instanceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Set this to true if you do not wish
    * to detach the volume from the instance to which it is attached at destroy
    * time, and instead just remove the attachment from Terraform state. This is
    * useful when destroying an instance which has volumes created by some other
    * means attached.
    */
  val skipDestroy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * ID of the Volume to be attached
    */
  val volumeId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VolumeAttachmentState {
  @scala.inline
  def apply(
    deviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    forceDetach: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    instanceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    skipDestroy: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    volumeId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

