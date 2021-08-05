package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a vSphere volume resource.
  */
trait VsphereVirtualDiskVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
    */
  var storagePolicyID: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Storage Policy Based Management (SPBM) profile name.
    */
  var storagePolicyName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Path that identifies vSphere volume vmdk
    */
  var volumePath: Input[String]
}
object VsphereVirtualDiskVolumeSource {
  
  inline def apply(volumePath: Input[String]): VsphereVirtualDiskVolumeSource = {
    val __obj = js.Dynamic.literal(volumePath = volumePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsphereVirtualDiskVolumeSource]
  }
  
  extension [Self <: VsphereVirtualDiskVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setStoragePolicyID(value: Input[String]): Self = StObject.set(x, "storagePolicyID", value.asInstanceOf[js.Any])
    
    inline def setStoragePolicyIDUndefined: Self = StObject.set(x, "storagePolicyID", js.undefined)
    
    inline def setStoragePolicyName(value: Input[String]): Self = StObject.set(x, "storagePolicyName", value.asInstanceOf[js.Any])
    
    inline def setStoragePolicyNameUndefined: Self = StObject.set(x, "storagePolicyName", js.undefined)
    
    inline def setVolumePath(value: Input[String]): Self = StObject.set(x, "volumePath", value.asInstanceOf[js.Any])
  }
}
