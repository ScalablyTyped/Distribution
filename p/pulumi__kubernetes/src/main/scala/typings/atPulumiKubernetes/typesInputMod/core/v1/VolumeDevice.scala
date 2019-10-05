package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var devicePath: Input[String]
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  var name: Input[String]
}

object VolumeDevice {
  @scala.inline
  def apply(devicePath: Input[String], name: Input[String]): VolumeDevice = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VolumeDevice]
  }
}

