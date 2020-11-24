package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends js.Object {
  
  var callback: js.UndefOr[js.Function] = js.native
  
  var jsonp: js.UndefOr[Boolean] = js.native
  
  var pingInterval: js.UndefOr[Double] = js.native
  
  var transport: js.UndefOr[String | js.Array[String] | Transport] = js.native
  
  var waitForPageLoad: js.UndefOr[Boolean] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setJsonp(value: Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setPingInterval(value: Double): Self = this.set("pingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingInterval: Self = this.set("pingInterval", js.undefined)
    
    @scala.inline
    def setTransportVarargs(value: String*): Self = this.set("transport", js.Array(value :_*))
    
    @scala.inline
    def setTransport(value: String | js.Array[String] | Transport): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setWaitForPageLoad(value: Boolean): Self = this.set("waitForPageLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForPageLoad: Self = this.set("waitForPageLoad", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
