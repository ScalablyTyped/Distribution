package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRequirements extends js.Object {
  /**
    * The type of resource to assign to a container. The only supported value is GPU.
    */
  var `type`: String = js.native
  /**
    * The number of physical GPUs the Amazon ECS container agent will reserve for the container.
    * The number of GPUs reserved for all containers in a task should not exceed the number of
    * available GPUs on the container instance the task is launched on.
    */
  var value: String = js.native
}

object ResourceRequirements {
  @scala.inline
  def apply(`type`: String, value: String): ResourceRequirements = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirements]
  }
}

