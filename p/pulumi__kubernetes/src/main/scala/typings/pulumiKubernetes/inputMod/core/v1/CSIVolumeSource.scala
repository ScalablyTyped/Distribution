package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a source location of a volume to mount, managed by an external CSI driver
  */
@js.native
trait CSIVolumeSource extends StObject {
  
  /**
    * Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
    */
  var driver: Input[String] = js.native
  
  /**
    * Filesystem type to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
    */
  var nodePublishSecretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  
  /**
    * Specifies a read-only configuration for the volume. Defaults to false (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
    */
  var volumeAttributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object CSIVolumeSource {
  
  @scala.inline
  def apply(driver: Input[String]): CSIVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIVolumeSource]
  }
  
  @scala.inline
  implicit class CSIVolumeSourceMutableBuilder[Self <: CSIVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriver(value: Input[String]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    @scala.inline
    def setNodePublishSecretRef(value: Input[LocalObjectReference]): Self = StObject.set(x, "nodePublishSecretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePublishSecretRefUndefined: Self = StObject.set(x, "nodePublishSecretRef", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setVolumeAttributes(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "volumeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeAttributesUndefined: Self = StObject.set(x, "volumeAttributes", js.undefined)
  }
}
