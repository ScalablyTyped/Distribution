package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val fsType: java.lang.String
  /**
    * ID that identifies Photon Controller persistent disk
    */
  val pdID: java.lang.String
}

object PhotonPersistentDiskVolumeSource {
  @scala.inline
  def apply(fsType: java.lang.String, pdID: java.lang.String): PhotonPersistentDiskVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fsType")(fsType)
    __obj.updateDynamic("pdID")(pdID)
    __obj.asInstanceOf[PhotonPersistentDiskVolumeSource]
  }
}

