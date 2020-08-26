package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Photon Controller persistent disk resource.
  */
@js.native
trait PhotonPersistentDiskVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String = js.native
  /**
    * ID that identifies Photon Controller persistent disk
    */
  var pdID: String = js.native
}

object PhotonPersistentDiskVolumeSource {
  @scala.inline
  def apply(fsType: String, pdID: String): PhotonPersistentDiskVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], pdID = pdID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotonPersistentDiskVolumeSource]
  }
  @scala.inline
  implicit class PhotonPersistentDiskVolumeSourceOps[Self <: PhotonPersistentDiskVolumeSource] (val x: Self) extends AnyVal {
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
    def setFsType(value: String): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPdID(value: String): Self = this.set("pdID", value.asInstanceOf[js.Any])
  }
  
}

