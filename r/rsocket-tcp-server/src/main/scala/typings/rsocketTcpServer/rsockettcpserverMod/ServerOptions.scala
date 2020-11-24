package typings.rsocketTcpServer.rsockettcpserverMod

import typings.node.netMod.Server
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends js.Object {
  
  var host: js.UndefOr[String] = js.native
  
  var port: Double = js.native
  
  var serverFactory: js.UndefOr[js.Function1[/* onConnect */ js.Function1[/* socket */ Socket, Unit], Server]] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(port: Double): ServerOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setServerFactory(value: /* onConnect */ js.Function1[/* socket */ Socket, Unit] => Server): Self = this.set("serverFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteServerFactory: Self = this.set("serverFactory", js.undefined)
  }
}
