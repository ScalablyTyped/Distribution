package typings.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSubscriberOptions extends js.Object {
  
  var SubscribeChannels: js.UndefOr[String] = js.native
  
  var UnsubscribeChannels: js.UndefOr[String] = js.native
}
object UpdateSubscriberOptions {
  
  @scala.inline
  def apply(): UpdateSubscriberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriberOptions]
  }
  
  @scala.inline
  implicit class UpdateSubscriberOptionsOps[Self <: UpdateSubscriberOptions] (val x: Self) extends AnyVal {
    
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
    def setSubscribeChannels(value: String): Self = this.set("SubscribeChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribeChannels: Self = this.set("SubscribeChannels", js.undefined)
    
    @scala.inline
    def setUnsubscribeChannels(value: String): Self = this.set("UnsubscribeChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsubscribeChannels: Self = this.set("UnsubscribeChannels", js.undefined)
  }
}
