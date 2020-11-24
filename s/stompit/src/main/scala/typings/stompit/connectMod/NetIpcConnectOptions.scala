package typings.stompit.connectMod

import typings.node.netMod.IpcNetConnectOpts
import typings.stompit.stompitBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetIpcConnectOptions
  extends IpcNetConnectOpts
     with BaseConnectOptions
     with ConnectOptions {
  
  @JSName("ssl")
  var ssl_NetIpcConnectOptions: js.UndefOr[`false`] = js.native
}
object NetIpcConnectOptions {
  
  @scala.inline
  def apply(path: String): NetIpcConnectOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetIpcConnectOptions]
  }
  
  @scala.inline
  implicit class NetIpcConnectOptionsOps[Self <: NetIpcConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setSsl(value: `false`): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
  }
}
