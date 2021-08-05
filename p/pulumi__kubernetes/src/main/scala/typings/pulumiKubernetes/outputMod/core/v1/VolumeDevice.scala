package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * volumeDevice describes a mapping of a raw block device within a container.
  */
trait VolumeDevice extends StObject {
  
  /**
    * devicePath is the path inside of the container that the device will be mapped to.
    */
  var devicePath: String
  
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  var name: String
}
object VolumeDevice {
  
  inline def apply(devicePath: String, name: String): VolumeDevice = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeDevice]
  }
  
  extension [Self <: VolumeDevice](x: Self) {
    
    inline def setDevicePath(value: String): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
