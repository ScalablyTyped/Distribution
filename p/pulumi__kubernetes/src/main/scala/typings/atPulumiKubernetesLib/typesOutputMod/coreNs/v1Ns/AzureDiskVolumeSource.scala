package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val cachingMode: java.lang.String
  /**
    * The Name of the data disk in the blob storage
    */
  val diskName: java.lang.String
  /**
    * The URI the data disk in the blob storage
    */
  val diskURI: java.lang.String
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: java.lang.String
  /**
    * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob
    * disk per storage account  Managed: azure managed data disk (only in managed availability
    * set). defaults to shared
    */
  val kind: java.lang.String
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: scala.Boolean
}

object AzureDiskVolumeSource {
  @scala.inline
  def apply(
    cachingMode: java.lang.String,
    diskName: java.lang.String,
    diskURI: java.lang.String,
    fsType: java.lang.String,
    kind: java.lang.String,
    readOnly: scala.Boolean
  ): AzureDiskVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cachingMode")(cachingMode)
    __obj.updateDynamic("diskName")(diskName)
    __obj.updateDynamic("diskURI")(diskURI)
    __obj.updateDynamic("fsType")(fsType)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[AzureDiskVolumeSource]
  }
}

