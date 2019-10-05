package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Persistent Disk resource in Google Compute Engine.
  *
  * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE
  * project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only
  * many times. GCE PDs support ownership management and SELinux relabeling.
  */
trait GCEPersistentDiskVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The partition in the volume that you want to mount. If omitted, the default is to mount by
    * volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly,
    * the volume partition for /dev/sda is "0" (or you can leave the property empty). More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var partition: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var pdName: Input[String]
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
    * info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
}

object GCEPersistentDiskVolumeSource {
  @scala.inline
  def apply(
    pdName: Input[String],
    fsType: Input[String] = null,
    partition: Input[Double] = null,
    readOnly: Input[Boolean] = null
  ): GCEPersistentDiskVolumeSource = {
    val __obj = js.Dynamic.literal(pdName = pdName.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCEPersistentDiskVolumeSource]
  }
}

