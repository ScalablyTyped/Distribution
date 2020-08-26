package typings.pulumiAws.inputMod.lambda

import typings.pulumiPulumi.outputMod.Input
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
  var targetArn: Input[String] = js.native
}

object FunctionDeadLetterConfig {
  @scala.inline
  def apply(targetArn: Input[String]): FunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeadLetterConfig]
  }
  @scala.inline
  implicit class FunctionDeadLetterConfigOps[Self <: FunctionDeadLetterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetArn(value: Input[String]): Self = this.set("targetArn", value.asInstanceOf[js.Any])
  }
  
}

