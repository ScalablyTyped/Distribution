package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val devicePath: java.lang.String
  /**
    * Name of the attached volume
    */
  val name: java.lang.String
}

object AttachedVolume {
  @scala.inline
  def apply(devicePath: java.lang.String, name: java.lang.String): AttachedVolume = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("devicePath")(devicePath)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AttachedVolume]
  }
}

