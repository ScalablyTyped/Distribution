package typings.pulumiAws.identityNotificationTopicMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityNotificationTopicState extends js.Object {
  
  /**
    * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
    */
  val identity: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
    */
  val includeOriginalHeaders: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
    */
  val notificationType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
    */
  val topicArn: js.UndefOr[Input[String]] = js.native
}
object IdentityNotificationTopicState {
  
  @scala.inline
  def apply(): IdentityNotificationTopicState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityNotificationTopicState]
  }
  
  @scala.inline
  implicit class IdentityNotificationTopicStateOps[Self <: IdentityNotificationTopicState] (val x: Self) extends AnyVal {
    
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
    def setIdentity(value: Input[String]): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setIncludeOriginalHeaders(value: Input[Boolean]): Self = this.set("includeOriginalHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeOriginalHeaders: Self = this.set("includeOriginalHeaders", js.undefined)
    
    @scala.inline
    def setNotificationType(value: Input[String]): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationType: Self = this.set("notificationType", js.undefined)
    
    @scala.inline
    def setTopicArn(value: Input[String]): Self = this.set("topicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicArn: Self = this.set("topicArn", js.undefined)
  }
}
