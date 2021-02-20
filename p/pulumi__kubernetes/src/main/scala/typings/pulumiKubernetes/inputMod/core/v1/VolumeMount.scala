package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var mountPath: Input[String] = js.native
  
  /**
    * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
    */
  var mountPropagation: js.UndefOr[Input[String]] = js.native
  
  /**
    * This must match the Name of a Volume.
    */
  var name: Input[String] = js.native
  
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
    */
  var subPath: js.UndefOr[Input[String]] = js.native
  
  /**
    * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
    */
  var subPathExpr: js.UndefOr[Input[String]] = js.native
}
object VolumeMount {
  
  @scala.inline
  def apply(mountPath: Input[String], name: Input[String]): VolumeMount = {
    val __obj = js.Dynamic.literal(mountPath = mountPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeMount]
  }
  
  @scala.inline
  implicit class VolumeMountMutableBuilder[Self <: VolumeMount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountPath(value: Input[String]): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPropagation(value: Input[String]): Self = StObject.set(x, "mountPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPropagationUndefined: Self = StObject.set(x, "mountPropagation", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSubPath(value: Input[String]): Self = StObject.set(x, "subPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubPathExpr(value: Input[String]): Self = StObject.set(x, "subPathExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubPathExprUndefined: Self = StObject.set(x, "subPathExpr", js.undefined)
    
    @scala.inline
    def setSubPathUndefined: Self = StObject.set(x, "subPath", js.undefined)
  }
}
