package typings.pulumiKubernetes.outputMod.core.v1

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
  var monitors: js.Array[String]
  
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  var path: String
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var readOnly: Boolean
  
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretFile: String
  
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretRef: SecretReference
  
  /**
    * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var user: String
}
object CephFSPersistentVolumeSource {
  
  @scala.inline
  def apply(
    monitors: js.Array[String],
    path: String,
    readOnly: Boolean,
    secretFile: String,
    secretRef: SecretReference,
    user: String
  ): CephFSPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(monitors = monitors.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretFile = secretFile.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CephFSPersistentVolumeSource]
  }
  
  @scala.inline
  implicit class CephFSPersistentVolumeSourceMutableBuilder[Self <: CephFSPersistentVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitors(value: js.Array[String]): Self = StObject.set(x, "monitors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorsVarargs(value: String*): Self = StObject.set(x, "monitors", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretFile(value: String): Self = StObject.set(x, "secretFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRef(value: SecretReference): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
