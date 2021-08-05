package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Photon Controller persistent disk resource.
  */
trait PhotonPersistentDiskVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * ID that identifies Photon Controller persistent disk
    */
  var pdID: Input[String]
}
object PhotonPersistentDiskVolumeSource {
  
  inline def apply(pdID: Input[String]): PhotonPersistentDiskVolumeSource = {
    val __obj = js.Dynamic.literal(pdID = pdID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotonPersistentDiskVolumeSource]
  }
  
  extension [Self <: PhotonPersistentDiskVolumeSource](x: Self) {
    
    inline def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    inline def setPdID(value: Input[String]): Self = StObject.set(x, "pdID", value.asInstanceOf[js.Any])
  }
}
