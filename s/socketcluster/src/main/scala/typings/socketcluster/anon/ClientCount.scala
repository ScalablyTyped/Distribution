package typings.socketcluster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCount extends js.Object {
  
  var clientCount: js.Any = js.native
  
  var httpRPM: Double = js.native
  
  var wsRPM: Double = js.native
}
object ClientCount {
  
  @scala.inline
  def apply(clientCount: js.Any, httpRPM: Double, wsRPM: Double): ClientCount = {
    val __obj = js.Dynamic.literal(clientCount = clientCount.asInstanceOf[js.Any], httpRPM = httpRPM.asInstanceOf[js.Any], wsRPM = wsRPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCount]
  }
  
  @scala.inline
  implicit class ClientCountOps[Self <: ClientCount] (val x: Self) extends AnyVal {
    
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
    def setClientCount(value: js.Any): Self = this.set("clientCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRPM(value: Double): Self = this.set("httpRPM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsRPM(value: Double): Self = this.set("wsRPM", value.asInstanceOf[js.Any])
  }
}
