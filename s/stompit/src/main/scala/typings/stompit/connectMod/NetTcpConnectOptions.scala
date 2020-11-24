package typings.stompit.connectMod

import typings.node.netMod.TcpNetConnectOpts
import typings.stompit.stompitBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetTcpConnectOptions
  extends TcpNetConnectOpts
     with BaseConnectOptions
     with ConnectOptions {
  
  @JSName("ssl")
  var ssl_NetTcpConnectOptions: js.UndefOr[`false`] = js.native
}
object NetTcpConnectOptions {
  
  @scala.inline
  def apply(port: Double): NetTcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetTcpConnectOptions]
  }
  
  @scala.inline
  implicit class NetTcpConnectOptionsOps[Self <: NetTcpConnectOptions] (val x: Self) extends AnyVal {
    
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
