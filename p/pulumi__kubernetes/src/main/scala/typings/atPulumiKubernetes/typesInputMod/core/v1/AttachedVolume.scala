package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var devicePath: Input[String]
  /**
    * Name of the attached volume
    */
  var name: Input[String]
}

object AttachedVolume {
  @scala.inline
  def apply(devicePath: Input[String], name: Input[String]): AttachedVolume = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachedVolume]
  }
}

