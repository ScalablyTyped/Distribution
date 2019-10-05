package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a vSphere volume resource.
  */
trait VsphereVirtualDiskVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
    */
  var storagePolicyID: js.UndefOr[Input[String]] = js.undefined
  /**
    * Storage Policy Based Management (SPBM) profile name.
    */
  var storagePolicyName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Path that identifies vSphere volume vmdk
    */
  var volumePath: Input[String]
}

object VsphereVirtualDiskVolumeSource {
  @scala.inline
  def apply(
    volumePath: Input[String],
    fsType: Input[String] = null,
    storagePolicyID: Input[String] = null,
    storagePolicyName: Input[String] = null
  ): VsphereVirtualDiskVolumeSource = {
    val __obj = js.Dynamic.literal(volumePath = volumePath.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (storagePolicyID != null) __obj.updateDynamic("storagePolicyID")(storagePolicyID.asInstanceOf[js.Any])
    if (storagePolicyName != null) __obj.updateDynamic("storagePolicyName")(storagePolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsphereVirtualDiskVolumeSource]
  }
}

