package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// fire
@js.native
trait FireParameters extends js.Object {
  
  var channel: String = js.native
  
  var message: js.Any = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var sendByPost: js.UndefOr[Boolean] = js.native
}
object FireParameters {
  
  @scala.inline
  def apply(channel: String, message: js.Any): FireParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FireParameters]
  }
  
  @scala.inline
  implicit class FireParametersOps[Self <: FireParameters] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setSendByPost(value: Boolean): Self = this.set("sendByPost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendByPost: Self = this.set("sendByPost", js.undefined)
  }
}
