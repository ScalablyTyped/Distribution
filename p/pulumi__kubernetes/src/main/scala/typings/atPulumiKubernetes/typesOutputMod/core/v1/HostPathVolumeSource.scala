package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a host path mapped into a pod. Host path volumes do not support ownership
  * management or SELinux relabeling.
  */
trait HostPathVolumeSource extends js.Object {
  /**
    * Path of the directory on the host. If the path is a symlink, it will follow the link to the
    * real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  val path: String
  /**
    * Type for HostPath Volume Defaults to "" More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  val `type`: String
}

object HostPathVolumeSource {
  @scala.inline
  def apply(path: String, `type`: String): HostPathVolumeSource = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HostPathVolumeSource]
  }
}

