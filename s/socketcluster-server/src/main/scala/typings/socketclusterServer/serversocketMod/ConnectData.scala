package typings.socketclusterServer.serversocketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectData extends js.Object {
  
  var authError: js.UndefOr[Error] = js.native
  
  var id: String = js.native
  
  var isAuthenticated: Boolean = js.native
  
  var pingTimeout: Double = js.native
}
object ConnectData {
  
  @scala.inline
  def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double): ConnectData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectData]
  }
  
  @scala.inline
  implicit class ConnectDataOps[Self <: ConnectData] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAuthenticated(value: Boolean): Self = this.set("isAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingTimeout(value: Double): Self = this.set("pingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthError(value: Error): Self = this.set("authError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthError: Self = this.set("authError", js.undefined)
  }
}
