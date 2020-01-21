package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support
  * ownership management or SELinux relabeling.
  */
trait NFSVolumeSource extends js.Object {
  /**
    * Path that is exported by the NFS server. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var path: Input[String]
  /**
    * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults
    * to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Server is the hostname or IP address of the NFS server. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var server: Input[String]
}

object NFSVolumeSource {
  @scala.inline
  def apply(path: Input[String], server: Input[String], readOnly: Input[Boolean] = null): NFSVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFSVolumeSource]
  }
}

