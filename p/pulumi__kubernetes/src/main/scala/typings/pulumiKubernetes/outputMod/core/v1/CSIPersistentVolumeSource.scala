package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  var controllerExpandSecretRef: SecretReference
  
  /**
    * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerPublishSecretRef: SecretReference
  
  /**
    * Driver is the name of the driver to use for this volume. Required.
    */
  var driver: String
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
    */
  var fsType: String
  
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodePublishSecretRef: SecretReference
  
  /**
    * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
    */
  var nodeStageSecretRef: SecretReference
  
  /**
    * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
    */
  var readOnly: Boolean
  
  /**
    * Attributes of the volume to publish.
    */
  var volumeAttributes: StringDictionary[String]
  
  /**
    * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
    */
  var volumeHandle: String
}
object CSIPersistentVolumeSource {
  
  inline def apply(
    controllerExpandSecretRef: SecretReference,
    controllerPublishSecretRef: SecretReference,
    driver: String,
    fsType: String,
    nodePublishSecretRef: SecretReference,
    nodeStageSecretRef: SecretReference,
    readOnly: Boolean,
    volumeAttributes: StringDictionary[String],
    volumeHandle: String
  ): CSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(controllerExpandSecretRef = controllerExpandSecretRef.asInstanceOf[js.Any], controllerPublishSecretRef = controllerPublishSecretRef.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], nodePublishSecretRef = nodePublishSecretRef.asInstanceOf[js.Any], nodeStageSecretRef = nodeStageSecretRef.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], volumeAttributes = volumeAttributes.asInstanceOf[js.Any], volumeHandle = volumeHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIPersistentVolumeSource]
  }
  
  extension [Self <: CSIPersistentVolumeSource](x: Self) {
    
    inline def setControllerExpandSecretRef(value: SecretReference): Self = StObject.set(x, "controllerExpandSecretRef", value.asInstanceOf[js.Any])
    
    inline def setControllerPublishSecretRef(value: SecretReference): Self = StObject.set(x, "controllerPublishSecretRef", value.asInstanceOf[js.Any])
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setNodePublishSecretRef(value: SecretReference): Self = StObject.set(x, "nodePublishSecretRef", value.asInstanceOf[js.Any])
    
    inline def setNodeStageSecretRef(value: SecretReference): Self = StObject.set(x, "nodeStageSecretRef", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setVolumeAttributes(value: StringDictionary[String]): Self = StObject.set(x, "volumeAttributes", value.asInstanceOf[js.Any])
    
    inline def setVolumeHandle(value: String): Self = StObject.set(x, "volumeHandle", value.asInstanceOf[js.Any])
  }
}
