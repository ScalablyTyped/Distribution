package typings.socks.constantsMod

import typings.node.netMod.SocketConnectOpts
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SocksClient connection options.
  */
@js.native
trait SocksClientOptions extends StObject {
  
  var command: SocksCommandOption = js.native
  
  var destination: SocksRemoteHost = js.native
  
  var existing_socket: js.UndefOr[Duplex] = js.native
  
  var proxy: SocksProxy = js.native
  
  var set_tcp_nodelay: js.UndefOr[Boolean] = js.native
  
  var socket_options: js.UndefOr[SocketConnectOpts] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object SocksClientOptions {
  
  @scala.inline
  def apply(command: SocksCommandOption, destination: SocksRemoteHost, proxy: SocksProxy): SocksClientOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientOptions]
  }
  
  @scala.inline
  implicit class SocksClientOptionsMutableBuilder[Self <: SocksClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: SocksCommandOption): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: SocksRemoteHost): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExisting_socket(value: Duplex): Self = StObject.set(x, "existing_socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExisting_socketUndefined: Self = StObject.set(x, "existing_socket", js.undefined)
    
    @scala.inline
    def setProxy(value: SocksProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet_tcp_nodelay(value: Boolean): Self = StObject.set(x, "set_tcp_nodelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet_tcp_nodelayUndefined: Self = StObject.set(x, "set_tcp_nodelay", js.undefined)
    
    @scala.inline
    def setSocket_options(value: SocketConnectOpts): Self = StObject.set(x, "socket_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocket_optionsUndefined: Self = StObject.set(x, "socket_options", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
