package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
  */
@js.native
trait AzureDiskVolumeSource extends js.Object {
  /**
    * Host Caching mode: None, Read Only, Read Write.
    */
  var cachingMode: String = js.native
  /**
    * The Name of the data disk in the blob storage
    */
  var diskName: String = js.native
  /**
    * The URI the data disk in the blob storage
    */
  var diskURI: String = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String = js.native
  /**
    * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
    */
  var kind: String = js.native
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean = js.native
}

object AzureDiskVolumeSource {
  @scala.inline
  def apply(
    cachingMode: String,
    diskName: String,
    diskURI: String,
    fsType: String,
    kind: String,
    readOnly: Boolean
  ): AzureDiskVolumeSource = {
    val __obj = js.Dynamic.literal(cachingMode = cachingMode.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], diskURI = diskURI.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureDiskVolumeSource]
  }
  @scala.inline
  implicit class AzureDiskVolumeSourceOps[Self <: AzureDiskVolumeSource] (val x: Self) extends AnyVal {
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
    def setCachingMode(value: String): Self = this.set("cachingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiskName(value: String): Self = this.set("diskName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiskURI(value: String): Self = this.set("diskURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setFsType(value: String): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
  }
  
}

