package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerVolumeMount extends StObject {
  
  var containerPath: String
  
  var sourceVolume: Volume
}
object ContainerVolumeMount {
  
  inline def apply(containerPath: String, sourceVolume: Volume): ContainerVolumeMount = {
    val __obj = js.Dynamic.literal(containerPath = containerPath.asInstanceOf[js.Any], sourceVolume = sourceVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerVolumeMount]
  }
  
  extension [Self <: ContainerVolumeMount](x: Self) {
    
    inline def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
    
    inline def setSourceVolume(value: Volume): Self = StObject.set(x, "sourceVolume", value.asInstanceOf[js.Any])
  }
}
