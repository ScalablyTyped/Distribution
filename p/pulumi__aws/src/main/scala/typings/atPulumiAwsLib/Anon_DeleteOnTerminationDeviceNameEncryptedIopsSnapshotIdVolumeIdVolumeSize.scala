package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeIdVolumeSize extends js.Object {
  var deleteOnTermination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var deviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var encrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var iops: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var snapshotId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var volumeId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var volumeSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var volumeType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeIdVolumeSize {
  @scala.inline
  def apply(
    deviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    deleteOnTermination: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    encrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    iops: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    snapshotId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    volumeId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    volumeSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    volumeType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeIdVolumeSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeIdVolumeSize]
  }
}

