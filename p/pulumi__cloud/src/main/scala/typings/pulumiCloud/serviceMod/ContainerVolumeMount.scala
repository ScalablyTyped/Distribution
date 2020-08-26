package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerVolumeMount extends js.Object {
  var containerPath: String = js.native
  var sourceVolume: Volume = js.native
}

object ContainerVolumeMount {
  @scala.inline
  def apply(containerPath: String, sourceVolume: Volume): ContainerVolumeMount = {
    val __obj = js.Dynamic.literal(containerPath = containerPath.asInstanceOf[js.Any], sourceVolume = sourceVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerVolumeMount]
  }
  @scala.inline
  implicit class ContainerVolumeMountOps[Self <: ContainerVolumeMount] (val x: Self) extends AnyVal {
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
    def setContainerPath(value: String): Self = this.set("containerPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceVolume(value: Volume): Self = this.set("sourceVolume", value.asInstanceOf[js.Any])
  }
  
}

