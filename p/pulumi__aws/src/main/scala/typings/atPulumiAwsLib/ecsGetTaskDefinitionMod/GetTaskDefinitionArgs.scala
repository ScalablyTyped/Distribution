package typings
package atPulumiAwsLib.ecsGetTaskDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTaskDefinitionArgs extends js.Object {
  /**
    * The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, the ARN of the task definition to access to.
    */
  val taskDefinition: java.lang.String
}

object GetTaskDefinitionArgs {
  @scala.inline
  def apply(taskDefinition: java.lang.String): GetTaskDefinitionArgs = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition)
  
    __obj.asInstanceOf[GetTaskDefinitionArgs]
  }
}

