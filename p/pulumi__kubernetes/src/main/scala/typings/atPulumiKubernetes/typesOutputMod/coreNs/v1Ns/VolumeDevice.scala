package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * volumeDevice describes a mapping of a raw block device within a container.
  */
trait VolumeDevice extends js.Object {
  /**
    * devicePath is the path inside of the container that the device will be mapped to.
    */
  val devicePath: String
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  val name: String
}

object VolumeDevice {
  @scala.inline
  def apply(devicePath: String, name: String): VolumeDevice = {
    val __obj = js.Dynamic.literal(devicePath = devicePath, name = name)
  
    __obj.asInstanceOf[VolumeDevice]
  }
}

