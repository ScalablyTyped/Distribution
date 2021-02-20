package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
  */
@js.native
trait FCVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String = js.native
  
  /**
    * Optional: FC target lun number
    */
  var lun: Double = js.native
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean = js.native
  
  /**
    * Optional: FC target worldwide names (WWNs)
    */
  var targetWWNs: js.Array[String] = js.native
  
  /**
    * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
    */
  var wwids: js.Array[String] = js.native
}
object FCVolumeSource {
  
  @scala.inline
  def apply(
    fsType: String,
    lun: Double,
    readOnly: Boolean,
    targetWWNs: js.Array[String],
    wwids: js.Array[String]
  ): FCVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], targetWWNs = targetWWNs.asInstanceOf[js.Any], wwids = wwids.asInstanceOf[js.Any])
    __obj.asInstanceOf[FCVolumeSource]
  }
  
  @scala.inline
  implicit class FCVolumeSourceMutableBuilder[Self <: FCVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLun(value: Double): Self = StObject.set(x, "lun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWWNs(value: js.Array[String]): Self = StObject.set(x, "targetWWNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWWNsVarargs(value: String*): Self = StObject.set(x, "targetWWNs", js.Array(value :_*))
    
    @scala.inline
    def setWwids(value: js.Array[String]): Self = StObject.set(x, "wwids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWwidsVarargs(value: String*): Self = StObject.set(x, "wwids", js.Array(value :_*))
  }
}
