package typings.atPulumiAws.cloudformationGetStackMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackResult extends js.Object {
  /**
    * A list of capabilities
    */
  val capabilities: js.Array[String]
  /**
    * Description of the stack
    */
  val description: String
  /**
    * Whether the rollback of the stack is disabled when stack creation fails
    */
  val disableRollback: Boolean
  /**
    * The ARN of the IAM role used to create the stack.
    */
  val iamRoleArn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * A list of SNS topic ARNs to publish stack related events
    */
  val notificationArns: js.Array[String]
  /**
    * A map of outputs from the stack.
    */
  val outputs: StringDictionary[js.Any]
  /**
    * A map of parameters that specify input parameters for the stack.
    */
  val parameters: StringDictionary[js.Any]
  /**
    * A map of tags associated with this stack.
    */
  val tags: StringDictionary[js.Any]
  /**
    * Structure containing the template body.
    */
  val templateBody: String
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`
    */
  val timeoutInMinutes: Double
}

object GetStackResult {
  @scala.inline
  def apply(
    capabilities: js.Array[String],
    description: String,
    disableRollback: Boolean,
    iamRoleArn: String,
    id: String,
    name: String,
    notificationArns: js.Array[String],
    outputs: StringDictionary[js.Any],
    parameters: StringDictionary[js.Any],
    tags: StringDictionary[js.Any],
    templateBody: String,
    timeoutInMinutes: Double
  ): GetStackResult = {
    val __obj = js.Dynamic.literal(capabilities = capabilities, description = description, disableRollback = disableRollback, iamRoleArn = iamRoleArn, id = id, name = name, notificationArns = notificationArns, outputs = outputs, parameters = parameters, tags = tags, templateBody = templateBody, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[GetStackResult]
  }
}

