package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
  */
trait HostPathVolumeSource extends StObject {
  
  /**
    * Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var path: Input[String]
  
  /**
    * Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object HostPathVolumeSource {
  
  inline def apply(path: Input[String]): HostPathVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPathVolumeSource]
  }
  
  extension [Self <: HostPathVolumeSource](x: Self) {
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
