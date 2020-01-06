package typings.atPulumiAws.ecsGetContainerDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerDefinitionArgs extends js.Object {
  /**
    * The name of the container definition
    */
  val containerName: String = js.native
  /**
    * The ARN of the task definition which contains the container
    */
  val taskDefinition: String = js.native
}

object GetContainerDefinitionArgs {
  @scala.inline
  def apply(containerName: String, taskDefinition: String): GetContainerDefinitionArgs = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetContainerDefinitionArgs]
  }
}

