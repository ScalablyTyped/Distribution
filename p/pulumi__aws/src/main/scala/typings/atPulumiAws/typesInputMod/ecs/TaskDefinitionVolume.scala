package typings.atPulumiAws.typesInputMod.ecs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionVolume extends js.Object {
  /**
    * Used to configure a docker volume
    */
  var dockerVolumeConfiguration: js.UndefOr[Input[TaskDefinitionVolumeDockerVolumeConfiguration]] = js.undefined
  /**
    * The path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
    */
  var hostPath: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the volume. This name is referenced in the `sourceVolume`
    * parameter of container definition in the `mountPoints` section.
    */
  var name: Input[String]
}

object TaskDefinitionVolume {
  @scala.inline
  def apply(
    name: Input[String],
    dockerVolumeConfiguration: Input[TaskDefinitionVolumeDockerVolumeConfiguration] = null,
    hostPath: Input[String] = null
  ): TaskDefinitionVolume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (dockerVolumeConfiguration != null) __obj.updateDynamic("dockerVolumeConfiguration")(dockerVolumeConfiguration.asInstanceOf[js.Any])
    if (hostPath != null) __obj.updateDynamic("hostPath")(hostPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolume]
  }
}

