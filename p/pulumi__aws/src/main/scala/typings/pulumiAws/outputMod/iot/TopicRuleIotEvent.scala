package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleIotEvent extends js.Object {
  /**
    * The name of the AWS IoT Events input.
    */
  var inputName: String = js.native
  /**
    * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String = js.native
}

object TopicRuleIotEvent {
  @scala.inline
  def apply(inputName: String, roleArn: String): TopicRuleIotEvent = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleIotEvent]
  }
  @scala.inline
  implicit class TopicRuleIotEventOps[Self <: TopicRuleIotEvent] (val x: Self) extends AnyVal {
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
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
  
}

