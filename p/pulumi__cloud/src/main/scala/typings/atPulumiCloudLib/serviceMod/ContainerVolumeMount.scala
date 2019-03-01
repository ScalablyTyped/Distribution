package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerVolumeMount extends js.Object {
  var containerPath: java.lang.String
  var sourceVolume: Volume
}

object ContainerVolumeMount {
  @scala.inline
  def apply(containerPath: java.lang.String, sourceVolume: Volume): ContainerVolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerPath")(containerPath)
    __obj.updateDynamic("sourceVolume")(sourceVolume)
    __obj.asInstanceOf[ContainerVolumeMount]
  }
}

