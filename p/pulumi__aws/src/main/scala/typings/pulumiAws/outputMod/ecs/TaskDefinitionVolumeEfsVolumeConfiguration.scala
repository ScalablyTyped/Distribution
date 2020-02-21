package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionVolumeEfsVolumeConfiguration extends js.Object {
  /**
    * The ID of the EFS File System.
    */
  var fileSystemId: String = js.native
  /**
    * The path to mount on the host
    */
  var rootDirectory: js.UndefOr[String] = js.native
}

object TaskDefinitionVolumeEfsVolumeConfiguration {
  @scala.inline
  def apply(fileSystemId: String, rootDirectory: String = null): TaskDefinitionVolumeEfsVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeEfsVolumeConfiguration]
  }
}

