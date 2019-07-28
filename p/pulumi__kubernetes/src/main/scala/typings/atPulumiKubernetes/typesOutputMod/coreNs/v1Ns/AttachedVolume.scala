package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AttachedVolume describes a volume attached to a node
  */
trait AttachedVolume extends js.Object {
  /**
    * DevicePath represents the device path where the volume should be available
    */
  val devicePath: String
  /**
    * Name of the attached volume
    */
  val name: String
}

object AttachedVolume {
  @scala.inline
  def apply(devicePath: String, name: String): AttachedVolume = {
    val __obj = js.Dynamic.literal(devicePath = devicePath, name = name)
  
    __obj.asInstanceOf[AttachedVolume]
  }
}

