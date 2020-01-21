package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerVolumeMount extends js.Object {
  var containerPath: String
  var sourceVolume: Volume
}

object ContainerVolumeMount {
  @scala.inline
  def apply(containerPath: String, sourceVolume: Volume): ContainerVolumeMount = {
    val __obj = js.Dynamic.literal(containerPath = containerPath.asInstanceOf[js.Any], sourceVolume = sourceVolume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerVolumeMount]
  }
}

