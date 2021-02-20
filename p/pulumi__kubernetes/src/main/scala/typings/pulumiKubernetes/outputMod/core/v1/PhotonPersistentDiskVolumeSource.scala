package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Photon Controller persistent disk resource.
  */
@js.native
trait PhotonPersistentDiskVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String = js.native
  
  /**
    * ID that identifies Photon Controller persistent disk
    */
  var pdID: String = js.native
}
object PhotonPersistentDiskVolumeSource {
  
  @scala.inline
  def apply(fsType: String, pdID: String): PhotonPersistentDiskVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], pdID = pdID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotonPersistentDiskVolumeSource]
  }
  
  @scala.inline
  implicit class PhotonPersistentDiskVolumeSourceMutableBuilder[Self <: PhotonPersistentDiskVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdID(value: String): Self = StObject.set(x, "pdID", value.asInstanceOf[js.Any])
  }
}
