package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ScaleIOVolumeSource represents a persistent ScaleIO volume
  */
trait ScaleIOVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The host address of the ScaleIO API Gateway.
    */
  var gateway: Input[String]
  
  /**
    * The name of the ScaleIO Protection Domain for the configured storage.
    */
  var protectionDomain: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
    */
  var secretRef: Input[LocalObjectReference]
  
  /**
    * Flag to enable/disable SSL communication with Gateway, default false
    */
  var sslEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
    */
  var storageMode: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ScaleIO Storage Pool associated with the protection domain.
    */
  var storagePool: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the storage system as configured in ScaleIO.
    */
  var system: Input[String]
  
  /**
    * The name of a volume already created in the ScaleIO system that is associated with this volume source.
    */
  var volumeName: js.UndefOr[Input[String]] = js.undefined
}
object ScaleIOVolumeSource {
  
  inline def apply(gateway: Input[String], secretRef: Input[LocalObjectReference], system: Input[String]): ScaleIOVolumeSource = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleIOVolumeSource]
  }
  
  extension [Self <: ScaleIOVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setGateway(value: Input[String]): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setProtectionDomain(value: Input[String]): Self = StObject.set(x, "protectionDomain", value.asInstanceOf[js.Any])
    
    inline def setProtectionDomainUndefined: Self = StObject.set(x, "protectionDomain", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSecretRef(value: Input[LocalObjectReference]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSslEnabled(value: Input[Boolean]): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    inline def setStorageMode(value: Input[String]): Self = StObject.set(x, "storageMode", value.asInstanceOf[js.Any])
    
    inline def setStorageModeUndefined: Self = StObject.set(x, "storageMode", js.undefined)
    
    inline def setStoragePool(value: Input[String]): Self = StObject.set(x, "storagePool", value.asInstanceOf[js.Any])
    
    inline def setStoragePoolUndefined: Self = StObject.set(x, "storagePool", js.undefined)
    
    inline def setSystem(value: Input[String]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setVolumeName(value: Input[String]): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
    
    inline def setVolumeNameUndefined: Self = StObject.set(x, "volumeName", js.undefined)
  }
}
