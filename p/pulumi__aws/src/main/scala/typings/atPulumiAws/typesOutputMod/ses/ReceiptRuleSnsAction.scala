package typings.atPulumiAws.typesOutputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleSnsAction extends js.Object {
  /**
    * The position of the action in the receipt rule
    */
  var position: Double
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: String
}

object ReceiptRuleSnsAction {
  @scala.inline
  def apply(position: Double, topicArn: String): ReceiptRuleSnsAction = {
    val __obj = js.Dynamic.literal(position = position, topicArn = topicArn)
  
    __obj.asInstanceOf[ReceiptRuleSnsAction]
  }
}

