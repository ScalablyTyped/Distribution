package typings
package atPulumiAwsLib.ecsGetContainerDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContainerDefinitionArgs extends js.Object {
  /**
    * The name of the container definition
    */
  val containerName: java.lang.String
  /**
    * The ARN of the task definition which contains the container
    */
  val taskDefinition: java.lang.String
}

object GetContainerDefinitionArgs {
  @scala.inline
  def apply(containerName: java.lang.String, taskDefinition: java.lang.String): GetContainerDefinitionArgs = {
    val __obj = js.Dynamic.literal(containerName = containerName, taskDefinition = taskDefinition)
  
    __obj.asInstanceOf[GetContainerDefinitionArgs]
  }
}

