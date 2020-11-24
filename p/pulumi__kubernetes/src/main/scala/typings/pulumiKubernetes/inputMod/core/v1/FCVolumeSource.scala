package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
  */
@js.native
trait FCVolumeSource extends js.Object {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Optional: FC target lun number
    */
  var lun: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Optional: FC target worldwide names (WWNs)
    */
  var targetWWNs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
    */
  var wwids: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object FCVolumeSource {
  
  @scala.inline
  def apply(): FCVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FCVolumeSource]
  }
  
  @scala.inline
  implicit class FCVolumeSourceOps[Self <: FCVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    
    @scala.inline
    def setLun(value: Input[Double]): Self = this.set("lun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLun: Self = this.set("lun", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setTargetWWNsVarargs(value: Input[String]*): Self = this.set("targetWWNs", js.Array(value :_*))
    
    @scala.inline
    def setTargetWWNs(value: Input[js.Array[Input[String]]]): Self = this.set("targetWWNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetWWNs: Self = this.set("targetWWNs", js.undefined)
    
    @scala.inline
    def setWwidsVarargs(value: Input[String]*): Self = this.set("wwids", js.Array(value :_*))
    
    @scala.inline
    def setWwids(value: Input[js.Array[Input[String]]]): Self = this.set("wwids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWwids: Self = this.set("wwids", js.undefined)
  }
}
