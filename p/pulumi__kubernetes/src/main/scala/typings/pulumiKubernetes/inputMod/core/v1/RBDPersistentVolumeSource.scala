package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var image: Input[String]
  
  /**
    * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var keyring: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var monitors: Input[js.Array[Input[String]]]
  
  /**
    * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var pool: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  
  /**
    * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.undefined
}
object RBDPersistentVolumeSource {
  
  inline def apply(image: Input[String], monitors: Input[js.Array[Input[String]]]): RBDPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], monitors = monitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RBDPersistentVolumeSource]
  }
  
  extension [Self <: RBDPersistentVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setImage(value: Input[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setKeyring(value: Input[String]): Self = StObject.set(x, "keyring", value.asInstanceOf[js.Any])
    
    inline def setKeyringUndefined: Self = StObject.set(x, "keyring", js.undefined)
    
    inline def setMonitors(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "monitors", value.asInstanceOf[js.Any])
    
    inline def setMonitorsVarargs(value: Input[String]*): Self = StObject.set(x, "monitors", js.Array(value :_*))
    
    inline def setPool(value: Input[String]): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSecretRef(value: Input[SecretReference]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
    
    inline def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
