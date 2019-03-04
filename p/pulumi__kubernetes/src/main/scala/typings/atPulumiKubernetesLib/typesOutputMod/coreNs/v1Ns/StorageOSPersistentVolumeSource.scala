package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a StorageOS persistent volume resource.
  */
trait StorageOSPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: java.lang.String
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: scala.Boolean
  /**
    * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not
    * specified, default values will be attempted.
    */
  val secretRef: ObjectReference
  /**
    * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only
    * unique within a namespace.
    */
  val volumeName: java.lang.String
  /**
    * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is
    * specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping
    * to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to
    * override the default behaviour. Set to "default" if you are not using namespaces within
    * StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
    */
  val volumeNamespace: java.lang.String
}

object StorageOSPersistentVolumeSource {
  @scala.inline
  def apply(
    fsType: java.lang.String,
    readOnly: scala.Boolean,
    secretRef: ObjectReference,
    volumeName: java.lang.String,
    volumeNamespace: java.lang.String
  ): StorageOSPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType, readOnly = readOnly, secretRef = secretRef, volumeName = volumeName, volumeNamespace = volumeNamespace)
  
    __obj.asInstanceOf[StorageOSPersistentVolumeSource]
  }
}

