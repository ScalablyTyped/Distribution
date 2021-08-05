package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents storage that is managed by an external CSI volume driver (Beta feature)
  */
trait CSIPersistentVolumeSource extends StObject {
  
  /**
    * ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerExpandSecretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  
  /**
    * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerPublishSecretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  
  /**
    * Driver is the name of the driver to use for this volume. Required.
    */
  var driver: Input[String]
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodePublishSecretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  
  /**
    * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodeStageSecretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  
  /**
    * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Attributes of the volume to publish.
    */
  var volumeAttributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
    */
  var volumeHandle: Input[String]
}
object CSIPersistentVolumeSource {
  
  inline def apply(driver: Input[String], volumeHandle: Input[String]): CSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], volumeHandle = volumeHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIPersistentVolumeSource]
  }
  
  extension [Self <: CSIPersistentVolumeSource](x: Self) {
    
    inline def setControllerExpandSecretRef(value: Input[SecretReference]): Self = StObject.set(x, "controllerExpandSecretRef", value.asInstanceOf[js.Any])
    
    inline def setControllerExpandSecretRefUndefined: Self = StObject.set(x, "controllerExpandSecretRef", js.undefined)
    
    inline def setControllerPublishSecretRef(value: Input[SecretReference]): Self = StObject.set(x, "controllerPublishSecretRef", value.asInstanceOf[js.Any])
    
    inline def setControllerPublishSecretRefUndefined: Self = StObject.set(x, "controllerPublishSecretRef", js.undefined)
    
    inline def setDriver(value: Input[String]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setNodePublishSecretRef(value: Input[SecretReference]): Self = StObject.set(x, "nodePublishSecretRef", value.asInstanceOf[js.Any])
    
    inline def setNodePublishSecretRefUndefined: Self = StObject.set(x, "nodePublishSecretRef", js.undefined)
    
    inline def setNodeStageSecretRef(value: Input[SecretReference]): Self = StObject.set(x, "nodeStageSecretRef", value.asInstanceOf[js.Any])
    
    inline def setNodeStageSecretRefUndefined: Self = StObject.set(x, "nodeStageSecretRef", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setVolumeAttributes(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "volumeAttributes", value.asInstanceOf[js.Any])
    
    inline def setVolumeAttributesUndefined: Self = StObject.set(x, "volumeAttributes", js.undefined)
    
    inline def setVolumeHandle(value: Input[String]): Self = StObject.set(x, "volumeHandle", value.asInstanceOf[js.Any])
  }
}
