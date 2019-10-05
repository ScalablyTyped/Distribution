package typings.atPulumiAws.typesInputMod.ses

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleSnsAction extends js.Object {
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double]
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: Input[String]
}

object ReceiptRuleSnsAction {
  @scala.inline
  def apply(position: Input[Double], topicArn: Input[String]): ReceiptRuleSnsAction = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReceiptRuleSnsAction]
  }
}

