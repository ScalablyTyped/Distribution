package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
  */
@js.native
trait CephFSVolumeSource extends js.Object {
  
  /**
    * Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var monitors: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  var path: js.UndefOr[Input[String]] = js.native
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretFile: js.UndefOr[Input[String]] = js.native
  
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  
  /**
    * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.native
}
object CephFSVolumeSource {
  
  @scala.inline
  def apply(monitors: Input[js.Array[Input[String]]]): CephFSVolumeSource = {
    val __obj = js.Dynamic.literal(monitors = monitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CephFSVolumeSource]
  }
  
  @scala.inline
  implicit class CephFSVolumeSourceOps[Self <: CephFSVolumeSource] (val x: Self) extends AnyVal {
    
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
    def setMonitorsVarargs(value: Input[String]*): Self = this.set("monitors", js.Array(value :_*))
    
    @scala.inline
    def setMonitors(value: Input[js.Array[Input[String]]]): Self = this.set("monitors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSecretFile(value: Input[String]): Self = this.set("secretFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretFile: Self = this.set("secretFile", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[LocalObjectReference]): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretRef: Self = this.set("secretRef", js.undefined)
    
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
