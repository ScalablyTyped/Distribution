package typings.atPulumiAws.typesOutputMod.ecsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionVolume extends js.Object {
  /**
    * Used to configure a docker volume
    */
  var dockerVolumeConfiguration: js.UndefOr[TaskDefinitionVolumeDockerVolumeConfiguration] = js.undefined
  /**
    * The path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
    */
  var hostPath: js.UndefOr[String] = js.undefined
  /**
    * The name of the volume. This name is referenced in the `sourceVolume`
    * parameter of container definition in the `mountPoints` section.
    */
  var name: String
}

object TaskDefinitionVolume {
  @scala.inline
  def apply(
    name: String,
    dockerVolumeConfiguration: TaskDefinitionVolumeDockerVolumeConfiguration = null,
    hostPath: String = null
  ): TaskDefinitionVolume = {
    val __obj = js.Dynamic.literal(name = name)
    if (dockerVolumeConfiguration != null) __obj.updateDynamic("dockerVolumeConfiguration")(dockerVolumeConfiguration)
    if (hostPath != null) __obj.updateDynamic("hostPath")(hostPath)
    __obj.asInstanceOf[TaskDefinitionVolume]
  }
}

