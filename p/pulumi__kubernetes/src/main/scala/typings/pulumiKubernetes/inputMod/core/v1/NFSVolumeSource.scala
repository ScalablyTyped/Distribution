package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
  */
@js.native
trait NFSVolumeSource extends js.Object {
  /**
    * Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var path: Input[String] = js.native
  /**
    * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var server: Input[String] = js.native
}

object NFSVolumeSource {
  @scala.inline
  def apply(path: Input[String], server: Input[String]): NFSVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFSVolumeSource]
  }
  @scala.inline
  implicit class NFSVolumeSourceOps[Self <: NFSVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: Input[String]): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
  
}

