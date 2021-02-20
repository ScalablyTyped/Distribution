package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AttachedVolume describes a volume attached to a node
  */
@js.native
trait AttachedVolume extends StObject {
  
  /**
    * DevicePath represents the device path where the volume should be available
    */
  var devicePath: Input[String] = js.native
  
  /**
    * Name of the attached volume
    */
  var name: Input[String] = js.native
}
object AttachedVolume {
  
  @scala.inline
  def apply(devicePath: Input[String], name: Input[String]): AttachedVolume = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedVolume]
  }
  
  @scala.inline
  implicit class AttachedVolumeMutableBuilder[Self <: AttachedVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePath(value: Input[String]): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
