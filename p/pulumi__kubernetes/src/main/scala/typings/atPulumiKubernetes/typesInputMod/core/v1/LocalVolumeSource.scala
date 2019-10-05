package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Local represents directly-attached storage with node affinity (Beta feature)
  */
trait LocalVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. It applies only when the Path is a block device. Must be a
    * filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The
    * default value is to auto-select a fileystem if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The full path to the volume on the node. It can be either a directory or block device
    * (disk, partition, ...).
    */
  var path: Input[String]
}

object LocalVolumeSource {
  @scala.inline
  def apply(path: Input[String], fsType: Input[String] = null): LocalVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVolumeSource]
  }
}

