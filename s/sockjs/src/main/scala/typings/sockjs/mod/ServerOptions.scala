package typings.sockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends js.Object {
  
  var disconnect_delay: js.UndefOr[Double] = js.native
  
  var heartbeat_delay: js.UndefOr[Double] = js.native
  
  var jsessionid: js.UndefOr[js.Any] = js.native
  
  var log: js.UndefOr[js.Function2[/* severity */ String, /* message */ String, Unit]] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var response_limit: js.UndefOr[Double] = js.native
  
  var sockjs_url: js.UndefOr[String] = js.native
  
  var websocket: js.UndefOr[Boolean] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
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
    def setDisconnect_delay(value: Double): Self = this.set("disconnect_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisconnect_delay: Self = this.set("disconnect_delay", js.undefined)
    
    @scala.inline
    def setHeartbeat_delay(value: Double): Self = this.set("heartbeat_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeat_delay: Self = this.set("heartbeat_delay", js.undefined)
    
    @scala.inline
    def setJsessionid(value: js.Any): Self = this.set("jsessionid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsessionid: Self = this.set("jsessionid", js.undefined)
    
    @scala.inline
    def setLog(value: (/* severity */ String, /* message */ String) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setResponse_limit(value: Double): Self = this.set("response_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_limit: Self = this.set("response_limit", js.undefined)
    
    @scala.inline
    def setSockjs_url(value: String): Self = this.set("sockjs_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockjs_url: Self = this.set("sockjs_url", js.undefined)
    
    @scala.inline
    def setWebsocket(value: Boolean): Self = this.set("websocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsocket: Self = this.set("websocket", js.undefined)
  }
}
