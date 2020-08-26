package typings.pulumiAws.inputMod.ses

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleWorkmailAction extends js.Object {
  /**
    * The ARN of the WorkMail organization
    */
  var organizationArn: Input[String] = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double] = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[Input[String]] = js.native
}

object ReceiptRuleWorkmailAction {
  @scala.inline
  def apply(organizationArn: Input[String], position: Input[Double]): ReceiptRuleWorkmailAction = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleWorkmailAction]
  }
  @scala.inline
  implicit class ReceiptRuleWorkmailActionOps[Self <: ReceiptRuleWorkmailAction] (val x: Self) extends AnyVal {
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
    def setOrganizationArn(value: Input[String]): Self = this.set("organizationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Input[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: Input[String]): Self = this.set("topicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicArn: Self = this.set("topicArn", js.undefined)
  }
  
}

