package typings.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiptRuleBounceAction extends js.Object {
  
  /**
    * The message to send
    */
  var message: String = js.native
  
  /**
    * The position of the action in the receipt rule
    */
  var position: Double = js.native
  
  /**
    * The email address of the sender
    */
  var sender: String = js.native
  
  /**
    * The RFC 5321 SMTP reply code
    */
  var smtpReplyCode: String = js.native
  
  /**
    * The RFC 3463 SMTP enhanced status code
    */
  var statusCode: js.UndefOr[String] = js.native
  
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.native
}
object ReceiptRuleBounceAction {
  
  @scala.inline
  def apply(message: String, position: Double, sender: String, smtpReplyCode: String): ReceiptRuleBounceAction = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleBounceAction]
  }
  
  @scala.inline
  implicit class ReceiptRuleBounceActionOps[Self <: ReceiptRuleBounceAction] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: String): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmtpReplyCode(value: String): Self = this.set("smtpReplyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setTopicArn(value: String): Self = this.set("topicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicArn: Self = this.set("topicArn", js.undefined)
  }
}
