package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val fsType: String
  /**
    * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
    */
  val storagePolicyID: String
  /**
    * Storage Policy Based Management (SPBM) profile name.
    */
  val storagePolicyName: String
  /**
    * Path that identifies vSphere volume vmdk
    */
  val volumePath: String
}

object VsphereVirtualDiskVolumeSource {
  @scala.inline
  def apply(fsType: String, storagePolicyID: String, storagePolicyName: String, volumePath: String): VsphereVirtualDiskVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType, storagePolicyID = storagePolicyID, storagePolicyName = storagePolicyName, volumePath = volumePath)
  
    __obj.asInstanceOf[VsphereVirtualDiskVolumeSource]
  }
}

