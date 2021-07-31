package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
  */
trait CephFSPersistentVolumeSource extends StObject {
  
  /**
    * Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var monitors: Input[js.Array[Input[String]]]
  
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretFile: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  
  /**
    * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.undefined
}
object CephFSPersistentVolumeSource {
  
  @scala.inline
  def apply(monitors: Input[js.Array[Input[String]]]): CephFSPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(monitors = monitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CephFSPersistentVolumeSource]
  }
  
  @scala.inline
  implicit class CephFSPersistentVolumeSourceMutableBuilder[Self <: CephFSPersistentVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitors(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "monitors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorsVarargs(value: Input[String]*): Self = StObject.set(x, "monitors", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSecretFile(value: Input[String]): Self = StObject.set(x, "secretFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretFileUndefined: Self = StObject.set(x, "secretFile", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[SecretReference]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
    
    @scala.inline
    def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
