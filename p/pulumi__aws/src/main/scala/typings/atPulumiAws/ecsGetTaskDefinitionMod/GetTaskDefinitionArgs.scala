package typings.atPulumiAws.ecsGetTaskDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTaskDefinitionArgs extends js.Object {
  /**
    * The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, the ARN of the task definition to access to.
    */
  val taskDefinition: String = js.native
}

object GetTaskDefinitionArgs {
  @scala.inline
  def apply(taskDefinition: String): GetTaskDefinitionArgs = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTaskDefinitionArgs]
  }
}

