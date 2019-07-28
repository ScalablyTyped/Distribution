package typings.atPulumiCloud.serviceMod

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
    val __obj = js.Dynamic.literal(containerPath = containerPath, sourceVolume = sourceVolume)
  
    __obj.asInstanceOf[ContainerVolumeMount]
  }
}

