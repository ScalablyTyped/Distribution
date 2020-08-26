package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a vSphere volume resource.
  */
@js.native
trait VsphereVirtualDiskVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
    */
  var storagePolicyID: js.UndefOr[Input[String]] = js.native
  /**
    * Storage Policy Based Management (SPBM) profile name.
    */
  var storagePolicyName: js.UndefOr[Input[String]] = js.native
  /**
    * Path that identifies vSphere volume vmdk
    */
  var volumePath: Input[String] = js.native
}

object VsphereVirtualDiskVolumeSource {
  @scala.inline
  def apply(volumePath: Input[String]): VsphereVirtualDiskVolumeSource = {
    val __obj = js.Dynamic.literal(volumePath = volumePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsphereVirtualDiskVolumeSource]
  }
  @scala.inline
  implicit class VsphereVirtualDiskVolumeSourceOps[Self <: VsphereVirtualDiskVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVolumePath(value: Input[String]): Self = this.set("volumePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    @scala.inline
    def setStoragePolicyID(value: Input[String]): Self = this.set("storagePolicyID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoragePolicyID: Self = this.set("storagePolicyID", js.undefined)
    @scala.inline
    def setStoragePolicyName(value: Input[String]): Self = this.set("storagePolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoragePolicyName: Self = this.set("storagePolicyName", js.undefined)
  }
  
}

