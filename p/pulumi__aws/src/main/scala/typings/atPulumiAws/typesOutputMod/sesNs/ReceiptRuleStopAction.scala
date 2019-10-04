package typings.atPulumiAws.typesOutputMod.sesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleStopAction extends js.Object {
  /**
    * The position of the action in the receipt rule
    */
  var position: Double
  /**
    * The scope to apply
    */
  var scope: String
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.undefined
}

object ReceiptRuleStopAction {
  @scala.inline
  def apply(position: Double, scope: String, topicArn: String = null): ReceiptRuleStopAction = {
    val __obj = js.Dynamic.literal(position = position, scope = scope)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[ReceiptRuleStopAction]
  }
}

