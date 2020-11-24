package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a StorageOS persistent volume resource.
  */
@js.native
trait StorageOSVolumeSource extends js.Object {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  
  /**
    * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
    */
  var volumeName: js.UndefOr[Input[String]] = js.native
  
  /**
    * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
    */
  var volumeNamespace: js.UndefOr[Input[String]] = js.native
}
object StorageOSVolumeSource {
  
  @scala.inline
  def apply(): StorageOSVolumeSource = {
    val __obj = js.Dynamic.literal()
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
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[LocalObjectReference]): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretRef: Self = this.set("secretRef", js.undefined)
    
    @scala.inline
    def setVolumeName(value: Input[String]): Self = this.set("volumeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeName: Self = this.set("volumeName", js.undefined)
    
    @scala.inline
    def setVolumeNamespace(value: Input[String]): Self = this.set("volumeNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeNamespace: Self = this.set("volumeNamespace", js.undefined)
  }
}
