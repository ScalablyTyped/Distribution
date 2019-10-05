package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var path: Input[String]
  /**
    * Type for HostPath Volume Defaults to "" More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object HostPathVolumeSource {
  @scala.inline
  def apply(path: Input[String], `type`: Input[String] = null): HostPathVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPathVolumeSource]
  }
}

