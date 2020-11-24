package typings.pulumiAws.smsChannelMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmsChannelArgs extends js.Object {
  
  /**
    * The application ID.
    */
  val applicationId: Input[String] = js.native
  
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Sender identifier of your messages.
    */
  val senderId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: js.UndefOr[Input[String]] = js.native
}
object SmsChannelArgs {
  
  @scala.inline
  def apply(applicationId: Input[String]): SmsChannelArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsChannelArgs]
  }
  
  @scala.inline
  implicit class SmsChannelArgsOps[Self <: SmsChannelArgs] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setSenderId(value: Input[String]): Self = this.set("senderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderId: Self = this.set("senderId", js.undefined)
    
    @scala.inline
    def setShortCode(value: Input[String]): Self = this.set("shortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortCode: Self = this.set("shortCode", js.undefined)
  }
}
