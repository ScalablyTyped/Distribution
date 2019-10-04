package typings.atPulumiAws.typesInputMod.sesNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleLambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function to invoke
    */
  var functionArn: Input[String]
  /**
    * Event or RequestResponse
    */
  var invocationType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double]
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[Input[String]] = js.undefined
}

object ReceiptRuleLambdaAction {
  @scala.inline
  def apply(
    functionArn: Input[String],
    position: Input[Double],
    invocationType: Input[String] = null,
    topicArn: Input[String] = null
  ): ReceiptRuleLambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (invocationType != null) __obj.updateDynamic("invocationType")(invocationType.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleLambdaAction]
  }
}

