package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a StorageOS persistent volume resource.
  */
trait StorageOSVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: String
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean
  /**
    * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not
    * specified, default values will be attempted.
    */
  val secretRef: LocalObjectReference
  /**
    * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only
    * unique within a namespace.
    */
  val volumeName: String
  /**
    * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is
    * specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping
    * to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to
    * override the default behaviour. Set to "default" if you are not using namespaces within
    * StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
    */
  val volumeNamespace: String
}

object StorageOSVolumeSource {
  @scala.inline
  def apply(
    fsType: String,
    readOnly: Boolean,
    secretRef: LocalObjectReference,
    volumeName: String,
    volumeNamespace: String
  ): StorageOSVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], volumeName = volumeName.asInstanceOf[js.Any], volumeNamespace = volumeNamespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageOSVolumeSource]
  }
}

