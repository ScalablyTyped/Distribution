package typings.pulumiAws.emailChannelMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailChannelState extends js.Object {
  
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The email address used to send emails from.
    */
  val fromAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: js.UndefOr[Input[String]] = js.native
  
  /**
    * Messages per second that can be sent.
    */
  val messagesPerSecond: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}
object EmailChannelState {
  
  @scala.inline
  def apply(): EmailChannelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailChannelState]
  }
  
  @scala.inline
  implicit class EmailChannelStateOps[Self <: EmailChannelState] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFromAddress(value: Input[String]): Self = this.set("fromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("fromAddress", js.undefined)
    
    @scala.inline
    def setIdentity(value: Input[String]): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setMessagesPerSecond(value: Input[Double]): Self = this.set("messagesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagesPerSecond: Self = this.set("messagesPerSecond", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
