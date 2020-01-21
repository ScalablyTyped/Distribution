package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var cachingMode: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Name of the data disk in the blob storage
    */
  var diskName: Input[String]
  /**
    * The URI the data disk in the blob storage
    */
  var diskURI: Input[String]
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob
    * disk per storage account  Managed: azure managed data disk (only in managed availability
    * set). defaults to shared
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
}

object AzureDiskVolumeSource {
  @scala.inline
  def apply(
    diskName: Input[String],
    diskURI: Input[String],
    cachingMode: Input[String] = null,
    fsType: Input[String] = null,
    kind: Input[String] = null,
    readOnly: Input[Boolean] = null
  ): AzureDiskVolumeSource = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any], diskURI = diskURI.asInstanceOf[js.Any])
    if (cachingMode != null) __obj.updateDynamic("cachingMode")(cachingMode.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureDiskVolumeSource]
  }
}

