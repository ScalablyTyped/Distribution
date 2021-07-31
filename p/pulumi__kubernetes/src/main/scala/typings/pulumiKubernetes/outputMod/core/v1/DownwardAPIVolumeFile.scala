package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DownwardAPIVolumeFile represents information to create the file containing the pod field
  */
trait DownwardAPIVolumeFile extends StObject {
  
  /**
    * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
    */
  var fieldRef: ObjectFieldSelector
  
  /**
    * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: Double
  
  /**
    * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
    */
  var path: String
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
    */
  var resourceFieldRef: ResourceFieldSelector
}
object DownwardAPIVolumeFile {
  
  @scala.inline
  def apply(fieldRef: ObjectFieldSelector, mode: Double, path: String, resourceFieldRef: ResourceFieldSelector): DownwardAPIVolumeFile = {
    val __obj = js.Dynamic.literal(fieldRef = fieldRef.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], resourceFieldRef = resourceFieldRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIVolumeFile]
  }
  
  @scala.inline
  implicit class DownwardAPIVolumeFileMutableBuilder[Self <: DownwardAPIVolumeFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldRef(value: ObjectFieldSelector): Self = StObject.set(x, "fieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceFieldRef(value: ResourceFieldSelector): Self = StObject.set(x, "resourceFieldRef", value.asInstanceOf[js.Any])
  }
}
