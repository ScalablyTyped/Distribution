package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Photon Controller persistent disk resource.
  */
trait PhotonPersistentDiskVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: String
  /**
    * ID that identifies Photon Controller persistent disk
    */
  val pdID: String
}

object PhotonPersistentDiskVolumeSource {
  @scala.inline
  def apply(fsType: String, pdID: String): PhotonPersistentDiskVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], pdID = pdID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhotonPersistentDiskVolumeSource]
  }
}

