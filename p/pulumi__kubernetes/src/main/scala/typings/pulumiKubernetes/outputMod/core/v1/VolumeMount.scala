package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
@js.native
trait VolumeMount extends StObject {
  
  /**
    * Path within the container at which the volume should be mounted.  Must not contain ':'.
    */
  var mountPath: String = js.native
  
  /**
    * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
    */
  var mountPropagation: String = js.native
  
  /**
    * This must match the Name of a Volume.
    */
  var name: String = js.native
  
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
    */
  var readOnly: Boolean = js.native
  
  /**
    * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
    */
  var subPath: String = js.native
  
  /**
    * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
    */
  var subPathExpr: String = js.native
}
object VolumeMount {
  
  @scala.inline
  def apply(
    mountPath: String,
    mountPropagation: String,
    name: String,
    readOnly: Boolean,
    subPath: String,
    subPathExpr: String
  ): VolumeMount = {
    val __obj = js.Dynamic.literal(mountPath = mountPath.asInstanceOf[js.Any], mountPropagation = mountPropagation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], subPath = subPath.asInstanceOf[js.Any], subPathExpr = subPathExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeMount]
  }
  
  @scala.inline
  implicit class VolumeMountMutableBuilder[Self <: VolumeMount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPropagation(value: String): Self = StObject.set(x, "mountPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubPath(value: String): Self = StObject.set(x, "subPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubPathExpr(value: String): Self = StObject.set(x, "subPathExpr", value.asInstanceOf[js.Any])
  }
}
