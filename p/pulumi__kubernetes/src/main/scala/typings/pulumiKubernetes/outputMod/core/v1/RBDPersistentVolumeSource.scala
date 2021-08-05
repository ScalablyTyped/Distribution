package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
  */
trait RBDPersistentVolumeSource extends StObject {
  
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
    */
  var fsType: String
  
  /**
    * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var image: String
  
  /**
    * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var keyring: String
  
  /**
    * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var monitors: js.Array[String]
  
  /**
    * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var pool: String
  
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var readOnly: Boolean
  
  /**
    * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var secretRef: SecretReference
  
  /**
    * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var user: String
}
object RBDPersistentVolumeSource {
  
  inline def apply(
    fsType: String,
    image: String,
    keyring: String,
    monitors: js.Array[String],
    pool: String,
    readOnly: Boolean,
    secretRef: SecretReference,
    user: String
  ): RBDPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], keyring = keyring.asInstanceOf[js.Any], monitors = monitors.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RBDPersistentVolumeSource]
  }
  
  extension [Self <: RBDPersistentVolumeSource](x: Self) {
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setKeyring(value: String): Self = StObject.set(x, "keyring", value.asInstanceOf[js.Any])
    
    inline def setMonitors(value: js.Array[String]): Self = StObject.set(x, "monitors", value.asInstanceOf[js.Any])
    
    inline def setMonitorsVarargs(value: String*): Self = StObject.set(x, "monitors", js.Array(value :_*))
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setSecretRef(value: SecretReference): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
