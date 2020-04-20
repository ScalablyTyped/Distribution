package typings.pulumiKubernetes.outputMod.core.v1

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
  val fsType: String
  /**
    * The full path to the volume on the node. It can be either a directory or block device
    * (disk, partition, ...).
    */
  val path: String
}

object LocalVolumeSource {
  @scala.inline
  def apply(fsType: String, path: String): LocalVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVolumeSource]
  }
}

