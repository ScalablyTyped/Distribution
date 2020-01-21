package typings.pulumiKubernetes.outputMod.core.v1

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
  val path: String
  /**
    * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults
    * to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val readOnly: Boolean
  /**
    * Server is the hostname or IP address of the NFS server. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val server: String
}

object NFSVolumeSource {
  @scala.inline
  def apply(path: String, readOnly: Boolean, server: String): NFSVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NFSVolumeSource]
  }
}

