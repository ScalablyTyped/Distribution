package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
  */
@js.native
trait ScaleIOPersistentVolumeSource extends js.Object {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs"
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The host address of the ScaleIO API Gateway.
    */
  var gateway: Input[String] = js.native
  
  /**
    * The name of the ScaleIO Protection Domain for the configured storage.
    */
  var protectionDomain: js.UndefOr[Input[String]] = js.native
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
    */
  var secretRef: Input[SecretReference] = js.native
  
  /**
    * Flag to enable/disable SSL communication with Gateway, default false
    */
  var sslEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
    */
  var storageMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ScaleIO Storage Pool associated with the protection domain.
    */
  var storagePool: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the storage system as configured in ScaleIO.
    */
  var system: Input[String] = js.native
  
  /**
    * The name of a volume already created in the ScaleIO system that is associated with this volume source.
    */
  var volumeName: js.UndefOr[Input[String]] = js.native
}
object ScaleIOPersistentVolumeSource {
  
  @scala.inline
  def apply(gateway: Input[String], secretRef: Input[SecretReference], system: Input[String]): ScaleIOPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleIOPersistentVolumeSource]
  }
  
  @scala.inline
  implicit class ScaleIOPersistentVolumeSourceOps[Self <: ScaleIOPersistentVolumeSource] (val x: Self) extends AnyVal {
    
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
    def setGateway(value: Input[String]): Self = this.set("gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRef(value: Input[SecretReference]): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: Input[String]): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    
    @scala.inline
    def setProtectionDomain(value: Input[String]): Self = this.set("protectionDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectionDomain: Self = this.set("protectionDomain", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSslEnabled(value: Input[Boolean]): Self = this.set("sslEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslEnabled: Self = this.set("sslEnabled", js.undefined)
    
    @scala.inline
    def setStorageMode(value: Input[String]): Self = this.set("storageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageMode: Self = this.set("storageMode", js.undefined)
    
    @scala.inline
    def setStoragePool(value: Input[String]): Self = this.set("storagePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoragePool: Self = this.set("storagePool", js.undefined)
    
    @scala.inline
    def setVolumeName(value: Input[String]): Self = this.set("volumeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeName: Self = this.set("volumeName", js.undefined)
  }
}
