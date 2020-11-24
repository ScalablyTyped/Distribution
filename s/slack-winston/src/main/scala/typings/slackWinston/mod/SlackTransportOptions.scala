package typings.slackWinston.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlackTransportOptions extends js.Object {
  
  var channel: String = js.native
  
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  
  var domain: String = js.native
  
  // from winston-transport TransportStreamOptions
  var format: js.UndefOr[Format] = js.native
  
  var handleExceptions: js.UndefOr[Boolean] = js.native
  
  var icon_emoji: js.UndefOr[String] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var queueDelay: js.UndefOr[Double] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var token: String = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var webhook_url: String = js.native
}
object SlackTransportOptions {
  
  @scala.inline
  def apply(channel: String, domain: String, token: String, webhook_url: String): SlackTransportOptions = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webhook_url = webhook_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlackTransportOptions]
  }
  
  @scala.inline
  implicit class SlackTransportOptionsOps[Self <: SlackTransportOptions] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhook_url(value: String): Self = this.set("webhook_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setFormat(value: Format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHandleExceptions(value: Boolean): Self = this.set("handleExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleExceptions: Self = this.set("handleExceptions", js.undefined)
    
    @scala.inline
    def setIcon_emoji(value: String): Self = this.set("icon_emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon_emoji: Self = this.set("icon_emoji", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLog(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _): Self = this.set("log", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setLogv(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _): Self = this.set("logv", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLogv: Self = this.set("logv", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setQueueDelay(value: Double): Self = this.set("queueDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueDelay: Self = this.set("queueDelay", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
