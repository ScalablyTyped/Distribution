package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Local represents directly-attached storage with node affinity (Beta feature)
  */
@js.native
trait LocalVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a fileystem if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
    */
  var path: Input[String] = js.native
}
object LocalVolumeSource {
  
  @scala.inline
  def apply(path: Input[String]): LocalVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVolumeSource]
  }
  
  @scala.inline
  implicit class LocalVolumeSourceMutableBuilder[Self <: LocalVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
