package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AttachedVolume describes a volume attached to a node
  */
@js.native
trait AttachedVolume extends js.Object {
  /**
    * DevicePath represents the device path where the volume should be available
    */
  var devicePath: String = js.native
  /**
    * Name of the attached volume
    */
  var name: String = js.native
}

object AttachedVolume {
  @scala.inline
  def apply(devicePath: String, name: String): AttachedVolume = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedVolume]
  }
  @scala.inline
  implicit class AttachedVolumeOps[Self <: AttachedVolume] (val x: Self) extends AnyVal {
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
    def setDevicePath(value: String): Self = this.set("devicePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

