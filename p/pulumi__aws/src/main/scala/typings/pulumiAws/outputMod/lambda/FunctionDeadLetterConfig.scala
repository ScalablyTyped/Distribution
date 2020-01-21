package typings.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDeadLetterConfig extends js.Object {
  /**
    * The ARN of an SNS topic or SQS queue to notify when an invocation fails. If this
    * option is used, the function's IAM role must be granted suitable access to write to the target object,
    * which means allowing either the `sns:Publish` or `sqs:SendMessage` action on this ARN, depending on
    * which service is targeted.
    */
  var targetArn: String = js.native
}

object FunctionDeadLetterConfig {
  @scala.inline
  def apply(targetArn: String): FunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionDeadLetterConfig]
  }
}

