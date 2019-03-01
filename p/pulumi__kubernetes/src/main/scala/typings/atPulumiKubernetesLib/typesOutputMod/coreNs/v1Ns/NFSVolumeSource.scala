package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val path: java.lang.String
  /**
    * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults
    * to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val readOnly: scala.Boolean
  /**
    * Server is the hostname or IP address of the NFS server. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val server: java.lang.String
}

object NFSVolumeSource {
  @scala.inline
  def apply(path: java.lang.String, readOnly: scala.Boolean, server: java.lang.String): NFSVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[NFSVolumeSource]
  }
}

