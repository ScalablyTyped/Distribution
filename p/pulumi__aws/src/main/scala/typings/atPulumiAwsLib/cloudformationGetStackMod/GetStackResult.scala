package typings
package atPulumiAwsLib.cloudformationGetStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackResult extends js.Object {
  /**
    * A list of capabilities
    */
  val capabilities: js.Array[java.lang.String]
  /**
    * Description of the stack
    */
  val description: java.lang.String
  /**
    * Whether the rollback of the stack is disabled when stack creation fails
    */
  val disableRollback: scala.Boolean
  /**
    * The ARN of the IAM role used to create the stack.
    */
  val iamRoleArn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A list of SNS topic ARNs to publish stack related events
    */
  val notificationArns: js.Array[java.lang.String]
  /**
    * A map of outputs from the stack.
    */
  val outputs: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * A map of parameters that specify input parameters for the stack.
    */
  val parameters: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * A map of tags associated with this stack.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Structure containing the template body.
    */
  val templateBody: java.lang.String
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`
    */
  val timeoutInMinutes: scala.Double
}

object GetStackResult {
  @scala.inline
  def apply(
    capabilities: js.Array[java.lang.String],
    description: java.lang.String,
    disableRollback: scala.Boolean,
    iamRoleArn: java.lang.String,
    id: java.lang.String,
    notificationArns: js.Array[java.lang.String],
    outputs: org.scalablytyped.runtime.StringDictionary[js.Any],
    parameters: org.scalablytyped.runtime.StringDictionary[js.Any],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    templateBody: java.lang.String,
    timeoutInMinutes: scala.Double
  ): GetStackResult = {
    val __obj = js.Dynamic.literal(capabilities = capabilities, description = description, disableRollback = disableRollback, iamRoleArn = iamRoleArn, id = id, notificationArns = notificationArns, outputs = outputs, parameters = parameters, tags = tags, templateBody = templateBody, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[GetStackResult]
  }
}

