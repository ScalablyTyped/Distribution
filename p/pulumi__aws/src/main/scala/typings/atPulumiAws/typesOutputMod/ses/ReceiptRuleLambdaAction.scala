package typings.atPulumiAws.typesOutputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleLambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function to invoke
    */
  var functionArn: String
  /**
    * Event or RequestResponse
    */
  var invocationType: String
  /**
    * The position of the action in the receipt rule
    */
  var position: Double
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.undefined
}

object ReceiptRuleLambdaAction {
  @scala.inline
  def apply(functionArn: String, invocationType: String, position: Double, topicArn: String = null): ReceiptRuleLambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn, invocationType = invocationType, position = position)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[ReceiptRuleLambdaAction]
  }
}

