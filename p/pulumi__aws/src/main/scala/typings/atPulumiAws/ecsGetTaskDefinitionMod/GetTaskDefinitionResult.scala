package typings.atPulumiAws.ecsGetTaskDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTaskDefinitionResult extends js.Object {
  /**
    * The family of this task definition
    */
  val family: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The Docker networking mode to use for the containers in this task.
    */
  val networkMode: String
  /**
    * The revision of this task definition
    */
  val revision: Double
  /**
    * The status of this task definition
    */
  val status: String
  val taskDefinition: String
  /**
    * The ARN of the IAM role that containers in this task can assume
    */
  val taskRoleArn: String
}

object GetTaskDefinitionResult {
  @scala.inline
  def apply(
    family: String,
    id: String,
    networkMode: String,
    revision: Double,
    status: String,
    taskDefinition: String,
    taskRoleArn: String
  ): GetTaskDefinitionResult = {
    val __obj = js.Dynamic.literal(family = family, id = id, networkMode = networkMode, revision = revision, status = status, taskDefinition = taskDefinition, taskRoleArn = taskRoleArn)
  
    __obj.asInstanceOf[GetTaskDefinitionResult]
  }
}

