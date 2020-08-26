package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * volumeDevice describes a mapping of a raw block device within a container.
  */
@js.native
trait VolumeDevice extends js.Object {
  /**
    * devicePath is the path inside of the container that the device will be mapped to.
    */
  var devicePath: Input[String] = js.native
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  var name: Input[String] = js.native
}

object VolumeDevice {
  @scala.inline
  def apply(devicePath: Input[String], name: Input[String]): VolumeDevice = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeDevice]
  }
  @scala.inline
  implicit class VolumeDeviceOps[Self <: VolumeDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDevicePath(value: Input[String]): Self = this.set("devicePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

