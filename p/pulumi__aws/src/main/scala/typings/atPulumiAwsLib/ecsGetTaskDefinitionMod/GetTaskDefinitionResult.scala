package typings
package atPulumiAwsLib.ecsGetTaskDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTaskDefinitionResult extends js.Object {
  /**
    * The family of this task definition
    */
  val family: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The Docker networking mode to use for the containers in this task.
    */
  val networkMode: java.lang.String
  /**
    * The revision of this task definition
    */
  val revision: scala.Double
  /**
    * The status of this task definition
    */
  val status: java.lang.String
  /**
    * The ARN of the IAM role that containers in this task can assume
    */
  val taskRoleArn: java.lang.String
}

