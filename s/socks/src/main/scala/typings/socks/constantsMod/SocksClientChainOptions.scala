package typings.socks.constantsMod

import typings.socks.socksBooleans.`false`
import typings.socks.socksStrings.connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SocksClient chain connection options.
  */
@js.native
trait SocksClientChainOptions extends StObject {
  
  var command: connect = js.native
  
  var destination: SocksRemoteHost = js.native
  
  var proxies: js.Array[SocksProxy] = js.native
  
  var randomizeChain: js.UndefOr[`false`] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object SocksClientChainOptions {
  
  @scala.inline
  def apply(command: connect, destination: SocksRemoteHost, proxies: js.Array[SocksProxy]): SocksClientChainOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], proxies = proxies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientChainOptions]
  }
  
  @scala.inline
  implicit class SocksClientChainOptionsMutableBuilder[Self <: SocksClientChainOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: connect): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: SocksRemoteHost): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxies(value: js.Array[SocksProxy]): Self = StObject.set(x, "proxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxiesVarargs(value: SocksProxy*): Self = StObject.set(x, "proxies", js.Array(value :_*))
    
    @scala.inline
    def setRandomizeChain(value: `false`): Self = StObject.set(x, "randomizeChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomizeChainUndefined: Self = StObject.set(x, "randomizeChain", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
