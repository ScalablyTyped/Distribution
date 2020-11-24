package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DownwardAPIVolumeFile represents information to create the file containing the pod field
  */
@js.native
trait DownwardAPIVolumeFile extends js.Object {
  
  /**
    * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelector]] = js.native
  
  /**
    * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
    */
  var path: Input[String] = js.native
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelector]] = js.native
}
object DownwardAPIVolumeFile {
  
  @scala.inline
  def apply(path: Input[String]): DownwardAPIVolumeFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIVolumeFile]
  }
  
  @scala.inline
  implicit class DownwardAPIVolumeFileOps[Self <: DownwardAPIVolumeFile] (val x: Self) extends AnyVal {
    
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
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldRef(value: Input[ObjectFieldSelector]): Self = this.set("fieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldRef: Self = this.set("fieldRef", js.undefined)
    
    @scala.inline
    def setMode(value: Input[Double]): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setResourceFieldRef(value: Input[ResourceFieldSelector]): Self = this.set("resourceFieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceFieldRef: Self = this.set("resourceFieldRef", js.undefined)
  }
}
