package typings.atPulumiAws.typesInputMod.ses

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleWorkmailAction extends js.Object {
  /**
    * The ARN of the WorkMail organization
    */
  var organizationArn: Input[String]
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double]
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[Input[String]] = js.undefined
}

object ReceiptRuleWorkmailAction {
  @scala.inline
  def apply(organizationArn: Input[String], position: Input[Double], topicArn: Input[String] = null): ReceiptRuleWorkmailAction = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleWorkmailAction]
  }
}

