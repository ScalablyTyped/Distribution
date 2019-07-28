package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
  */
trait AzureDiskVolumeSource extends js.Object {
  /**
    * Host Caching mode: None, Read Only, Read Write.
    */
  val cachingMode: String
  /**
    * The Name of the data disk in the blob storage
    */
  val diskName: String
  /**
    * The URI the data disk in the blob storage
    */
  val diskURI: String
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: String
  /**
    * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob
    * disk per storage account  Managed: azure managed data disk (only in managed availability
    * set). defaults to shared
    */
  val kind: String
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean
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
    val __obj = js.Dynamic.literal(cachingMode = cachingMode, diskName = diskName, diskURI = diskURI, fsType = fsType, kind = kind, readOnly = readOnly)
  
    __obj.asInstanceOf[AzureDiskVolumeSource]
  }
}

