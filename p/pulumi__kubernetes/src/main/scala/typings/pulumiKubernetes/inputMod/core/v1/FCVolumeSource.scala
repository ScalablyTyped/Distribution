package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
  */
trait FCVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Optional: FC target lun number
    */
  var lun: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Optional: FC target worldwide names (WWNs)
    */
  var targetWWNs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
    */
  var wwids: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object FCVolumeSource {
  
  @scala.inline
  def apply(): FCVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FCVolumeSource]
  }
  
  @scala.inline
  implicit class FCVolumeSourceMutableBuilder[Self <: FCVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    @scala.inline
    def setLun(value: Input[Double]): Self = StObject.set(x, "lun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLunUndefined: Self = StObject.set(x, "lun", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setTargetWWNs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "targetWWNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWWNsUndefined: Self = StObject.set(x, "targetWWNs", js.undefined)
    
    @scala.inline
    def setTargetWWNsVarargs(value: Input[String]*): Self = StObject.set(x, "targetWWNs", js.Array(value :_*))
    
    @scala.inline
    def setWwids(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "wwids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWwidsUndefined: Self = StObject.set(x, "wwids", js.undefined)
    
    @scala.inline
    def setWwidsVarargs(value: Input[String]*): Self = StObject.set(x, "wwids", js.Array(value :_*))
  }
}
