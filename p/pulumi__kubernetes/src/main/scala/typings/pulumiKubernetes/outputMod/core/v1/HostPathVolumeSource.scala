package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
  */
@js.native
trait HostPathVolumeSource extends StObject {
  
  /**
    * Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var path: String = js.native
  
  /**
    * Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var `type`: String = js.native
}
object HostPathVolumeSource {
  
  @scala.inline
  def apply(path: String, `type`: String): HostPathVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPathVolumeSource]
  }
  
  @scala.inline
  implicit class HostPathVolumeSourceMutableBuilder[Self <: HostPathVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
