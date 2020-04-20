package typings.pulumiKubernetes.outputMod.core.v1

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
  val fsType: String
  /**
    * The partition in the volume that you want to mount. If omitted, the default is to mount by
    * volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly,
    * the volume partition for /dev/sda is "0" (or you can leave the property empty). More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  val partition: Double
  /**
    * Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  val pdName: String
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
    * info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  val readOnly: Boolean
}

object GCEPersistentDiskVolumeSource {
  @scala.inline
  def apply(fsType: String, partition: Double, pdName: String, readOnly: Boolean): GCEPersistentDiskVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], pdName = pdName.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCEPersistentDiskVolumeSource]
  }
}

