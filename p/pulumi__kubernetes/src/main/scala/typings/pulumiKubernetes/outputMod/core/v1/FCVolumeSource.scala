package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write
  * once. Fibre Channel volumes support ownership management and SELinux relabeling.
  */
trait FCVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: String
  /**
    * Optional: FC target lun number
    */
  val lun: Double
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean
  /**
    * Optional: FC target worldwide names (WWNs)
    */
  val targetWWNs: js.Array[String]
  /**
    * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of
    * targetWWNs and lun must be set, but not both simultaneously.
    */
  val wwids: js.Array[String]
}

object FCVolumeSource {
  @scala.inline
  def apply(
    fsType: String,
    lun: Double,
    readOnly: Boolean,
    targetWWNs: js.Array[String],
    wwids: js.Array[String]
  ): FCVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], targetWWNs = targetWWNs.asInstanceOf[js.Any], wwids = wwids.asInstanceOf[js.Any])
    __obj.asInstanceOf[FCVolumeSource]
  }
}

