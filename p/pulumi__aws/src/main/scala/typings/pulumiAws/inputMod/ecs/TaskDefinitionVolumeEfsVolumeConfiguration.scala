package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionVolumeEfsVolumeConfiguration extends js.Object {
  /**
    * The ID of the EFS File System.
    */
  var fileSystemId: Input[String] = js.native
  /**
    * The path to mount on the host
    */
  var rootDirectory: js.UndefOr[Input[String]] = js.native
}

object TaskDefinitionVolumeEfsVolumeConfiguration {
  @scala.inline
  def apply(fileSystemId: Input[String], rootDirectory: Input[String] = null): TaskDefinitionVolumeEfsVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeEfsVolumeConfiguration]
  }
}

