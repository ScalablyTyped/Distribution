package typings.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleLambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function to invoke
    */
  var functionArn: String = js.native
  /**
    * Event or RequestResponse
    */
  var invocationType: String = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Double = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.native
}

object ReceiptRuleLambdaAction {
  @scala.inline
  def apply(functionArn: String, invocationType: String, position: Double): ReceiptRuleLambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], invocationType = invocationType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleLambdaAction]
  }
  @scala.inline
  implicit class ReceiptRuleLambdaActionOps[Self <: ReceiptRuleLambdaAction] (val x: Self) extends AnyVal {
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
    def setFunctionArn(value: String): Self = this.set("functionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvocationType(value: String): Self = this.set("invocationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: String): Self = this.set("topicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicArn: Self = this.set("topicArn", js.undefined)
  }
  
}

