package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Optional: FC target lun number
    */
  var lun: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Optional: FC target worldwide names (WWNs)
    */
  var targetWWNs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of
    * targetWWNs and lun must be set, but not both simultaneously.
    */
  var wwids: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object FCVolumeSource {
  @scala.inline
  def apply(
    fsType: Input[String] = null,
    lun: Input[Double] = null,
    readOnly: Input[Boolean] = null,
    targetWWNs: Input[js.Array[Input[String]]] = null,
    wwids: Input[js.Array[Input[String]]] = null
  ): FCVolumeSource = {
    val __obj = js.Dynamic.literal()
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (lun != null) __obj.updateDynamic("lun")(lun.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (targetWWNs != null) __obj.updateDynamic("targetWWNs")(targetWWNs.asInstanceOf[js.Any])
    if (wwids != null) __obj.updateDynamic("wwids")(wwids.asInstanceOf[js.Any])
    __obj.asInstanceOf[FCVolumeSource]
  }
}

