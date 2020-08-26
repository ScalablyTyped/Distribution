package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a StorageOS persistent volume resource.
  */
@js.native
trait StorageOSVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String = js.native
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean = js.native
  /**
    * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
    */
  var secretRef: LocalObjectReference = js.native
  /**
    * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
    */
  var volumeName: String = js.native
  /**
    * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
    */
  var volumeNamespace: String = js.native
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
  @scala.inline
  implicit class StorageOSVolumeSourceOps[Self <: StorageOSVolumeSource] (val x: Self) extends AnyVal {
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
    def setFsType(value: String): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretRef(value: LocalObjectReference): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeName(value: String): Self = this.set("volumeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeNamespace(value: String): Self = this.set("volumeNamespace", value.asInstanceOf[js.Any])
  }
  
}

