package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PortworxVolumeSource represents a Portworx volume resource.
  */
@js.native
trait PortworxVolumeSource extends StObject {
  
  /**
    * FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String = js.native
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean = js.native
  
  /**
    * VolumeID uniquely identifies a Portworx volume
    */
  var volumeID: String = js.native
}
object PortworxVolumeSource {
  
  @scala.inline
  def apply(fsType: String, readOnly: Boolean, volumeID: String): PortworxVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], volumeID = volumeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortworxVolumeSource]
  }
  
  @scala.inline
  implicit class PortworxVolumeSourceMutableBuilder[Self <: PortworxVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeID(value: String): Self = StObject.set(x, "volumeID", value.asInstanceOf[js.Any])
  }
}
