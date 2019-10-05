package typings.atPulumiAws.typesOutputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleWorkmailAction extends js.Object {
  /**
    * The ARN of the WorkMail organization
    */
  var organizationArn: String
  /**
    * The position of the action in the receipt rule
    */
  var position: Double
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.undefined
}

object ReceiptRuleWorkmailAction {
  @scala.inline
  def apply(organizationArn: String, position: Double, topicArn: String = null): ReceiptRuleWorkmailAction = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn, position = position)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[ReceiptRuleWorkmailAction]
  }
}

