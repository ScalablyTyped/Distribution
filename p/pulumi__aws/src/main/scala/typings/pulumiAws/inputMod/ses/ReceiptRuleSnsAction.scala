package typings.pulumiAws.inputMod.ses

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleSnsAction extends js.Object {
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double] = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: Input[String] = js.native
}

object ReceiptRuleSnsAction {
  @scala.inline
  def apply(position: Input[Double], topicArn: Input[String]): ReceiptRuleSnsAction = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleSnsAction]
  }
  @scala.inline
  implicit class ReceiptRuleSnsActionOps[Self <: ReceiptRuleSnsAction] (val x: Self) extends AnyVal {
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
    def setPosition(value: Input[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: Input[String]): Self = this.set("topicArn", value.asInstanceOf[js.Any])
  }
  
}

