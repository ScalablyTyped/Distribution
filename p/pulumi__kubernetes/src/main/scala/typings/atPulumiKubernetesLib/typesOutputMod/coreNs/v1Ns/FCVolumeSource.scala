package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val fsType: java.lang.String
  /**
    * Optional: FC target lun number
    */
  val lun: scala.Double
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: scala.Boolean
  /**
    * Optional: FC target worldwide names (WWNs)
    */
  val targetWWNs: js.Array[java.lang.String]
  /**
    * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of
    * targetWWNs and lun must be set, but not both simultaneously.
    */
  val wwids: js.Array[java.lang.String]
}

object FCVolumeSource {
  @scala.inline
  def apply(
    fsType: java.lang.String,
    lun: scala.Double,
    readOnly: scala.Boolean,
    targetWWNs: js.Array[java.lang.String],
    wwids: js.Array[java.lang.String]
  ): FCVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fsType")(fsType)
    __obj.updateDynamic("lun")(lun)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.updateDynamic("targetWWNs")(targetWWNs)
    __obj.updateDynamic("wwids")(wwids)
    __obj.asInstanceOf[FCVolumeSource]
  }
}

