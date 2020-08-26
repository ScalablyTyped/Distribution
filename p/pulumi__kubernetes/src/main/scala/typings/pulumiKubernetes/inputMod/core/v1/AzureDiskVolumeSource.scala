package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var cachingMode: js.UndefOr[Input[String]] = js.native
  /**
    * The Name of the data disk in the blob storage
    */
  var diskName: Input[String] = js.native
  /**
    * The URI the data disk in the blob storage
    */
  var diskURI: Input[String] = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
    */
  var kind: js.UndefOr[Input[String]] = js.native
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
}

object AzureDiskVolumeSource {
  @scala.inline
  def apply(diskName: Input[String], diskURI: Input[String]): AzureDiskVolumeSource = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any], diskURI = diskURI.asInstanceOf[js.Any])
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
    def setDiskName(value: Input[String]): Self = this.set("diskName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiskURI(value: Input[String]): Self = this.set("diskURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setCachingMode(value: Input[String]): Self = this.set("cachingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachingMode: Self = this.set("cachingMode", js.undefined)
    @scala.inline
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    @scala.inline
    def setKind(value: Input[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
  
}

