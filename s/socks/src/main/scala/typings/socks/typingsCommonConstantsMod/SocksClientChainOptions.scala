package typings.socks.typingsCommonConstantsMod

import typings.socks.socksBooleans.`false`
import typings.socks.socksStrings.connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SocksClient chain connection options.
  */
trait SocksClientChainOptions extends StObject {
  
  var command: connect
  
  var destination: SocksRemoteHost
  
  var proxies: js.Array[SocksProxy]
  
  var randomizeChain: js.UndefOr[`false`] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object SocksClientChainOptions {
  
  inline def apply(destination: SocksRemoteHost, proxies: js.Array[SocksProxy]): SocksClientChainOptions = {
    val __obj = js.Dynamic.literal(command = "connect", destination = destination.asInstanceOf[js.Any], proxies = proxies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientChainOptions]
  }
  
  extension [Self <: SocksClientChainOptions](x: Self) {
    
    inline def setCommand(value: connect): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: SocksRemoteHost): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setProxies(value: js.Array[SocksProxy]): Self = StObject.set(x, "proxies", value.asInstanceOf[js.Any])
    
    inline def setProxiesVarargs(value: SocksProxy*): Self = StObject.set(x, "proxies", js.Array(value*))
    
    inline def setRandomizeChain(value: `false`): Self = StObject.set(x, "randomizeChain", value.asInstanceOf[js.Any])
    
    inline def setRandomizeChainUndefined: Self = StObject.set(x, "randomizeChain", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
